/**
 * 
 */
package com.binarysprite.evemat.page.blueprint;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.FormComponentFeedbackBorder;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.value.ValueMap;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
import com.binarysprite.evemat.entity.ProductGroup;
import com.binarysprite.evemat.entity.ProductGroupDao;
import com.binarysprite.evemat.entity.ProductGroupDaoImpl;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.blueprint.data.CharaterSelect;
import com.binarysprite.evemat.page.blueprint.data.Group;

/**
 * @author Tabunoki
 * 
 */
public class GroupAddPage extends FramePage {

	/**
	 * グループ登録のモデルオブジェクトです。
	 */
	private final Group newGroup = new Group();

	/**
	 * 
	 */
	private final Form<ValueMap> newGroupForm = new Form<ValueMap>("newGroupForm");

	/**
	 * 
	 */
	private final TextField<String> newGroupName = new TextField<String>("groupName", new PropertyModel<String>(
			newGroup, "groupName"));

	/**
	 * 
	 */
	private final TextField<Integer> newProductionTime = new TextField<Integer>("productionTime",
			new PropertyModel<Integer>(newGroup, "productionTime"));

	/**
	 * 
	 */
	private final DropDownChoice<CharaterSelect> newCharacterDropDownChoice = new DropDownChoice<CharaterSelect>(
			"characterSelect", new PropertyModel<CharaterSelect>(newGroup, "characterSelect"),
			new LoadableDetachableModel<List<CharaterSelect>>() {

				@Override
				protected List<CharaterSelect> load() {

					final List<CharaterSelect> charaterSelects = new ArrayList<CharaterSelect>();

					AccountCharacterDao dao = new AccountCharacterDaoImpl();

					List<AccountCharacter> accountCharacters;

					LocalTransaction transaction = DB.getLocalTransaction();
					try {
						transaction.begin();
						accountCharacters = dao.selectAll();

					} finally {
						transaction.rollback();
					}

					for (AccountCharacter accountCharacter : accountCharacters) {

						charaterSelects.add(new CharaterSelect(accountCharacter.getCharacterId(), accountCharacter
								.getCharacterName()));
					}

					return charaterSelects;
				}
			}, new IChoiceRenderer<CharaterSelect>() {

				@Override
				public Object getDisplayValue(CharaterSelect select) {
					return select.getCharacterName();
				}

				@Override
				public String getIdValue(CharaterSelect select, int index) {
					return Long.toString(select.getId());
				}
			});

	/**
	 * 
	 */
	private final FormComponentFeedbackBorder charactersFeedbackBorder = new FormComponentFeedbackBorder(
			"charactersFeedback");

	/**
	 * 
	 */
	private final Button addNewGroupButton = new Button("newGroupButton") {

		@Override
		public void onSubmit() {

			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				// トランザクションの開始
				transaction.begin();

				ProductGroupDao dao = new ProductGroupDaoImpl();

				ProductGroup productGroup = new ProductGroup();
				productGroup.setCharacterId(newGroup.getCharacterSelect().getId());
				productGroup.setGroupName(newGroup.getGroupName());
				productGroup.setProductionTime(newGroup.getProductionTime());

				dao.insert(productGroup);

				transaction.commit();

			} finally {
				transaction.rollback();
			}

			setResponsePage(new BlueprintPage());
		}

	};

	/**
	 * 
	 */
	public GroupAddPage() {

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "New Group");

		/*
		 * コンポーネントの編集
		 */
		newCharacterDropDownChoice.setRequired(true);

		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		
		this.add(newGroupForm);
		newGroupForm.add(newGroupName);
		newGroupForm.add(newProductionTime);
		newGroupForm.add(charactersFeedbackBorder);
		charactersFeedbackBorder.add(newCharacterDropDownChoice);
		newGroupForm.add(addNewGroupButton);
	}

}
