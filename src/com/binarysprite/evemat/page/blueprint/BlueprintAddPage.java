/**
 * 
 */
package com.binarysprite.evemat.page.blueprint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.extensions.ajax.markup.html.autocomplete.AutoCompleteTextField;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.value.ValueMap;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.ProductBlueprint;
import com.binarysprite.evemat.entity.ProductBlueprintDao;
import com.binarysprite.evemat.entity.ProductBlueprintDaoImpl;
import com.binarysprite.evemat.entity.ProductGroup;
import com.binarysprite.evemat.entity.ProductGroupDao;
import com.binarysprite.evemat.entity.ProductGroupDaoImpl;
import com.binarysprite.evemat.entity.Type;
import com.binarysprite.evemat.entity.TypeDao;
import com.binarysprite.evemat.entity.TypeDaoImpl;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.blueprint.data.Blueprint;
import com.binarysprite.evemat.page.blueprint.data.GroupSelect;

/**
 * @author Tabunoki
 * 
 */
public class BlueprintAddPage extends FramePage {

	/**
	 * ブループリント登録のモデルオブジェクトです。
	 */
	private final Blueprint newBlueprint = new Blueprint();

	/**
	 * 
	 */
	private final Form<ValueMap> newBlueprintForm = new Form<ValueMap>("newBlueprintForm");

	/**
	 * 
	 */
	private final AutoCompleteTextField<String> newBlueprintTypeName = new AutoCompleteTextField<String>(
			"newBlueprintTypeName", new PropertyModel<String>(newBlueprint, "blueprintTypeName")) {

		@Override
		protected Iterator<String> getChoices(String arg0) {

			List<String> choices = new ArrayList<String>();

			TypeDao dao = new TypeDaoImpl();

			List<Type> types;

			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				transaction.begin();
				types = dao.selectByName(arg0);

			} finally {
				transaction.rollback();
			}

			int i = 0;
			for (Type type : types) {
				if (++i > 5) {
					break;
				}
				choices.add(new String(type.getTypeName()));
			}

			return choices.iterator();
		}

	};

	/**
	 * 
	 */

	/**
	 * 
	 */
	private final TextField<Integer> newMaterialEfficiency = new TextField<Integer>("newMaterialEfficiency",
			new PropertyModel<Integer>(newBlueprint, "materialEfficiency"));

	/**
	 * 
	 */
	private final TextField<Integer> newProductionEfficiency = new TextField<Integer>("newProductionEfficiency",
			new PropertyModel<Integer>(newBlueprint, "productionEfficiency"));

	/**
	 * 
	 */
	private final DropDownChoice<GroupSelect> newGroupDropDownChoice = new DropDownChoice<GroupSelect>(
			"newGroupDropDownChoice", new PropertyModel<GroupSelect>(newBlueprint, "groupSelect"),
			new LoadableDetachableModel<List<GroupSelect>>() {

				@Override
				protected List<GroupSelect> load() {

					final List<GroupSelect> groupSelects = new ArrayList<GroupSelect>();

					ProductGroupDao dao = new ProductGroupDaoImpl();

					List<ProductGroup> productGroups;

					LocalTransaction transaction = DB.getLocalTransaction();
					try {
						transaction.begin();
						productGroups = dao.selectAll();

					} finally {
						transaction.rollback();
					}

					for (ProductGroup productGroup : productGroups) {

						groupSelects.add(new GroupSelect(productGroup.getId(), productGroup.getGroupName()));
					}

					return groupSelects;
				}
			}, new IChoiceRenderer<GroupSelect>() {

				@Override
				public Object getDisplayValue(GroupSelect groupSelect) {
					return groupSelect.getGroupName();
				}

				@Override
				public String getIdValue(GroupSelect groupSelect, int index) {
					return Long.toString(groupSelect.getId());
				}

			});

	/**
	 * 
	 */
	private final Button addNewBlueprint = new Button("addNewBlueprint") {

		@Override
		public void onSubmit() {

			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				// トランザクションの開始
				transaction.begin();

				ProductBlueprintDao dao = new ProductBlueprintDaoImpl();

				ProductBlueprint productBlueprint = new ProductBlueprint();
				productBlueprint.setBlueprintTypeId(new TypeDaoImpl().selectOneByName(
						newBlueprint.getBlueprintTypeName()).getTypeId());
				productBlueprint.setMe(newBlueprint.getMaterialEfficiency());
				productBlueprint.setPe(newBlueprint.getProductionEfficiency());
				productBlueprint.setProductGroup(newBlueprint.getGroupSelect().getId());

				dao.insert(productBlueprint);

				transaction.commit();

			} finally {
				transaction.rollback();
			}

			setResponsePage(new BlueprintPage());
		}

	};

	/**
	 * コンストラクタです。
	 */
	public BlueprintAddPage() {

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "New Blueprint");

		/*
		 * コンポーネントの編集
		 */
		newGroupDropDownChoice.setRequired(true);

		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		
		this.add(newBlueprintForm);
		newBlueprintForm.add(newBlueprintTypeName);
		newBlueprintForm.add(newMaterialEfficiency);
		newBlueprintForm.add(newProductionEfficiency);
		newBlueprintForm.add(newGroupDropDownChoice);
		newBlueprintForm.add(addNewBlueprint);
	}

}
