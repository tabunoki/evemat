package com.binarysprite.evemat.page.blueprint;

import java.io.Serializable;
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
import org.apache.wicket.markup.html.form.validation.FormComponentFeedbackBorder;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.util.value.ValueMap;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.common.ConfirmButton;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
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

/**
 * ブループリント管理するウェブページクラスです。
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
	 * ブループリント登録のモデルオブジェクトです。
	 */
	private final Blueprint newBlueprint = new Blueprint();
	
	/**
	 * グループ一覧のモデルオブジェクトです。
	 */
	private final List<Group> groupList = new ArrayList<Group>();
	
	/**
	 * グループ登録のモデルオブジェクトです。
	 */
	private final Group newGroup = new Group();

	/**
	 * 
	 */
	public BlueprintPage() {
		super();

		/*
		 * 1. ブループリントの登録
		 * 2. グループの登録
		 * 3. ブループリントの編集
		 * 4. グループの編集
		 * 5. ブループリントの削除
		 * 6. グループの削除
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
					
					blueprintList.add(new Blueprint(
							productBlueprint.getId(),
							productBlueprint.getBlueprintTypeId(),
							characterName,
							productBlueprint.getMe(),
							productBlueprint.getPe(),
							new GroupSelect(productBlueprint.getProductGroup(),
									productGroupDao.selectById(productBlueprint.getProductGroup()).getGroupName())
					));
					
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
					
					groupList.add(new Group(
							productGroup.getId(),
							productGroup.getGroupName(),
							productGroup.getProductionTime(),
							new CharaterSelect(productGroup.getCharacterId(), characterName)));
					
				}
				
			} finally {
				transaction.rollback();
			}
		}

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Blueprint");
		final Form<ValueMap> blueprintForm = new Form<ValueMap>("blueprintForm");
		final ListView<Blueprint> blueprintListView = new ListView<Blueprint>("blueprintList", new ListModel<Blueprint>(blueprintList)) {

			@Override
			protected void populateItem(ListItem<Blueprint> item) {
				
				final Blueprint blueprint = (Blueprint) item.getModelObject();
				
				final IModel<Integer> materialEfficiencyModel = new PropertyModel<Integer>(blueprint, "materialEfficiency");
				final IModel<Integer> productionEfficiencyModel = new PropertyModel<Integer>(blueprint, "productionEfficiency");
				
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
		final Form<ValueMap> newBlueprintForm = new Form<ValueMap>("newBlueprintForm");
		final AutoCompleteTextField<String> newBlueprintTypeName = new AutoCompleteTextField<String>(
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
		final TextField<Integer> newMaterialEfficiency = new TextField<Integer>("newMaterialEfficiency", new PropertyModel<Integer>(newBlueprint, "materialEfficiency"));
		final TextField<Integer> newProductionEfficiency = new TextField<Integer>("newProductionEfficiency", new PropertyModel<Integer>(newBlueprint, "productionEfficiency"));
		final DropDownChoice<GroupSelect> newGroupDropDownChoice = new DropDownChoice<GroupSelect>(
				"newGroupDropDownChoice",
				new PropertyModel<GroupSelect>(newBlueprint, "groupSelect"),
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

							groupSelects.add(new GroupSelect(productGroup.getId(),
									productGroup.getGroupName()));
						}

						return groupSelects;
					}
				},
				new IChoiceRenderer<GroupSelect>() {

					@Override
					public Object getDisplayValue(GroupSelect groupSelect) {
						return groupSelect.getGroupName();
					}

					@Override
					public String getIdValue(GroupSelect groupSelect, int index) {
						return Long.toString(groupSelect.getId());
					}

				});
		final Button addNewBlueprint = new Button("addNewBlueprint") {

			@Override
			public void onSubmit() {

				LocalTransaction transaction = DB.getLocalTransaction();
				try {
					// トランザクションの開始
					transaction.begin();

					ProductBlueprintDao dao = new ProductBlueprintDaoImpl();

					ProductBlueprint productBlueprint = new ProductBlueprint();
					productBlueprint.setBlueprintTypeId(new TypeDaoImpl().selectOneByName(newBlueprint.getBlueprintTypeName()).getTypeId());
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
		final Form<ValueMap> groupForm = new Form<ValueMap>("groupForm") {};
		final ListView<Group> groupListView = new ListView<Group>("groupList", new ListModel<Group>(groupList)) {

			@Override
			protected void populateItem(ListItem<Group> item) {
				
				final Group group = (Group) item.getModelObject();
				
				item.add(new Label("listGroupName", group.getGroupName()));
				item.add(new TextField<String>("listGroupProductionTime", new PropertyModel<String>(group, "productionTime")));
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
		final Form<ValueMap> newGroupForm = new Form<ValueMap>("newGroupForm");
		final TextField<String> newGroupName = new TextField<String>("groupName", new PropertyModel<String>(newGroup, "groupName"));
		final TextField<Integer> newProductionTime = new TextField<Integer>("productionTime", new PropertyModel<Integer>(newGroup, "productionTime"));
		final DropDownChoice<CharaterSelect> newCharacterDropDownChoice = new DropDownChoice<CharaterSelect>(
				"characterSelect",
				new PropertyModel<CharaterSelect>(newGroup, "characterSelect"),
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

							charaterSelects
									.add(new CharaterSelect(accountCharacter
											.getCharacterId(), accountCharacter
											.getCharacterName()));
						}

						return charaterSelects;
					}
				},
				new IChoiceRenderer<CharaterSelect>() {

					@Override
					public Object getDisplayValue(CharaterSelect select) {
						return select.getCharacterName();
					}

					@Override
					public String getIdValue(CharaterSelect select, int index) {
						return Long.toString(select.getId());
					}
				});
		final FormComponentFeedbackBorder charactersFeedbackBorder = new FormComponentFeedbackBorder("charactersFeedback");
		final Button addNewGroupButton = new Button("newGroupButton") {

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
		
		/*
		 * コンポーネントの編集
		 */
		newGroupDropDownChoice.setRequired(true);
		newCharacterDropDownChoice.setRequired(true);
		
		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		
		this.add(blueprintForm);
		blueprintForm.add(blueprintListView);
		this.add(newBlueprintForm);
		newBlueprintForm.add(newBlueprintTypeName);
		newBlueprintForm.add(newMaterialEfficiency);
		newBlueprintForm.add(newProductionEfficiency);
		newBlueprintForm.add(newGroupDropDownChoice);
		newBlueprintForm.add(addNewBlueprint);
		
		this.add(groupForm);
		groupForm.add(groupListView);
		this.add(newGroupForm);
		newGroupForm.add(newGroupName);
		newGroupForm.add(newProductionTime);
		newGroupForm.add(charactersFeedbackBorder);
		charactersFeedbackBorder.add(newCharacterDropDownChoice);
		newGroupForm.add(addNewGroupButton);
	}

}

