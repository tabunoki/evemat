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
@Entity(listener = ProductGroupListener.class)
@Table(name = "PRODUCT_GROUP")
public class ProductGroup {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    /**  */
    @Column(name = "GROUP_NAME")
    String groupName;

    /**  */
    @Column(name = "PRODUCTION_TIME")
    Integer productionTime;

    /**  */
    @Column(name = "CHARACTER_ID")
    Long characterId;

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
     * Returns the groupName.
     * 
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /** 
     * Sets the groupName.
     * 
     * @param groupName the groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
     * Returns the characterId.
     * 
     * @return the characterId
     */
    public Long getCharacterId() {
        return characterId;
    }

    /** 
     * Sets the characterId.
     * 
     * @param characterId the characterId
     */
    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }
}