package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = UnitListener.class)
@Table(name = "UNIT")
public class Unit {

    /**  */
    @Id
    @Column(name = "UNIT_ID")
    Integer unitId;

    /**  */
    @Column(name = "UNIT_NAME")
    String unitName;

    /**  */
    @Column(name = "DISPLAY_NAME")
    String displayName;

    /**  */
    @Column(name = "DESCRIPTION")
    String description;

    /** 
     * Returns the unitId.
     * 
     * @return the unitId
     */
    public Integer getUnitId() {
        return unitId;
    }

    /** 
     * Sets the unitId.
     * 
     * @param unitId the unitId
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /** 
     * Returns the unitName.
     * 
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }

    /** 
     * Sets the unitName.
     * 
     * @param unitName the unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /** 
     * Returns the displayName.
     * 
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /** 
     * Sets the displayName.
     * 
     * @param displayName the displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /** 
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Sets the description.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}