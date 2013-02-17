package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = RequirementListener.class)
@Table(name = "REQUIREMENT")
public class Requirement {

    /**  */
    @Column(name = "TYPE_ID")
    Integer typeId;

    /**  */
    @Column(name = "ACTIVITY_ID")
    Integer activityId;

    /**  */
    @Column(name = "REQUIRED_TYPE_ID")
    Integer requiredTypeId;

    /**  */
    @Column(name = "QUANTITY")
    Integer quantity;

    /**  */
    @Column(name = "DAMAGE_PER_JOB")
    Double damagePerJob;

    /**  */
    @Column(name = "RECYDE")
    Boolean recyde;

    /** 
     * Returns the typeId.
     * 
     * @return the typeId
     */
    public Integer getTypeId() {
        return typeId;
    }

    /** 
     * Sets the typeId.
     * 
     * @param typeId the typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /** 
     * Returns the activityId.
     * 
     * @return the activityId
     */
    public Integer getActivityId() {
        return activityId;
    }

    /** 
     * Sets the activityId.
     * 
     * @param activityId the activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /** 
     * Returns the requiredTypeId.
     * 
     * @return the requiredTypeId
     */
    public Integer getRequiredTypeId() {
        return requiredTypeId;
    }

    /** 
     * Sets the requiredTypeId.
     * 
     * @param requiredTypeId the requiredTypeId
     */
    public void setRequiredTypeId(Integer requiredTypeId) {
        this.requiredTypeId = requiredTypeId;
    }

    /** 
     * Returns the quantity.
     * 
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /** 
     * Sets the quantity.
     * 
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /** 
     * Returns the damagePerJob.
     * 
     * @return the damagePerJob
     */
    public Double getDamagePerJob() {
        return damagePerJob;
    }

    /** 
     * Sets the damagePerJob.
     * 
     * @param damagePerJob the damagePerJob
     */
    public void setDamagePerJob(Double damagePerJob) {
        this.damagePerJob = damagePerJob;
    }

    /** 
     * Returns the recyde.
     * 
     * @return the recyde
     */
    public Boolean getRecyde() {
        return recyde;
    }

    /** 
     * Sets the recyde.
     * 
     * @param recyde the recyde
     */
    public void setRecyde(Boolean recyde) {
        this.recyde = recyde;
    }
}