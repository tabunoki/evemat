package com.binarysprite.evemat.entity;

import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = ProductPriceListener.class)
@Table(name = "PRODUCT_PRICE")
public class ProductPrice {

    /**  */
    @Id
    @Column(name = "TYPE_ID")
    Integer typeId;

    /**  */
    @Column(name = "ALL_VOLUME")
    Long allVolume;

    /**  */
    @Column(name = "ALL_AVERAGE")
    Double allAverage;

    /**  */
    @Column(name = "ALL_MAX")
    Double allMax;

    /**  */
    @Column(name = "ALL_MIN")
    Double allMin;

    /**  */
    @Column(name = "ALL_MEDIAN")
    Double allMedian;

    /**  */
    @Column(name = "ALL_STANDARD_DEVIATION")
    Double allStandardDeviation;

    /**  */
    @Column(name = "SELL_VOLUME")
    Long sellVolume;

    /**  */
    @Column(name = "SELL_AVERAGE")
    Double sellAverage;

    /**  */
    @Column(name = "SELL_MAX")
    Double sellMax;

    /**  */
    @Column(name = "SELL_MIN")
    Double sellMin;

    /**  */
    @Column(name = "SELL_MEDIAN")
    Double sellMedian;

    /**  */
    @Column(name = "SELL_STANDARD_DEVIATION")
    Double sellStandardDeviation;

    /**  */
    @Column(name = "BUY_VOLUME")
    Long buyVolume;

    /**  */
    @Column(name = "BUY_AVERAGE")
    Double buyAverage;

    /**  */
    @Column(name = "BUY_MAX")
    Double buyMax;

    /**  */
    @Column(name = "BUY_MIN")
    Double buyMin;

    /**  */
    @Column(name = "BUY_MEDIAN")
    Double buyMedian;

    /**  */
    @Column(name = "BUY_STANDARD_DEVIATION")
    Double buyStandardDeviation;

    /**  */
    @Column(name = "UPDATE_TIME")
    Timestamp updateTime;

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
     * Returns the allVolume.
     * 
     * @return the allVolume
     */
    public Long getAllVolume() {
        return allVolume;
    }

    /** 
     * Sets the allVolume.
     * 
     * @param allVolume the allVolume
     */
    public void setAllVolume(Long allVolume) {
        this.allVolume = allVolume;
    }

    /** 
     * Returns the allAverage.
     * 
     * @return the allAverage
     */
    public Double getAllAverage() {
        return allAverage;
    }

    /** 
     * Sets the allAverage.
     * 
     * @param allAverage the allAverage
     */
    public void setAllAverage(Double allAverage) {
        this.allAverage = allAverage;
    }

    /** 
     * Returns the allMax.
     * 
     * @return the allMax
     */
    public Double getAllMax() {
        return allMax;
    }

    /** 
     * Sets the allMax.
     * 
     * @param allMax the allMax
     */
    public void setAllMax(Double allMax) {
        this.allMax = allMax;
    }

    /** 
     * Returns the allMin.
     * 
     * @return the allMin
     */
    public Double getAllMin() {
        return allMin;
    }

    /** 
     * Sets the allMin.
     * 
     * @param allMin the allMin
     */
    public void setAllMin(Double allMin) {
        this.allMin = allMin;
    }

    /** 
     * Returns the allMedian.
     * 
     * @return the allMedian
     */
    public Double getAllMedian() {
        return allMedian;
    }

    /** 
     * Sets the allMedian.
     * 
     * @param allMedian the allMedian
     */
    public void setAllMedian(Double allMedian) {
        this.allMedian = allMedian;
    }

    /** 
     * Returns the allStandardDeviation.
     * 
     * @return the allStandardDeviation
     */
    public Double getAllStandardDeviation() {
        return allStandardDeviation;
    }

    /** 
     * Sets the allStandardDeviation.
     * 
     * @param allStandardDeviation the allStandardDeviation
     */
    public void setAllStandardDeviation(Double allStandardDeviation) {
        this.allStandardDeviation = allStandardDeviation;
    }

    /** 
     * Returns the sellVolume.
     * 
     * @return the sellVolume
     */
    public Long getSellVolume() {
        return sellVolume;
    }

    /** 
     * Sets the sellVolume.
     * 
     * @param sellVolume the sellVolume
     */
    public void setSellVolume(Long sellVolume) {
        this.sellVolume = sellVolume;
    }

