/**
 * 
 */
package com.binarysprite.evemat.page.transaction;

import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.WalletTransaction;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

/**
 * @author Tabunoki
 * 
 */
public class TransactionPageService {

	/**
	 * 
	 * @return
	 */
	public long count() {

		WalletTransactionDao dao = new WalletTransactionDaoImpl();

		LocalTransaction transaction = DB.getLocalTransaction();

		transaction.begin();

		long size = dao.count();

		transaction.rollback();

		return size;
	}

	/**
	 * 
	 * @param first
	 * @param count
	 * @return
	 */
	public List<WalletTransaction> select(long first, long count) {

		WalletTransactionDao dao = new WalletTransactionDaoImpl();

		LocalTransaction transaction = DB.getLocalTransaction();

		transaction.begin();

		List<WalletTransaction> walletTransactions = dao.selectAll(SelectOptions.get().offset((int) first)
				.limit((int) count));

		transaction.rollback();

		return walletTransactions;
	}
}
