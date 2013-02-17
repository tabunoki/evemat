package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = MaterialListener.class)
@Table(name = "MATERIAL")
public class Material {

    /**  */
    @Column(name = "TYPE_ID")
    Integer typeId;

    /**  */
    @Column(name = "MATERIAL_TYPE_ID")
    Integer materialTypeId;

    /**  */
    @Column(name = "QUANTITY")
    Integer quantity;

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
     * Returns the materialTypeId.
     * 
     * @return the materialTypeId
     */
    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    /** 
     * Sets the materialTypeId.
     * 
     * @param materialTypeId the materialTypeId
     */
    public void setMaterialTypeId(Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
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
}