package com.binarysprite.evemat.entity.sub;

import java.math.BigDecimal;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

/**
 * 
 * @author Tabunoki
 * 
 */
@Entity
public class ProductionPlan {

	/**
	 * グループ名です。
	 */
	@Column(name = "GROUP_NAME")
	private String groupName;

	/**
	 * グループの生産時間です。
	 */
	@Column(name = "GROUP_PRODUCTION_TIME")
	private int groupProductionTime;

	/**
	 * 「Industry」スキルのレベルです。
	 */
	@Column(name = "SKILL_INDUSTRY")
	private int skillIndustry;

	/**
	 * 「Production Effciency」スキルのレベルです。
	 */
	@Column(name = "SKILL_PRODUCTION_EFFICIENCY")
	private int skillProductionEfficiency;

	/**
	 * ブループリントの「ME」レベルです。
	 */
	@Column(name = "ME")
	private int me;

	/**
	 * ブループリントの「PE」レベルです。
	 */
	@Column(name = "PE")
	private int pe;

	/**
	 * 製品の Type ID です。
	 */
	@Column(name = "PRODUCT_ID")
	private int productTypeId;

	/**
	 * 製品名です。
	 */
	@Column(name = "PRODUCT_NAME")
	private String productTypeName;

	/**
	 * ポーションサイズです。
	 */
	@Column(name = "PORTION_SIZE")
	private int portionSize;

	/**
	 * 製品の最安売値です。
	 */
	@Column(name = "SELL_MIN")
	private BigDecimal productSellMin;

	/**
	 * 材料の Type ID です。
	 */
	@Column(name = "MATERIAL_ID")
	private int materialTypeId;

	/**
	 * 材料名です。
	 */
	@Column(name = "MATERIAL_NAME")
	private String materialTypeName;

	/**
	 * 材料の最高買値です。
	 */
	@Column(name = "BUY_MAX")
	private BigDecimal materialBuyMax;

	/**
	 * 材料数です。
	 */
	@Column(name = "QUANTITY")
	private int materialQuantity;

	/**
	 * 材料の利用効率です。
	 */
	@Column(name = "WASTE_FACTOR")
	private int wasteFactor;

	/**
	 * ブループリントの基本生産時間です。
	 */
	@Column(name = "PRODUCT_PRODUCTION_TIME")
	private int productionTime;

	/**
	 * ブループリントの生産補正です。
	 */
	@Column(name = "PRODUCTIVITY_MODIFIER")
	private int productivityModifier;

	/**
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName セットする groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return groupProductionTime
	 */
	public int getGroupProductionTime() {
		return groupProductionTime;
	}

	/**
	 * @param groupProductionTime セットする groupProductionTime
	 */
	public void setGroupProductionTime(int groupProductionTime) {
		this.groupProductionTime = groupProductionTime;
	}

	/**
	 * @return skillIndustry
	 */
	public int getSkillIndustry() {
		return skillIndustry;
	}

	/**
	 * @param skillIndustry セットする skillIndustry
	 */
	public void setSkillIndustry(int skillIndustry) {
		this.skillIndustry = skillIndustry;
	}

	/**
	 * @return skillProductionEfficiency
	 */
	public int getSkillProductionEfficiency() {
		return skillProductionEfficiency;
	}

	/**
	 * @param skillProductionEfficiency セットする skillProductionEfficiency
	 */
	public void setSkillProductionEfficiency(int skillProductionEfficiency) {
		this.skillProductionEfficiency = skillProductionEfficiency;
	}

	/**
	 * @return me
	 */
	public int getMe() {
		return me;
	}

	/**
	 * @param me セットする me
	 */
	public void setMe(int me) {
		this.me = me;
	}

	/**
	 * @return pe
	 */
	public int getPe() {
		return pe;
	}

	/**
	 * @param pe セットする pe
	 */
	public void setPe(int pe) {
		this.pe = pe;
	}

	/**
	 * @return productTypeId
	 */
	public int getProductTypeId() {
		return productTypeId;
	}

	/**
	 * @param productTypeId セットする productTypeId
	 */
	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}

	/**
	 * @return productTypeName
	 */
	public String getProductTypeName() {
		return productTypeName;
	}

	/**
	 * @param productTypeName セットする productTypeName
	 */
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	/**
	 * @return portionSize
	 */
	public int getPortionSize() {
		return portionSize;
	}

	/**
	 * @param portionSize セットする portionSize
	 */
	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}

	/**
	 * @return productSellMin
	 */
	public BigDecimal getProductSellMin() {
		return productSellMin;
	}

	/**
	 * @param productSellMin セットする productSellMin
	 */
	public void setProductSellMin(BigDecimal productSellMin) {
		this.productSellMin = productSellMin;
	}

	/**
	 * @return materialTypeId
	 */
	public int getMaterialTypeId() {
		return materialTypeId;
	}

	/**
	 * @param materialTypeId セットする materialTypeId
	 */
	public void setMaterialTypeId(int materialTypeId) {
		this.materialTypeId = materialTypeId;
	}

	/**
	 * @return materialTypeName
	 */
	public String getMaterialTypeName() {
		return materialTypeName;
	}

	/**
	 * @param materialTypeName セットする materialTypeName
	 */
	public void setMaterialTypeName(String materialTypeName) {
		this.materialTypeName = materialTypeName;
	}

	/**
	 * @return materialBuyMax
	 */
	public BigDecimal getMaterialBuyMax() {
		return materialBuyMax;
	}

	/**
	 * @param materialBuyMax セットする materialBuyMax
	 */
	public void setMaterialBuyMax(BigDecimal materialBuyMax) {
		this.materialBuyMax = materialBuyMax;
	}

	/**
	 * @return materialQuantity
	 */
	public int getMaterialQuantity() {
		return materialQuantity;
	}

	/**
	 * @param materialQuantity セットする materialQuantity
	 */
	public void setMaterialQuantity(int materialQuantity) {
		this.materialQuantity = materialQuantity;
	}

	/**
	 * @return wasteFactor
	 */
	public int getWasteFactor() {
		return wasteFactor;
	}

	/**
	 * @param wasteFactor セットする wasteFactor
	 */
	public void setWasteFactor(int wasteFactor) {
		this.wasteFactor = wasteFactor;
	}

	/**
	 * @return productionTime
	 */
	public int getProductionTime() {
		return productionTime;
	}

	/**
	 * @param productionTime セットする productionTime
	 */
	public void setProductionTime(int productionTime) {
		this.productionTime = productionTime;
	}

	/**
	 * @return productivityModifier
	 */
	public int getProductivityModifier() {
		return productivityModifier;
	}

	/**
	 * @param productivityModifier セットする productivityModifier
	 */
	public void setProductivityModifier(int productivityModifier) {
		this.productivityModifier = productivityModifier;
	}
}
