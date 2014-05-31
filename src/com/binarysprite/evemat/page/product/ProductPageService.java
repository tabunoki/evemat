/**
 * 
 */
package com.binarysprite.evemat.page.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.ProductPriceDao;
import com.binarysprite.evemat.entity.ProductPriceDaoImpl;
import com.binarysprite.evemat.entity.sub.ProductionPlan;
import com.binarysprite.evemat.page.product.data.Group;
import com.binarysprite.evemat.page.product.data.Material;
import com.binarysprite.evemat.page.product.data.Product;

/**
 * @author Tabunoki
 * 
 */
public class ProductPageService {

	/**
	 * 
	 * @param groupId
	 */
	public Group getProduct(int groupId) {

		Group group = new Group();

		for (ProductionPlan plan : getProductionPlans(groupId)) {

			Product product;
			Material material;

			/*
			 * 
			 */
			final int productionTimePerGroup = plan.getGroupProductionTime() * 60 * 60;
			final int productionTimePerUnit = (int) (plan.getProductionTime()
					* (1.0d - (plan.getProductivityModifier()
							/ plan.getProductionTime() * (plan.getPe() / (1.0d + plan.getPe()))))
					* (1.0d - (0.04d * plan.getSkillIndustry())));
			final int productionVolume = productionTimePerGroup / productionTimePerUnit;

			/*
			 * 
			 */
			final int realMaterialQuantity =
					(int) ((Math.round(plan.getMaterialQuantity()
							* (1.0d + (plan.getWasteFactor() / 100d / (1.0d + plan.getMe()))))
							+ Math.round(plan.getMaterialQuantity() * (0.25d - (0.05d * plan.getPe()))))
					* productionVolume);

			product = new Product(
					plan.getProductTypeId(),
					plan.getProductTypeName(),
					plan.getProductSellMin(),
					productionVolume);

			material = new Material(
					plan.getMaterialTypeId(),
					plan.getMaterialTypeName(),
					plan.getMaterialBuyMax(),
					realMaterialQuantity);

			group.setGroupName(plan.getGroupName());

			if (group.getProducts().contains(product) == false) {
				group.getProducts().add(product);
			}

			if (group.getMaterials().contains(material)) {
				group.getMaterials().get(group.getMaterials().indexOf(material)).addQuantity(realMaterialQuantity);
			} else {
				group.getMaterials().add(material);
			}

		}

		return group;

	}

	/**
	 * 
	 * @param groupId
	 * @return
	 */
	private List<ProductionPlan> getProductionPlans(int groupId) {

		List<ProductionPlan> productionPlans = new ArrayList<ProductionPlan>();

		ProductPriceDao dao = new ProductPriceDaoImpl();

		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();

			productionPlans = dao.selectProductionPlan(groupId);

		} finally {
			transaction.rollback();
		}

		return productionPlans;

	}

	/**
	 * 
	 * @param group
	 * @return
	 */
	public BigDecimal getTotalCost(Group group) {

		BigDecimal totalCost = new BigDecimal(0);

		for (Material material : group.getMaterials()) {

			totalCost.add(material.getCosts());
		}

		return totalCost;
	}

	/**
	 * 
	 * @param group
	 * @return
	 */
	public BigDecimal getTotalSale(Group group) {

		BigDecimal totalSale = new BigDecimal(0);

		for (Product material : group.getProducts()) {

			totalSale.add(material.getSales());
		}

		return totalSale;
	}

	/**
	 * 
	 * @param group
	 * @return
	 */
	public BigDecimal getProfit(Group group) {

		BigDecimal profit = new BigDecimal(0);

		profit.add(getTotalSale(group));
		profit.subtract(getTotalCost(group));

		return profit;
	}

	/**
	 * 
	 * @param group
	 * @return
	 */
	public double getRatio(Group group) {

		double profit = getProfit(group).doubleValue();
		double totalSales = getTotalSale(group).doubleValue();

		if (totalSales == 0) {

			return 0;

		} else {

			return profit / totalSales;
		}
	}
}
