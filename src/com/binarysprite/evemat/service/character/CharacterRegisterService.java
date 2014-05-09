/**
 * 
 */
package com.binarysprite.evemat.service.character;

import java.util.Collection;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.beimin.eveapi.account.characters.CharactersParser;
import com.beimin.eveapi.account.characters.EveCharacter;
import com.beimin.eveapi.core.ApiAuth;
import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;

/**
 * @author Tabunoki
 * 
 */
public class CharacterRegisterService {

	/**
	 * 指定の user ID と varification code からキャラクター情報を取得し、データベースへ登録します。
	 * 
	 * @param userID
	 *            User ID
	 * @param varificationCode
	 *            Varification code
	 * @throws Exception
	 */
	public void register(int userID, String varificationCode) throws Exception {

		final ApiAuthorization apiAuthorization = new ApiAuthorization(userID, varificationCode);
		final Collection<EveCharacter> eveCharacters;

		eveCharacters = getEveCharacters(apiAuthorization);

		if (eveCharacters == null || eveCharacters.isEmpty()) {
			throw new Exception("CharacterRegisterService でエラーが発生しました");
		}

		addCharacter(eveCharacters, apiAuthorization);
	}

	/**
	 * EVE API より取得したキャラクター情報をデータベースへ追加します。
	 * 
	 * @param eveCharacters
	 *            EVE API より取得したキャラクター情報
	 */
	private void addCharacter(Collection<EveCharacter> eveCharacters, ApiAuth<ApiAuthorization> apiAuth) {

		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			// トランザクションの開始
			transaction.begin();

			AccountCharacterDao dao = new AccountCharacterDaoImpl();

			for (EveCharacter eveCharacter : eveCharacters) {

				AccountCharacter character = new AccountCharacter();
				character.setCharacterId(eveCharacter.getCharacterID());
				character.setCharacterName(eveCharacter.getName());
				character.setCorporationId(eveCharacter.getCorporationID());
				character.setCoporationName(eveCharacter.getCorporationName());
				character.setApiId(apiAuth.getKeyID());
				character.setApiVerificationCode(apiAuth.getVCode());

				dao.insert(character);
			}

			transaction.commit();

		} finally {
			transaction.rollback();
		}
	}

	/**
	 * EVE API よりキャラクター情報を取得します。
	 * 
	 * @param apiAuth
	 *            EVE API の認証情報
	 * @return
	 */
	private Collection<EveCharacter> getEveCharacters(ApiAuth<ApiAuthorization> apiAuth) {

		Collection<EveCharacter> eveCharacters = null;
		try {
			eveCharacters = CharactersParser.getInstance().getResponse(apiAuth).getAll();

		} catch (ApiException e) {
			e.printStackTrace();
		}

		return eveCharacters;
	}

}
