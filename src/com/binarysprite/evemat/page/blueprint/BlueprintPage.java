package com.binarysprite.evemat.page.blueprint;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.util.value.ValueMap;

import com.binarysprite.evemat.common.ConfirmButton;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.blueprint.data.Blueprint;
import com.binarysprite.evemat.page.blueprint.data.Group;
import com.google.inject.Inject;

/**
 * ブループリント管理するウェブページクラスです。
 * 
 * @author Tabunoki
 * 
 */
@SuppressWarnings("serial")
public class BlueprintPage extends FramePage {

	/**
	 * 
	 */
	public static final String WICKET_ID_BLUEPRINT_FORM = "blueprintForm";

	/**
	 * 
	 */
	public static final String WICKET_ID_BLUEPRINT_LISTVIEW = "blueprintListView";

	/**
	 * 
	 */
	public static final String WICKET_ID_BLUEPRINT_TYPE_NAME_LABLE = "blueprintTypeNameLable";

	/**
	 * 
	 */
	public static final String WICKET_ID_MATERIAL_EFFICIENCY_TEXTFIELD = "materialEfficiencyTextField";

	/**
	 * 
	 */
	public static final String WICKET_ID_PRODUCTION_EFFICIENCY_TEXTFIELD = "productionEfficiencyTextField";

	/**
	 * 
	 */
	public static final String WICKET_ID_UPDATE_BLUPRINT_BUTTON = "updateBluprintButton";

	/**
	 * 
	 */
	public static final String WICKET_ID_DELETE_BLUPRINT_BUTTON = "deleteBlueprintButton";

	/**
	 * 
	 */
	public static final String WICKET_ID_GROUP_LIST_VIEW = "groupListView";

	/**
	 * 
	 */
	public static final String WICKET_ID_GROUP_LINK = "groupLink";

	/**
	 * 
	 */
	public static final String WICKET_ID_GROUP_NAME_LABEL = "groupNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_CHARACTER_NAME_LABEL = "characterNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_PRODUCTION_TIME_TEXTFIELD = "productionTimeTextField";

	/**
	 * 
	 */
	public static final String WICKET_ID_UPDATE_GROUP_BUTTON = "updateGroupButton";

	/**
	 * 
	 */
	public static final String WICKET_ID_DELETE_GROUP_BUTTON = "deleteGroupButton";

	/**
	 * グループ一覧のモデルオブジェクトです。
	 */
	private final List<Group> groupList = new ArrayList<Group>();

	/**
	 * ブループリント一覧のモデルオブジェクトです。
	 */
	private final List<Blueprint> blueprintList = new ArrayList<Blueprint>();

	/**
	 * 
	 */
	private final Form<ValueMap> blueprintForm = new Form<ValueMap>(WICKET_ID_BLUEPRINT_FORM);

	/**
	 * 
	 */
	private final ListView<Blueprint> blueprintListView = new ListView<Blueprint>(WICKET_ID_BLUEPRINT_LISTVIEW,
			new ListModel<Blueprint>(blueprintList)) {

		@Override
		protected void populateItem(ListItem<Blueprint> item) {

			final Blueprint blueprint = (Blueprint) item.getModelObject();

			final IModel<Integer> materialEfficiencyModel =
					new PropertyModel<Integer>(blueprint, "materialEfficiency");
			final IModel<Integer> productionEfficiencyModel =
					new PropertyModel<Integer>(blueprint, "productionEfficiency");

			item.add(new Label(WICKET_ID_BLUEPRINT_TYPE_NAME_LABLE, blueprint.getBlueprintTypeName()));
			item.add(new TextField<Integer>(WICKET_ID_MATERIAL_EFFICIENCY_TEXTFIELD, materialEfficiencyModel));
			item.add(new TextField<Integer>(WICKET_ID_PRODUCTION_EFFICIENCY_TEXTFIELD, productionEfficiencyModel));

		}
	};

	/**
	 * 
	 */
	private final Button updateBluprintButton = new ConfirmButton(WICKET_ID_UPDATE_BLUPRINT_BUTTON, "");

	/**
	 * 
	 */
	private final Button deleteBluprintButton = new ConfirmButton(WICKET_ID_DELETE_BLUPRINT_BUTTON, "");

	/**
	 * 
	 */
	private final ListView<Group> groupListView = new ListView<Group>(WICKET_ID_GROUP_LIST_VIEW,
			new ListModel<Group>(groupList)) {

		@Override
		protected void populateItem(ListItem<Group> item) {

			final Group group = (Group) item.getModelObject();

			/*
			 * コンポーネントの生成
			 */
			final Link<Void> groupLink = new Link<Void>(WICKET_ID_GROUP_LINK) {

				@Override
				public void onClick() {

					blueprintList.clear();
					blueprintList.addAll(bluePrintPageService.getBlueprints(group.getID()));

				}
			};
			final Label groupNameLabel =
					new Label(WICKET_ID_GROUP_NAME_LABEL, group.getGroupName());
			final Label characterNameLabel =
					new Label(WICKET_ID_CHARACTER_NAME_LABEL, group.getCharacterSelect().getCharacterName());

			/*
			 * コンポーネントの組み立て
			 */
			item.add(groupLink);
			groupLink.add(groupNameLabel);
			groupLink.add(characterNameLabel);
		}
	};

	/**
	 * 
	 */
	@Inject
	private BluePrintPageService bluePrintPageService;

	/**
	 * 
	 */
	public BlueprintPage() {
		super();

		groupList.addAll(bluePrintPageService.getGroups());

		blueprintList.addAll(bluePrintPageService.getBlueprints(groupList.get(0).getID()));

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
		blueprintForm.add(updateBluprintButton);
		blueprintForm.add(deleteBluprintButton);

		this.add(groupListView);

	}
}
