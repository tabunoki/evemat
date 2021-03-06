package com.binarysprite.evemat.sync;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
import com.binarysprite.evemat.update.CharacterTransactionUpdate;

public class CharacterTransactionUpdateTest {

	@Test
	public void testSynchronize() {

		Set<ApiAuthorization> authorizations = new HashSet<ApiAuthorization>();
		
		AccountCharacterDao dao = new AccountCharacterDaoImpl();
		
		List<AccountCharacter> accountCharacters;
		
		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();
			accountCharacters = dao.selectAll();
			
		} finally {
			transaction.rollback();
		}
		
		assertNotSame(0, accountCharacters.size());
		
		for (AccountCharacter accountCharacter : accountCharacters) {
			authorizations.add(new ApiAuthorization(
					accountCharacter.getApiId(),
					accountCharacter.getCharacterId(),
					accountCharacter.getApiVerificationCode()));
		}

		assertNotSame(0, authorizations.size());
		
		try {
			for (ApiAuthorization authorization : authorizations) {
				CharacterTransactionUpdate sync = new CharacterTransactionUpdate(
						authorization);

				sync.update();

			}
		} catch (ApiException e) {
			e.printStackTrace();

		}
	}

}
