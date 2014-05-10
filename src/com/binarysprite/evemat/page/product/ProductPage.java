package com.binarysprite.evemat.page.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.util.ListModel;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.common.ExternalImage;
import com.binarysprite.evemat.entity.ProductPriceDao;
import com.binarysprite.evemat.entity.ProductPriceDaoImpl;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.service.EveImageService;

public class ProductPage extends FramePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7851075248525677171L;

	public ProductPage() {
		super();
		
		final List<GroupDisplay> groupDisplays = getGroupDisplays();
		
		for (GroupDisplay groupDisplay : groupDisplays) {
//			Collections.sort(groupDisplay.productDisplays);
			Collections.sort(groupDisplay.materialDisplays);
		}
		
		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Product");
		
		final ListView<GroupDisplay> listView = new ListView<GroupDisplay>("groupList", new ListModel<GroupDisplay>(groupDisplays)) {

			@Override
			protected void populateItem(ListItem<GroupDisplay> item) {
				
				final GroupDisplay groupDisplay = item.getModelObject();
				
				item.add(new ListView<ProductDisplay>("productList", new ListModel<ProductDisplay>(groupDisplay.productDisplays)) {

					@Override
					protected void populateItem(ListItem<ProductDisplay> item) {
						
						final ProductDisplay productDisplay = item.getModelObject();
						
						item.add(new ExternalImage("productIcon", EveImageService.getTypeIcon(
									productDisplay.getId(),
									EveImageService.TypeIconSize.PIXEL_32)));
						item.add(new Label("typeName",
								productDisplay.getName()) {

									@Override
									protected void onComponentTag(
											ComponentTag tag) {
										
										super.onComponentTag(tag);
										
										tag.put("onclick", "CCPEVE.showMarketDetails(" + productDisplay.getId() + ")");
									}
							
						});
						item.add(new Label("quantity",
								Constants.QUANTITY_FORMAT.format(productDisplay.getQuantity())));
						item.add(new Label("sales",
								Constants.PRICE_FORMAT.format(productDisplay.getSales())));

					}
				});
				
				item.add(new ListView<MaterialDisplay>("materialList", new ListModel<MaterialDisplay>(groupDisplay.materialDisplays)) {

					@Override
					protected void populateItem(ListItem<MaterialDisplay> item) {
						
						final MaterialDisplay materialDisplay = item.getModelObject();
						
						item.add(new ExternalImage("materialIcon", EveImageService.getTypeIcon(
								materialDisplay.getId(),
								EveImageService.TypeIconSize.PIXEL_32)));
						item.add(new Label("typeName",
								materialDisplay.getName()) {

									@Override
									protected void onComponentTag(
											ComponentTag tag) {
										
										super.onComponentTag(tag);
										
										tag.put("onclick", "CCPEVE.showMarketDetails(" + materialDisplay.getId() + ")");
									}
							
						});
						item.add(new Label("quantity",
								Constants.QUANTITY_FORMAT.format(materialDisplay.getQuantity())));
						item.add(new Label("costs",
								Constants.PRICE_FORMAT.format(materialDisplay.getCosts())));

					}
				});
				
				item.add(new Label("totalSales", Constants.PRICE_FORMAT.format(groupDisplay.getTotalSales())));
				item.add(new Label("totalCosts", Constants.PRICE_FORMAT.format(groupDisplay.getTotalCosts())));
				item.add(new Label("profit", Constants.PRICE_FORMAT.format(groupDisplay.getProfit())));
				item.add(new Label("ratio", Constants.PERCENT_FORMAT.format(groupDisplay.getProfitRatio())));
			}
		};
		
		
		/*
		 * コンポーネントの編集
		 */
		
		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		this.add(listView);
	}

	/**
	 * 
	 * @return
	 */
	static List<GroupDisplay> getGroupDisplays() {
		
		final List<GroupDisplay> groupDisplays = new ArrayList<GroupDisplay>();
		

		ProductPriceDao dao = new ProductPriceDaoImpl();
		
		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();
			
			final List<Map<String, Object>> maps = dao.selectManufactureTable();
			
			for (Map<String, Object> productOrMaterial : maps) {
				
				GroupDisplay groupDisplay;
				ProductDisplay productDisplay;
				MaterialDisplay materialDisplay;
				

				final String groupName = (String) productOrMaterial.get("GROUP_NAME");
				final int groupProductionTime = (Integer) productOrMaterial.get("GROUP_PRODUCTION_TIME");
				final int skillIndustry = (Integer) productOrMaterial.get("SKILL_INDUSTRY");
				final int skillProductionEfficiency = (Integer) productOrMaterial.get("SKILL_PRODUCTION_EFFICIENCY");
				
				final int productID = (Integer) productOrMaterial.get("PRODUCT_ID");
				final String productName = (String) productOrMaterial.get("PRODUCT_NAME");
				final int wasteFactor = (Integer) productOrMaterial.get("WASTE_FACTOR");
				final int baseProductionTime = (Integer) productOrMaterial.get("PRODUCT_PRODUCTION_TIME");
				final int productivityModifier = (Integer) productOrMaterial.get("PRODUCTIVITY_MODIFIER");
				final int portionSize = (Integer) productOrMaterial.get("PORTION_SIZE");
				final int materialEfficiency = (Integer) productOrMaterial.get("ME");
				final int productionEfficiency = (Integer) productOrMaterial.get("PE");
				final double productPrice = (Double) productOrMaterial.get("SELL_MIN");
				
				final int materialID = (Integer) productOrMaterial.get("MATERIAL_ID");
				final String materialName = (String) productOrMaterial.get("MATERIAL_NAME");
				final double materialPrice = (Double) productOrMaterial.get("BUY_MAX");
				final int materialQuantity = (Integer) productOrMaterial.get("QUANTITY");
				
				/*
				 * 
				 */
				final int productionTimePerGroup = groupProductionTime * 60 * 60;
				final int productionTimePerUnit = (int) (baseProductionTime * (1.0d - (productivityModifier / baseProductionTime * (productionEfficiency / (1.0d + productionEfficiency)))) * (1.0d - (0.04d * skillIndustry)));
				final int productionVolume = productionTimePerGroup / productionTimePerUnit;
				
				/*
				 * 
				 */
				final int realMaterialQuantity =
						(int) ((Math.round(materialQuantity * (1.0d + (wasteFactor / 100d / (1.0d + materialEfficiency))))
				+ Math.round(materialQuantity * (0.25d - (0.05d * skillProductionEfficiency))))
				* productionVolume);
				
				
				groupDisplay = new GroupDisplay(groupName);
				
				productDisplay = new ProductDisplay(
						productID,
						productName,
						productPrice,
						productionVolume);
				
				materialDisplay = new MaterialDisplay(
						materialID,
						materialName,
						materialPrice,
						realMaterialQuantity);
				
				if (groupDisplays.contains(groupDisplay)) {
					groupDisplay = groupDisplays.get(groupDisplays.indexOf(groupDisplay));
				} else {
					groupDisplays.add(groupDisplay);
				}
				
				if (groupDisplay.productDisplays.contains(productDisplay) == false) {
					groupDisplay.productDisplays.add(productDisplay);
				}
				
				if (groupDisplay.materialDisplays.contains(materialDisplay)) {
					groupDisplay.materialDisplays.get(groupDisplay.materialDisplays.indexOf(materialDisplay)).addQuantity(realMaterialQuantity);
				} else {
					groupDisplay.materialDisplays.add(materialDisplay);
				}
				
			}
			
		} finally {
			transaction.rollback();
		}
		
		return groupDisplays;
	}

}

