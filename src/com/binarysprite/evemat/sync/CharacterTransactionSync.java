package com.binarysprite.evemat.sync;

import java.sql.Timestamp;
import java.util.Set;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.beimin.eveapi.character.wallet.transactions.WalletTransactionsParser;
import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.beimin.eveapi.shared.wallet.transactions.ApiWalletTransaction;
import com.beimin.eveapi.shared.wallet.transactions.WalletTransactionsResponse;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.WalletTransaction;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

public class CharacterTransactionSync implements EveSynchronizer {
	
	/**
	 * アカウントキー（個人の場合は1000固定）です。
	 */
	private static final int ACCOUNT_KEY = 1000;
	
	/**
	 * 
	 */
	private final ApiAuthorization authorization;

	/**
	 * 
	 * @param authorization
	 */
	public CharacterTransactionSync(ApiAuthorization authorization) {
		super();
		this.authorization = authorization;
	}

	@Override
	public void synchronize() throws ApiException {
		
		WalletTransactionsParser transactionsParser = WalletTransactionsParser.getInstance();
		
		WalletTransactionsResponse transactionsResponse = transactionsParser.getResponse(authorization, ACCOUNT_KEY);
		
		long fromID = importCharWalletTransacion(transactionsResponse.getAll(), authorization);
		
		while (fromID > 0) {
			
			transactionsResponse = transactionsParser.getResponse(authorization, ACCOUNT_KEY, fromID);
			
			fromID = importCharWalletTransacion(transactionsResponse.getAll(), authorization);
		}
		
	}

	/**
	 * トランザクションをデータベースへ追加します。
	 * @param transactions
	 * @param authorization
	 * @return
	 */
	private long importCharWalletTransacion(Set<ApiWalletTransaction> transactions, ApiAuthorization authorization) {
		
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
				walletTransaction.setAccountKey(ACCOUNT_KEY);
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
