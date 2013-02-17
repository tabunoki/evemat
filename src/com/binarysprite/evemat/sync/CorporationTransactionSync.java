package com.binarysprite.evemat.sync;

import java.sql.Timestamp;
import java.util.Set;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.beimin.eveapi.corporation.wallet.transactions.WalletTransactionsParser;
import com.beimin.eveapi.shared.wallet.transactions.ApiWalletTransaction;
import com.beimin.eveapi.shared.wallet.transactions.WalletTransactionsResponse;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.WalletTransaction;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

public class CorporationTransactionSync implements EveSynchronizer {
	
	/**
	 * 
	 */
	private static final int[] ACCOUNT_KEYS = {1000, 1001, 1002, 1003, 1004, 1005, 1006};
	
	/**
	 * 
	 */
	private final ApiAuthorization authorization;

	/**
	 * 
	 * @param authorization
	 */
	public CorporationTransactionSync(ApiAuthorization authorization) {
		super();
		this.authorization = authorization;
	}

	@Override
	public void synchronize() throws ApiException {
		
		WalletTransactionsResponse transactionsResponse = null;
		
		for (int accountKey : ACCOUNT_KEYS) {
			
			WalletTransactionsParser transactionsParser = WalletTransactionsParser.getInstance();
			
			transactionsResponse = transactionsParser.getResponse(authorization, accountKey);
			
			long fromID = importCorpWalletTransaction(transactionsResponse.getAll(), accountKey, authorization);
			
			while (fromID > 0) {
				
				transactionsResponse = transactionsParser.getResponse(authorization, accountKey, fromID);
				
				fromID = importCorpWalletTransaction(transactionsResponse.getAll(), accountKey, authorization);
			}
		}

	}

	/**
	 * トランザクションをデータベースへ追加します。
	 * @param transactions
	 * @param accountKey
	 * @param authorization
	 * @return
	 */
	private long importCorpWalletTransaction(Set<ApiWalletTransaction> transactions, int accountKey, ApiAuthorization authorization) {
		
		if (transactions == null || transactions.size() == 0) {
			return 0;
		}
		
		long lowestTransactionID = Long.MAX_VALUE;
		
		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			// トランザクションの開始
			transaction.begin();

			WalletTransactionDao dao = new WalletTransactionDaoImpl();

			for (ApiWalletTransaction apiWalletTransaction : transactions) {
				
				if (dao.selectById(apiWalletTransaction.getTransactionID()) != null) {
					continue;
				}

				WalletTransaction walletTransaction = new WalletTransaction();
				walletTransaction.setTransactionId(apiWalletTransaction.getTransactionID());
				walletTransaction.setTransactionDateTime(new Timestamp(apiWalletTransaction.getTransactionDateTime().getTime()));
				walletTransaction.setTypeId(apiWalletTransaction.getTypeID());
				walletTransaction.setTypeName(apiWalletTransaction.getTypeName());
				walletTransaction.setQuantity(apiWalletTransaction.getQuantity());
				walletTransaction.setPrice(apiWalletTransaction.getPrice());
				walletTransaction.setClientId(apiWalletTransaction.getClientID());
				walletTransaction.setClientName(apiWalletTransaction.getClientName());
				walletTransaction.setStationId(apiWalletTransaction.getStationID());
				walletTransaction.setStationName(apiWalletTransaction.getStationName());
				walletTransaction.setTransactionType(apiWalletTransaction.getTransactionType());
				walletTransaction.setTransactionFor(apiWalletTransaction.getTransactionFor());
				walletTransaction.setAccountKey(accountKey);
				walletTransaction.setCharacterId(authorization.getCharacterID());
				
				
				dao.insert(walletTransaction);
				
				
				if (apiWalletTransaction.getTransactionID() < lowestTransactionID) {
					lowestTransactionID = apiWalletTransaction.getTransactionID();
				}
			}

			transaction.commit();

		} finally {
			transaction.rollback();
		}

		if (lowestTransactionID > 0 && lowestTransactionID < Long.MAX_VALUE) {
			return lowestTransactionID;
		} else {
			return 0;
		}
	}
}
