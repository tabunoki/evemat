package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = BlueprintListener.class)
@Table(name = "BLUEPRINT")
public class Blueprint {

    /**  */
    @Column(name = "BLUEPRINT_TYPE_ID")
    Integer blueprintTypeId;

    /**  */
    @Column(name = "PARENT_BLUEPRINT_TYPE_ID")
    Integer parentBlueprintTypeId;

    /**  */
    @Column(name = "PRODUCT_TYPE_ID")
    Integer productTypeId;

    /**  */
    @Column(name = "PRODUCTION_TIME")
    Integer productionTime;

    /**  */
    @Column(name = "TECH_LEVEL")
    Integer techLevel;

    /**  */
    @Column(name = "RESEARCH_PRODUCTIVITY_TIME")
    Integer researchProductivityTime;

    /**  */
    @Column(name = "RESEARCH_MATERIAL_TIME")
    Integer researchMaterialTime;

    /**  */
    @Column(name = "RESEARCH_COPY_TIME")
    Integer researchCopyTime;

    /**  */
    @Column(name = "RESEARCH_TECH_TIME")
    Integer researchTechTime;

    /**  */
    @Column(name = "PRODUCTIVITY_MODIFIER")
    Integer productivityModifier;

    /**  */
    @Column(name = "MATERIAL_MODIFIER")
    Integer materialModifier;

    /**  */
    @Column(name = "WASTE_FACTOR")
    Integer wasteFactor;

    /**  */
    @Column(name = "MAX_PRODUCTION_LIMIT")
    Integer maxProductionLimit;

    /** 
     * Returns the blueprintTypeId.
     * 
     * @return the blueprintTypeId
     */
    public Integer getBlueprintTypeId() {
        return blueprintTypeId;
    }

    /** 
     * Sets the blueprintTypeId.
     * 
     * @param blueprintTypeId the blueprintTypeId
     */
    public void setBlueprintTypeId(Integer blueprintTypeId) {
        this.blueprintTypeId = blueprintTypeId;
    }

    /** 
     * Returns the parentBlueprintTypeId.
     * 
     * @return the parentBlueprintTypeId
     */
    public Integer getParentBlueprintTypeId() {
        return parentBlueprintTypeId;
    }

    /** 
     * Sets the parentBlueprintTypeId.
     * 
     * @param parentBlueprintTypeId the parentBlueprintTypeId
     */
    public void setParentBlueprintTypeId(Integer parentBlueprintTypeId) {
        this.parentBlueprintTypeId = parentBlueprintTypeId;
    }

    /** 
     * Returns the productTypeId.
     * 
     * @return the productTypeId
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /** 
     * Sets the productTypeId.
     * 
     * @param productTypeId the productTypeId
     */
    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    /** 
     * Returns the productionTime.
     * 
     * @return the productionTime
     */
    public Integer getProductionTime() {
        return productionTime;
    }

    /** 
     * Sets the productionTime.
     * 
     * @param productionTime the productionTime
     */
    public void setProductionTime(Integer productionTime) {
        this.productionTime = productionTime;
    }

    /** 
     * Returns the techLevel.
     * 
     * @return the techLevel
     */
    public Integer getTechLevel() {
        return techLevel;
    }

    /** 
     * Sets the techLevel.
     * 
     * @param techLevel the techLevel
     */
    public void setTechLevel(Integer techLevel) {
        this.techLevel = techLevel;
    }

    /** 
     * Returns the researchProductivityTime.
     * 
     * @return the researchProductivityTime
     */
    public Integer getResearchProductivityTime() {
        return researchProductivityTime;
    }

    /** 
     * Sets the researchProductivityTime.
     * 
     * @param researchProductivityTime the researchProductivityTime
     */
    public void setResearchProductivityTime(Integer researchProductivityTime) {
        this.researchProductivityTime = researchProductivityTime;
    }

    /** 
     * Returns the researchMaterialTime.
     * 
     * @return the researchMaterialTime
     */
    public Integer getResearchMaterialTime() {
        return researchMaterialTime;
    }

    /** 
     * Sets the researchMaterialTime.
     * 
     * @param researchMaterialTime the researchMaterialTime
     */
    public void setResearchMaterialTime(Integer researchMaterialTime) {
        this.researchMaterialTime = researchMaterialTime;
    }

    /** 
     * Returns the researchCopyTime.
     * 
     * @return the researchCopyTime
     */
    public Integer getResearchCopyTime() {
        return researchCopyTime;
    }

    /** 
     * Sets the researchCopyTime.
     * 
     * @param researchCopyTime the researchCopyTime
     */
    public void setResearchCopyTime(Integer researchCopyTime) {
        this.researchCopyTime = researchCopyTime;
    }

    /** 
     * Returns the researchTechTime.
     * 
     * @return the researchTechTime
     */
    public Integer getResearchTechTime() {
        return researchTechTime;
    }

    /** 
     * Sets the researchTechTime.
     * 
     * @param researchTechTime the researchTechTime
     */
    public void setResearchTechTime(Integer researchTechTime) {
        this.researchTechTime = researchTechTime;
    }

    /** 
     * Returns the productivityModifier.
     * 
     * @return the productivityModifier
     */
    public Integer getProductivityModifier() {
        return productivityModifier;
    }

    /** 
     * Sets the productivityModifier.
     * 
     * @param productivityModifier the productivityModifier
     */
    public void setProductivityModifier(Integer productivityModifier) {
        this.productivityModifier = productivityModifier;
    }

    /** 
     * Returns the materialModifier.
     * 
     * @return the materialModifier
     */
    public Integer getMaterialModifier() {
        return materialModifier;
    }

    /** 
     * Sets the materialModifier.
     * 
     * @param materialModifier the materialModifier
     */
    public void setMaterialModifier(Integer materialModifier) {
        this.materialModifier = materialModifier;
    }

    /** 
     * Returns the wasteFactor.
     * 
     * @return the wasteFactor
     */
    public Integer getWasteFactor() {
        return wasteFactor;
    }

    /** 
     * Sets the wasteFactor.
     * 
     * @param wasteFactor the wasteFactor
     */
    public void setWasteFactor(Integer wasteFactor) {
        this.wasteFactor = wasteFactor;
    }

    /** 
     * Returns the maxProductionLimit.
     * 
     * @return the maxProductionLimit
     */
    public Integer getMaxProductionLimit() {
        return maxProductionLimit;
    }

    /** 
     * Sets the maxProductionLimit.
     * 
     * @param maxProductionLimit the maxProductionLimit
     */
    public void setMaxProductionLimit(Integer maxProductionLimit) {
        this.maxProductionLimit = maxProductionLimit;
    }
}