/**
 * 
 * @author Tabunoki
 *
 */
class CharaterSelect implements Serializable {

	private final long id;

	private final String characterName;

	public CharaterSelect(long id, String name) {
		super();
		this.id = id;
		this.characterName = name;
	}

	public long getId() {
		return id;
	}

	public String getCharacterName() {
		return characterName;
	}
}

/**
 * 
 * @author Tabunoki
 *
 */
class Group implements Serializable {
	
	private int ID;
	
	private String groupName;
	
	private int productionTime;
	
	private CharaterSelect characterSelect;

	public Group() {
		super();
	}


	public Group(int iD, String groupName, int productionTime,
			CharaterSelect characterSelect) {
		super();
		ID = iD;
		this.groupName = groupName;
		this.productionTime = productionTime;
		this.characterSelect = characterSelect;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getProductionTime() {
		return productionTime;
	}

	public void setProductionTime(int productionTime) {
		this.productionTime = productionTime;
	}

	public CharaterSelect getCharacterSelect() {
		return characterSelect;
	}

	public void setCharacterSelect(CharaterSelect charaterSelect) {
		this.characterSelect = charaterSelect;
	}
}

/**
 * 
 * @author Tabunoki
 *
 */
class GroupSelect implements Serializable {

	private final int id;

	private final String groupName;

	public GroupSelect(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
}

/**
 * 
 * @author Tabunoki
 *
 */
class Blueprint implements Serializable {
	
	private int ID;
	
	private int blueprintTypeID;
	
	private String blueprintTypeName;
	
	private int materialEfficiency;
	
	private int productionEfficiency;
	
	private GroupSelect groupSelect;

	public Blueprint() {
		super();
	}

	public Blueprint(int iD, int blueprintTypeID, String blueprintTypeName,
			int materialEfficiency, int productionEfficiency,
			GroupSelect groupSelect) {
		super();
		ID = iD;
		this.blueprintTypeID = blueprintTypeID;
		this.blueprintTypeName = blueprintTypeName;
		this.materialEfficiency = materialEfficiency;
		this.productionEfficiency = productionEfficiency;
		this.groupSelect = groupSelect;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBlueprintTypeID() {
		return blueprintTypeID;
	}

	public void setBlueprintTypeID(int blueprintTypeID) {
		this.blueprintTypeID = blueprintTypeID;
	}

	public String getBlueprintTypeName() {
		return blueprintTypeName;
	}

	public void setBlueprintTypeName(String blueprintTypeName) {
		this.blueprintTypeName = blueprintTypeName;
	}

	public int getMaterialEfficiency() {
		return materialEfficiency;
	}

	public void setMaterialEfficiency(int materialEfficiency) {
		this.materialEfficiency = materialEfficiency;
	}

	public int getProductionEfficiency() {
		return productionEfficiency;
	}

	public void setProductionEfficiency(int productionEfficiency) {
		this.productionEfficiency = productionEfficiency;
	}

	public GroupSelect getGroupSelect() {
		return groupSelect;
	}

	public void setGroupSelect(GroupSelect groupSelect) {
		this.groupSelect = groupSelect;
	}
}
