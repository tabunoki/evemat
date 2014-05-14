package com.binarysprite.evemat.service.transaction;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

/**
 * 
 * @author Tabunoki
 *
 */
public class TransactionCountService {

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
}