/**
 * 
 * @author Tabunoki
 *
 */
class GroupDisplay {
	
	private final String name;
	
	public final List<ProductDisplay> productDisplays = new ArrayList<ProductDisplay>();
	
	public final List<MaterialDisplay> materialDisplays = new ArrayList<MaterialDisplay>();

	public GroupDisplay(String name) {
		super();
		this.name = name;
	}
	
	public double getTotalSales() {
		
		double totalSales = 0;
		
		for (ProductDisplay productDisplay : productDisplays) {
			totalSales += productDisplay.getSales();
		}
		
		return totalSales;
	}

	public double getTotalCosts() {
		
		double totalCosts = 0;
		
		for (MaterialDisplay materialDisplay : materialDisplays) {
			totalCosts += materialDisplay.getCosts();
		}
		
		return totalCosts;
	}
	
	public double getProfit() {
		return getTotalSales() - getTotalCosts();
	}
	
	public double getProfitRatio() {
		return getProfit() / getTotalSales();
	}

	@Override
	public String toString() {
		return "GroupDisplay [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupDisplay other = (GroupDisplay) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

/**
 * 
 * @author Tabunoki
 *
 */
class ProductDisplay {
	
	private final int id;
	
	private final String name;
	
	private final double price;
	
	private int quantity;
	
	
	public ProductDisplay(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public double getSales() {
		return price * quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ProductDisplay [name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDisplay other = (ProductDisplay) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

/**
 * 
 * @author Tabunoki
 *
 */
class MaterialDisplay implements Comparable<MaterialDisplay> {
	
	private final int id;
	
	private final String name;
	
	private final double price;
	
	private int quantity;

	
	public MaterialDisplay(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public double getCosts() {
		return price * quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MaterialDisplay [name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaterialDisplay other = (MaterialDisplay) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(MaterialDisplay o) {
		
		return this.name.compareTo(o.name);
	}
}