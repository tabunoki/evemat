package com.binarysprite.evemat.page.character;

import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;

public class CharacterPageService {

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

	/**
	 * 指定のキャラクターをデータベースから削除します。 キャラクターに属するグループとブループリントも同時に削除します。
	 */
	public void delete() {

	}
}
