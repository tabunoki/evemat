/**
 * 
 */
package com.binarysprite.evemat.service.character;

import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;

/**
 * @author Tabunoki
 * 
 */
public class CharacterGetService {

	/**
	 * 
	 * @return
	 */
	public List<AccountCharacter> get() {

		final List<AccountCharacter> accountCharacters;

		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();

			AccountCharacterDao dao = new AccountCharacterDaoImpl();
			accountCharacters = dao.selectAll();

		} finally {
			transaction.rollback();
		}

		return accountCharacters;
	}
}
