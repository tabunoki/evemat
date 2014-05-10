package com.binarysprite.evemat.page.blueprint;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.util.value.ValueMap;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.common.ConfirmButton;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
import com.binarysprite.evemat.entity.ProductBlueprint;
import com.binarysprite.evemat.entity.ProductBlueprintDao;
import com.binarysprite.evemat.entity.ProductBlueprintDaoImpl;
import com.binarysprite.evemat.entity.ProductGroup;
import com.binarysprite.evemat.entity.ProductGroupDao;
import com.binarysprite.evemat.entity.ProductGroupDaoImpl;
import com.binarysprite.evemat.entity.TypeDao;
import com.binarysprite.evemat.entity.TypeDaoImpl;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.blueprint.data.Blueprint;
import com.binarysprite.evemat.page.blueprint.data.CharaterSelect;
import com.binarysprite.evemat.page.blueprint.data.Group;
import com.binarysprite.evemat.page.blueprint.data.GroupSelect;

/**
 * ブループリント管理するウェブページクラスです。
 * 
 * @author Tabunoki
 * 
 */
@SuppressWarnings("serial")
public class BlueprintPage extends FramePage {

	/**
	 * ブループリント一覧のモデルオブジェクトです。
	 */
	private final List<Blueprint> blueprintList = new ArrayList<Blueprint>();

	/**
	 * グループ一覧のモデルオブジェクトです。
	 */
	private final List<Group> groupList = new ArrayList<Group>();

	/**
	 * 
	 */
	private final Form<ValueMap> blueprintForm = new Form<ValueMap>("blueprintForm");

	/**
	 * 
	 */
	private final ListView<Blueprint> blueprintListView = new ListView<Blueprint>("blueprintList",
			new ListModel<Blueprint>(blueprintList)) {

		@Override
		protected void populateItem(ListItem<Blueprint> item) {

			final Blueprint blueprint = (Blueprint) item.getModelObject();

			final IModel<Integer> materialEfficiencyModel = new PropertyModel<Integer>(blueprint, "materialEfficiency");
			final IModel<Integer> productionEfficiencyModel = new PropertyModel<Integer>(blueprint,
					"productionEfficiency");

			item.add(new Label("blueprintTypeName", blueprint.getBlueprintTypeName()));
			item.add(new TextField<Integer>("materialEfficiency", materialEfficiencyModel));
			item.add(new TextField<Integer>("productionEfficiency", productionEfficiencyModel));
			item.add(new Label("blueprintGroup", blueprint.getGroupSelect().getGroupName()));
			item.add(new Button("updateBlueprint") {

				@Override
				public void onSubmit() {

					ProductBlueprintDao blueprintDao = new ProductBlueprintDaoImpl();

					LocalTransaction transaction = DB.getLocalTransaction();
					try {
						transaction.begin();

						ProductBlueprint productBlueprint = blueprintDao.selectById(blueprint.getID());

						productBlueprint.setMe(blueprint.getMaterialEfficiency());
						productBlueprint.setPe(blueprint.getProductionEfficiency());

						blueprintDao.update(productBlueprint);

						transaction.commit();
					} catch (Exception exception) {
						transaction.rollback();
					}

					setResponsePage(new BlueprintPage());
				}

			});
			item.add(new ConfirmButton("deleteBlueprint", "Blueprint を削除しますか？") {

				@Override
				public void onSubmit() {

					ProductBlueprintDao blueprintDao = new ProductBlueprintDaoImpl();

					LocalTransaction transaction = DB.getLocalTransaction();
					try {
						transaction.begin();

						blueprintDao.delete(blueprintDao.selectById(blueprint.getID()));

						transaction.commit();
					} catch (Exception exception) {
						transaction.rollback();
					}

					setResponsePage(new BlueprintPage());
				}

			}.setDefaultFormProcessing(false));

		}
	};

	/**
	 * 
	 */
	private final Form<ValueMap> groupForm = new Form<ValueMap>("groupForm");

	/**
	 * 
	 */
	private final ListView<Group> groupListView = new ListView<Group>("groupList", new ListModel<Group>(groupList)) {

		@Override
		protected void populateItem(ListItem<Group> item) {

			final Group group = (Group) item.getModelObject();

			item.add(new Label("listGroupName", group.getGroupName()));
			item.add(new TextField<String>("listGroupProductionTime",
					new PropertyModel<String>(group, "productionTime")));
			item.add(new Label("listGroupCharacter", group.getCharacterSelect().getCharacterName()));
			item.add(new ConfirmButton("deleteGroup", "Group を削除しますか？") {

				@Override
				public void onSubmit() {

					ProductGroupDao groupDao = new ProductGroupDaoImpl();

					LocalTransaction transaction = DB.getLocalTransaction();
					try {
						transaction.begin();

						groupDao.delete(groupDao.selectById(group.getID()));

						transaction.commit();
					} catch (Exception exception) {
						transaction.rollback();
					}

					setResponsePage(new BlueprintPage());
				}

			}.setDefaultFormProcessing(false));
		}
	};

	/**
	 * 
	 */
	public BlueprintPage() {
		super();

		/*
		 * TODO サービス化
		 */
		{
			ProductBlueprintDao blueprintDao = new ProductBlueprintDaoImpl();
			TypeDao typeDao = new TypeDaoImpl();
			ProductGroupDao productGroupDao = new ProductGroupDaoImpl();

			List<ProductBlueprint> productBlueprints;

			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				transaction.begin();
				productBlueprints = blueprintDao.selectAll();

				for (ProductBlueprint productBlueprint : productBlueprints) {

					String characterName;

					characterName = typeDao.selectById(productBlueprint.getBlueprintTypeId()).getTypeName();

					blueprintList.add(new Blueprint(productBlueprint.getId(), productBlueprint.getBlueprintTypeId(),
							characterName, productBlueprint.getMe(), productBlueprint.getPe(), new GroupSelect(
									productBlueprint.getProductGroup(), productGroupDao.selectById(
											productBlueprint.getProductGroup()).getGroupName())));

				}

			} finally {
				transaction.rollback();
			}
		}

		{
			ProductGroupDao productGroupDao = new ProductGroupDaoImpl();
			AccountCharacterDao accountCharacterDao = new AccountCharacterDaoImpl();

			List<ProductGroup> productGroups;

			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				transaction.begin();
				productGroups = productGroupDao.selectAll();

				for (ProductGroup productGroup : productGroups) {

					String characterName;

					characterName = accountCharacterDao.selectById(productGroup.getCharacterId()).getCharacterName();

					groupList.add(new Group(productGroup.getId(), productGroup.getGroupName(), productGroup
							.getProductionTime(), new CharaterSelect(productGroup.getCharacterId(), characterName)));

				}

			} finally {
				transaction.rollback();
			}
		}

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Blueprint");

		/*
		 * コンポーネントの追加
		 */
		this.add(title);

		this.add(blueprintForm);
		blueprintForm.add(blueprintListView);

		this.add(groupForm);
		groupForm.add(groupListView);
	}

}
