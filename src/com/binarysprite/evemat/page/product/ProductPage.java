package com.binarysprite.evemat.page.product;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.util.ListModel;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.component.ExternalImage;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.product.data.Group;
import com.binarysprite.evemat.page.product.data.Material;
import com.binarysprite.evemat.page.product.data.Product;
import com.binarysprite.evemat.util.EveImageService;
import com.google.inject.Inject;

/**
 * 
 * @author Tabunoki
 * 
 */
public class ProductPage extends FramePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7851075248525677171L;

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
	public static final String WICKET_ID_CHARACTER_NAME_LABEL = "characterNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_GROUP_NAME_LABEL = "groupNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_PRODUCT_LIST_VIEW = "productListView";

	/**
	 * 
	 */
	public static final String WICKET_ID_MATERIAL_LIST_VIEW = "materialListView";

	/**
	 * 
	 */
	public static final String WICKET_ID_ICON_IMAGE = "iconImage";

	/**
	 * 
	 */
	public static final String WICKET_ID_TYPE_NAME_LABEL = "typeNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_QUANTITY_LABEL = "quantityLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_SALES_LABEL = "salesLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_COSTS_LABEL = "costsLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_TOTAL_SALES_LABEL = "totalSalesLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_TOTAL_COSTS_LABEL = "totalCostsLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_PROFIT_LABEL = "profitLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_RATIO_LABEL = "ratioLabel";

	/**
	 * アイテムタイプをクリックした時のイベント定義です。
	 */
	private static final String ONCLICK_EVENT = "CCPEVE.showMarketDetails({0})";

	/**
	 * グループ一覧のモデルオブジェクトです。
	 */
	private final List<Group> groupList = new ArrayList<Group>();

	/**
	 * プロダクトグループのモデルオブジェクトです。
	 */
	private Group group = new Group();

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

					final List<Product> products = group.getProducts();
					final List<Material> materials = group.getMaterials();

					products.clear();
					materials.clear();

					products.addAll(productPageService.getProduct(group.getID()).getProducts());
					materials.addAll(productPageService.getProduct(group.getID()).getMaterials());

				}
			};
			final Label groupNameLabel =
					new Label(WICKET_ID_GROUP_NAME_LABEL, group.getGroupName());
			final Label characterNameLabel =
					new Label(WICKET_ID_CHARACTER_NAME_LABEL, group.getCharacterName());

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
	final ListView<Product> productListView = new ListView<Product>(
			WICKET_ID_PRODUCT_LIST_VIEW,
			new ListModel<Product>(group.getProducts())) {

		@Override
		protected void populateItem(ListItem<Product> item) {

			final Product product = item.getModelObject();

			item.add(new ExternalImage(WICKET_ID_ICON_IMAGE, EveImageService.getTypeIcon(
					product.getId(),
					EveImageService.TypeIconSize.PIXEL_32)));
			item.add(new Label(WICKET_ID_TYPE_NAME_LABEL,
					product.getName()) {

				@Override
				protected void onComponentTag(
						ComponentTag tag) {

					super.onComponentTag(tag);

					tag.put("onclick", "CCPEVE.showMarketDetails(" + product.getId() + ")");
				}

			});
			item.add(new Label(WICKET_ID_QUANTITY_LABEL,
					Constants.QUANTITY_FORMAT.format(product.getQuantity())));
			item.add(new Label(WICKET_ID_SALES_LABEL,
					Constants.PRICE_FORMAT.format(product.getSales())));

		}
	};

	/**
	 * 
	 */
	final ListView<Material> materialListView = new ListView<Material>(
			WICKET_ID_MATERIAL_LIST_VIEW,
			new ListModel<Material>(group.getMaterials())) {

		@Override
		protected void populateItem(ListItem<Material> item) {

			final Material material = item.getModelObject();

			item.add(new ExternalImage(WICKET_ID_ICON_IMAGE, EveImageService.getTypeIcon(
					material.getId(),
					EveImageService.TypeIconSize.PIXEL_32)));
			item.add(new Label(WICKET_ID_TYPE_NAME_LABEL,
					material.getName()) {

				@Override
				protected void onComponentTag(
						ComponentTag tag) {

					super.onComponentTag(tag);

					tag.put("onclick", "CCPEVE.showMarketDetails(" + material.getId() + ")");
				}

			});
			item.add(new Label(WICKET_ID_QUANTITY_LABEL,
					Constants.QUANTITY_FORMAT.format(material.getQuantity())));
			item.add(new Label(WICKET_ID_COSTS_LABEL,
					Constants.PRICE_FORMAT.format(material.getCosts())));

		}
	};

	/**
	 * 
	 */
	@Inject
	ProductPageService productPageService;

	/**
	 * 
	 */
	public ProductPage() {
		super();

		group = productPageService.getProduct(0);

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Product");
		final Label totalSalesLabel = new Label(WICKET_ID_TOTAL_SALES_LABEL, productPageService.getTotalSale(group));
		final Label totalCostsLabel = new Label(WICKET_ID_TOTAL_COSTS_LABEL, productPageService.getTotalCost(group));
		final Label profitLabel = new Label(WICKET_ID_PROFIT_LABEL, productPageService.getProfit(group));
		final Label ratioLabel = new Label(WICKET_ID_RATIO_LABEL, productPageService.getRatio(group));

		/*
		 * コンポーネントの編集
		 */

		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		this.add(groupListView);
		this.add(productListView);
		this.add(materialListView);
		this.add(totalSalesLabel);
		this.add(totalCostsLabel);
		this.add(profitLabel);
		this.add(ratioLabel);

	}

}