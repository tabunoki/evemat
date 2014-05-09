/**
 * 
 */
package com.binarysprite.evemat.page.character;

import java.util.Collection;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
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
import com.binarysprite.evemat.object.User;
import com.binarysprite.evemat.page.FramePage;

/**
 * @author Tabunoki
 * 
 */
public class CharacterAddPage extends FramePage {

	/**
	 * キャラクター登録フォームの wicket:id です。
	 */
	public static final String WICKET_ID_NEW_CHARACTER_FORM = "newCharacterForm";

	/**
	 * ID 入力欄の wicket:id です。
	 */
	public static final String WICKET_ID_USER_ID_TEXT_FIELD = "userIdTextField";

	/**
	 * API コード 入力欄の wicket:id です。
	 */
	public static final String WICKET_ID_VERIFICATION_CODE_TEXT_FIELD = "verificationCodeTextField";

	/**
	 * 
	 */
	private final User user = new User();

	/**
	 * キャラクター登録フォームです。
	 */
	private final Form<String> newCharacterForm = new Form<String>(WICKET_ID_NEW_CHARACTER_FORM) {

		@Override
		protected void onSubmit() {

			/*
			 * キャラクターの登録
			 */
			if (user.getUserID() == null || user.getVarificationCode() == null || user.getVarificationCode().isEmpty()) {
				return;
			}

			final ApiAuthorization apiAuthorization = new ApiAuthorization(user.getUserID(), user.getVarificationCode());
			final Collection<EveCharacter> eveCharacters;

			eveCharacters = getEveCharacters(apiAuthorization);

			if (eveCharacters.size() > 0) {
				addCharacter(eveCharacters, apiAuthorization);
			}

			/*
			 * ページ遷移
			 */
			setResponsePage(new CharacterPage());
		}

	};

	/**
	 * 
	 */
	private final TextField<Integer> userIDTextField = new TextField<Integer>(WICKET_ID_USER_ID_TEXT_FIELD,
			new PropertyModel<Integer>(user, User.LABEL_USER_ID));

	/**
	 * 
	 */
	private final TextField<String> varificationCodeTextField = new TextField<String>(
			WICKET_ID_VERIFICATION_CODE_TEXT_FIELD, new PropertyModel<String>(user, User.LABEL_VARIFICATION_CODE));

	/**
	 * コンストラクタです。
	 */
	public CharacterAddPage() {
		super();

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "New Character");

		this.add(title);
		this.add(newCharacterForm);

		newCharacterForm.add(userIDTextField);
		newCharacterForm.add(varificationCodeTextField);
	}

	/**
	 * EVE API より取得したキャラクター情報をデータベースへ追加します。
	 * 
	 * @param eveCharacters
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
	 * @param ID
	 * @param verificationCode
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
