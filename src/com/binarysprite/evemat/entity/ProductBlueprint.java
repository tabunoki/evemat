package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = ProductBlueprintListener.class)
@Table(name = "PRODUCT_BLUEPRINT")
public class ProductBlueprint {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    /**  */
    @Column(name = "BLUEPRINT_TYPE_ID")
    Integer blueprintTypeId;

    /**  */
    @Column(name = "ME")
    Integer me;

    /**  */
    @Column(name = "PE")
    Integer pe;

    /**  */
    @Column(name = "PRODUCT_GROUP")
    Integer productGroup;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * Returns the me.
     * 
     * @return the me
     */
    public Integer getMe() {
        return me;
    }

    /** 
     * Sets the me.
     * 
     * @param me the me
     */
    public void setMe(Integer me) {
        this.me = me;
    }

    /** 
     * Returns the pe.
     * 
     * @return the pe
     */
    public Integer getPe() {
        return pe;
    }

    /** 
     * Sets the pe.
     * 
     * @param pe the pe
     */
    public void setPe(Integer pe) {
        this.pe = pe;
    }

    /** 
     * Returns the productGroup.
     * 
     * @return the productGroup
     */
    public Integer getProductGroup() {
        return productGroup;
    }

    /** 
     * Sets the productGroup.
     * 
     * @param productGroup the productGroup
     */
    public void setProductGroup(Integer productGroup) {
        this.productGroup = productGroup;
    }
}