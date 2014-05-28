/**
 * 
 */
package com.binarysprite.evemat.page.product;

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
	public List<Group> getProduct(int groupId) {
		
		final List<Group> groupDisplays = new ArrayList<Group>();

		for (ProductionPlan plan : getProductionPlans(groupId)) {

			Group group;
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

			group = new Group();

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

			if (groupDisplays.contains(group)) {
				group = groupDisplays.get(groupDisplays.indexOf(group));
			} else {
				groupDisplays.add(group);
			}

			if (group.getProducts().contains(product) == false) {
				group.getProducts().add(product);
			}

			if (group.getMaterials().contains(material)) {
				group.getMaterials().get(group.getMaterials().indexOf(material)).addQuantity(realMaterialQuantity);
			} else {
				group.getMaterials().add(material);
			}

		}
		
		return groupDisplays;

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
}