    /** 
     * Returns the sellAverage.
     * 
     * @return the sellAverage
     */
    public Double getSellAverage() {
        return sellAverage;
    }

    /** 
     * Sets the sellAverage.
     * 
     * @param sellAverage the sellAverage
     */
    public void setSellAverage(Double sellAverage) {
        this.sellAverage = sellAverage;
    }

    /** 
     * Returns the sellMax.
     * 
     * @return the sellMax
     */
    public Double getSellMax() {
        return sellMax;
    }

    /** 
     * Sets the sellMax.
     * 
     * @param sellMax the sellMax
     */
    public void setSellMax(Double sellMax) {
        this.sellMax = sellMax;
    }

    /** 
     * Returns the sellMin.
     * 
     * @return the sellMin
     */
    public Double getSellMin() {
        return sellMin;
    }

    /** 
     * Sets the sellMin.
     * 
     * @param sellMin the sellMin
     */
    public void setSellMin(Double sellMin) {
        this.sellMin = sellMin;
    }

    /** 
     * Returns the sellMedian.
     * 
     * @return the sellMedian
     */
    public Double getSellMedian() {
        return sellMedian;
    }

    /** 
     * Sets the sellMedian.
     * 
     * @param sellMedian the sellMedian
     */
    public void setSellMedian(Double sellMedian) {
        this.sellMedian = sellMedian;
    }

    /** 
     * Returns the sellStandardDeviation.
     * 
     * @return the sellStandardDeviation
     */
    public Double getSellStandardDeviation() {
        return sellStandardDeviation;
    }

    /** 
     * Sets the sellStandardDeviation.
     * 
     * @param sellStandardDeviation the sellStandardDeviation
     */
    public void setSellStandardDeviation(Double sellStandardDeviation) {
        this.sellStandardDeviation = sellStandardDeviation;
    }

    /** 
     * Returns the buyVolume.
     * 
     * @return the buyVolume
     */
    public Long getBuyVolume() {
        return buyVolume;
    }

    /** 
     * Sets the buyVolume.
     * 
     * @param buyVolume the buyVolume
     */
    public void setBuyVolume(Long buyVolume) {
        this.buyVolume = buyVolume;
    }

    /** 
     * Returns the buyAverage.
     * 
     * @return the buyAverage
     */
    public Double getBuyAverage() {
        return buyAverage;
    }

    /** 
     * Sets the buyAverage.
     * 
     * @param buyAverage the buyAverage
     */
    public void setBuyAverage(Double buyAverage) {
        this.buyAverage = buyAverage;
    }

    /** 
     * Returns the buyMax.
     * 
     * @return the buyMax
     */
    public Double getBuyMax() {
        return buyMax;
    }

    /** 
     * Sets the buyMax.
     * 
     * @param buyMax the buyMax
     */
    public void setBuyMax(Double buyMax) {
        this.buyMax = buyMax;
    }

    /** 
     * Returns the buyMin.
     * 
     * @return the buyMin
     */
    public Double getBuyMin() {
        return buyMin;
    }

    /** 
     * Sets the buyMin.
     * 
     * @param buyMin the buyMin
     */
    public void setBuyMin(Double buyMin) {
        this.buyMin = buyMin;
    }

    /** 
     * Returns the buyMedian.
     * 
     * @return the buyMedian
     */
    public Double getBuyMedian() {
        return buyMedian;
    }

    /** 
     * Sets the buyMedian.
     * 
     * @param buyMedian the buyMedian
     */
    public void setBuyMedian(Double buyMedian) {
        this.buyMedian = buyMedian;
    }

    /** 
     * Returns the buyStandardDeviation.
     * 
     * @return the buyStandardDeviation
     */
    public Double getBuyStandardDeviation() {
        return buyStandardDeviation;
    }

    /** 
     * Sets the buyStandardDeviation.
     * 
     * @param buyStandardDeviation the buyStandardDeviation
     */
    public void setBuyStandardDeviation(Double buyStandardDeviation) {
        this.buyStandardDeviation = buyStandardDeviation;
    }

    /** 
     * Returns the updateTime.
     * 
     * @return the updateTime
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /** 
     * Sets the updateTime.
     * 
     * @param updateTime the updateTime
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}