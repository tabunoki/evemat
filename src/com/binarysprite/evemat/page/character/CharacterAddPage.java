/**
 * 
 */
package com.binarysprite.evemat.page.character;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.character.data.User;
import com.google.inject.Inject;

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
	 * 入力項目のモデルオブジェクトです。
	 */
	private final User user = new User();

	/**
	 * キャラクター登録フォームです。
	 */
	private final Form<String> newCharacterForm = new Form<String>(WICKET_ID_NEW_CHARACTER_FORM) {

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected void onValidate() {
			

			alertPanel.setVisible(false);
			infomationPanel.setVisible(false);
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected void onError() {

			alertPanel.setVisible(true);
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected void onSubmit() {
			

			/*
			 * キャラクターの登録
			 */
			try {
				characterAddPageService.register(user.getUserID(), user.getVarificationCode());

				setResponsePage(new CharacterPage());

			} catch (Exception e) {
				
				infomationPanel.setMessage(e.getMessage());
				infomationPanel.setVisible(true);
			}
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
	 * 
	 */
	@Inject
	private CharacterAddPageService characterAddPageService;

	/**
	 * コンストラクタです。
	 */
	public CharacterAddPage() {
		super();

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "New Character");

		userIDTextField.setRequired(true);
		varificationCodeTextField.setRequired(true);

		this.add(title);
		this.add(newCharacterForm);

		newCharacterForm.add(userIDTextField);
		newCharacterForm.add(varificationCodeTextField);
	}

}
