package com.binarysprite.evemat.page.product;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.util.ListModel;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.component.ExternalImage;
import com.binarysprite.evemat.page.FramePage;
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
	 * アイテムタイプをクリックした時のイベント定義です。
	 */
	private static final String ONCLICK_EVENT = "CCPEVE.showMarketDetails({0})";

	/**
	 * 製品のモデルオブジェクトです。
	 */
	private final List<Product> products = new ArrayList<Product>();

	/**
	 * 材料のモデルオブジェクトです。
	 */
	private final List<Material> materials = new ArrayList<Material>();

	/**
	 * 
	 */
	final ListView<Product> productListView = new ListView<Product>("productList", new ListModel<Product>(products)) {

		@Override
		protected void populateItem(ListItem<Product> item) {

			final Product product = item.getModelObject();

			item.add(new ExternalImage("productIcon", EveImageService.getTypeIcon(
					product.getId(),
					EveImageService.TypeIconSize.PIXEL_32)));
			item.add(new Label("typeName",
					product.getName()) {

				@Override
				protected void onComponentTag(
						ComponentTag tag) {

					super.onComponentTag(tag);

					tag.put("onclick", "CCPEVE.showMarketDetails(" + product.getId() + ")");
				}

			});
			item.add(new Label("quantity",
					Constants.QUANTITY_FORMAT.format(product.getQuantity())));
			item.add(new Label("sales",
					Constants.PRICE_FORMAT.format(product.getSales())));

		}
	};

	/**
	 * 
	 */
	final ListView<Material> materialListView = new ListView<Material>("materialList", new ListModel<Material>(
			materials)) {

		@Override
		protected void populateItem(ListItem<Material> item) {

			final Material material = item.getModelObject();

			item.add(new ExternalImage("materialIcon", EveImageService.getTypeIcon(
					material.getId(),
					EveImageService.TypeIconSize.PIXEL_32)));
			item.add(new Label("typeName",
					material.getName()) {

				@Override
				protected void onComponentTag(
						ComponentTag tag) {

					super.onComponentTag(tag);

					tag.put("onclick", "CCPEVE.showMarketDetails(" + material.getId() + ")");
				}

			});
			item.add(new Label("quantity",
					Constants.QUANTITY_FORMAT.format(material.getQuantity())));
			item.add(new Label("costs",
					Constants.PRICE_FORMAT.format(material.getCosts())));

		}
	};

	/**
	 * 
	 */
	@Inject
	ProductPageService productPageService;

	public ProductPage() {
		super();

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Product");

		/*
		 * コンポーネントの編集
		 */

		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		this.add(productListView);
		this.add(materialListView);
	}

}