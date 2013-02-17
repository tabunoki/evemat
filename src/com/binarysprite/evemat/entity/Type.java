package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = TypeListener.class)
@Table(name = "TYPE")
public class Type {

    /**  */
    @Id
    @Column(name = "TYPE_ID")
    Integer typeId;

    /**  */
    @Column(name = "GROUP_ID")
    Integer groupId;

    /**  */
    @Column(name = "TYPE_NAME")
    String typeName;

    /**  */
    @Column(name = "DESCRIPTION")
    String description;

    /**  */
    @Column(name = "MASS")
    Double mass;

    /**  */
    @Column(name = "VOLUME")
    Double volume;

    /**  */
    @Column(name = "CAPACITY")
    Double capacity;

    /**  */
    @Column(name = "PORTION_SIZE")
    Integer portionSize;

    /**  */
    @Column(name = "RACE_ID")
    Integer raceId;

    /**  */
    @Column(name = "BASE_PRICE")
    Double basePrice;

    /**  */
    @Column(name = "PUBLISHED")
    Boolean published;

    /**  */
    @Column(name = "MARKET_GROUP_ID")
    Integer marketGroupId;

    /**  */
    @Column(name = "CHANCE_OF_DUPLICATING")
    Double chanceOfDuplicating;

    /**  */
    @Column(name = "ICON_ID")
    Integer iconId;

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
     * Returns the groupId.
     * 
     * @return the groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    /** 
     * Sets the groupId.
     * 
     * @param groupId the groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /** 
     * Returns the typeName.
     * 
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /** 
     * Sets the typeName.
     * 
     * @param typeName the typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    /** 
     * Returns the mass.
     * 
     * @return the mass
     */
    public Double getMass() {
        return mass;
    }

    /** 
     * Sets the mass.
     * 
     * @param mass the mass
     */
    public void setMass(Double mass) {
        this.mass = mass;
    }

    /** 
     * Returns the volume.
     * 
     * @return the volume
     */
    public Double getVolume() {
        return volume;
    }

    /** 
     * Sets the volume.
     * 
     * @param volume the volume
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /** 
     * Returns the capacity.
     * 
     * @return the capacity
     */
    public Double getCapacity() {
        return capacity;
    }

    /** 
     * Sets the capacity.
     * 
     * @param capacity the capacity
     */
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    /** 
     * Returns the portionSize.
     * 
     * @return the portionSize
     */
    public Integer getPortionSize() {
        return portionSize;
    }

    /** 
     * Sets the portionSize.
     * 
     * @param portionSize the portionSize
     */
    public void setPortionSize(Integer portionSize) {
        this.portionSize = portionSize;
    }

    /** 
     * Returns the raceId.
     * 
     * @return the raceId
     */
    public Integer getRaceId() {
        return raceId;
    }

    /** 
     * Sets the raceId.
     * 
     * @param raceId the raceId
     */
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    /** 
     * Returns the basePrice.
     * 
     * @return the basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /** 
     * Sets the basePrice.
     * 
     * @param basePrice the basePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /** 
     * Returns the published.
     * 
     * @return the published
     */
    public Boolean getPublished() {
        return published;
    }

    /** 
     * Sets the published.
     * 
     * @param published the published
     */
    public void setPublished(Boolean published) {
        this.published = published;
    }

    /** 
     * Returns the marketGroupId.
     * 
     * @return the marketGroupId
     */
    public Integer getMarketGroupId() {
        return marketGroupId;
    }

    /** 
     * Sets the marketGroupId.
     * 
     * @param marketGroupId the marketGroupId
     */
    public void setMarketGroupId(Integer marketGroupId) {
        this.marketGroupId = marketGroupId;
    }

    /** 
     * Returns the chanceOfDuplicating.
     * 
     * @return the chanceOfDuplicating
     */
    public Double getChanceOfDuplicating() {
        return chanceOfDuplicating;
    }

    /** 
     * Sets the chanceOfDuplicating.
     * 
     * @param chanceOfDuplicating the chanceOfDuplicating
     */
    public void setChanceOfDuplicating(Double chanceOfDuplicating) {
        this.chanceOfDuplicating = chanceOfDuplicating;
    }

    /** 
     * Returns the iconId.
     * 
     * @return the iconId
     */
    public Integer getIconId() {
        return iconId;
    }

    /** 
     * Sets the iconId.
     * 
     * @param iconId the iconId
     */
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }
}