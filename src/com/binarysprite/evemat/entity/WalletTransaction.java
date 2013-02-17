package com.binarysprite.evemat.entity;

import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = WalletTransactionListener.class)
@Table(name = "WALLET_TRANSACTION")
public class WalletTransaction {

    /**  */
    @Id
    @Column(name = "TRANSACTION_ID")
    Long transactionId;

    /**  */
    @Column(name = "TRANSACTION_DATE_TIME")
    Timestamp transactionDateTime;

    /**  */
    @Column(name = "TYPE_ID")
    Long typeId;

    /**  */
    @Column(name = "TYPE_NAME")
    String typeName;

    /**  */
    @Column(name = "QUANTITY")
    Long quantity;

    /**  */
    @Column(name = "PRICE")
    Double price;

    /**  */
    @Column(name = "CLIENT_ID")
    Long clientId;

    /**  */
    @Column(name = "CLIENT_NAME")
    String clientName;

    /**  */
    @Column(name = "STATION_ID")
    Long stationId;

    /**  */
    @Column(name = "STATION_NAME")
    String stationName;

    /**  */
    @Column(name = "TRANSACTION_TYPE")
    String transactionType;

    /**  */
    @Column(name = "TRANSACTION_FOR")
    String transactionFor;

    /**  */
    @Column(name = "JOURNAL_TRANSACTION_ID")
    Long journalTransactionId;

    /**  */
    @Column(name = "ACCOUNT_KEY")
    Integer accountKey;

    /**  */
    @Column(name = "CHARACTER_ID")
    Long characterId;

    /** 
     * Returns the transactionId.
     * 
     * @return the transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /** 
     * Sets the transactionId.
     * 
     * @param transactionId the transactionId
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /** 
     * Returns the transactionDateTime.
     * 
     * @return the transactionDateTime
     */
    public Timestamp getTransactionDateTime() {
        return transactionDateTime;
    }

    /** 
     * Sets the transactionDateTime.
     * 
     * @param transactionDateTime the transactionDateTime
     */
    public void setTransactionDateTime(Timestamp transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    /** 
     * Returns the typeId.
     * 
     * @return the typeId
     */
    public Long getTypeId() {
        return typeId;
    }

    /** 
     * Sets the typeId.
     * 
     * @param typeId the typeId
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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
     * Returns the quantity.
     * 
     * @return the quantity
     */
    public Long getQuantity() {
        return quantity;
    }

    /** 
     * Sets the quantity.
     * 
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /** 
     * Returns the price.
     * 
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /** 
     * Sets the price.
     * 
     * @param price the price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /** 
     * Returns the clientId.
     * 
     * @return the clientId
     */
    public Long getClientId() {
        return clientId;
    }

    /** 
     * Sets the clientId.
     * 
     * @param clientId the clientId
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /** 
     * Returns the clientName.
     * 
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /** 
     * Sets the clientName.
     * 
     * @param clientName the clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /** 
     * Returns the stationId.
     * 
     * @return the stationId
     */
    public Long getStationId() {
        return stationId;
    }

    /** 
     * Sets the stationId.
     * 
     * @param stationId the stationId
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /** 
     * Returns the stationName.
     * 
     * @return the stationName
     */
    public String getStationName() {
        return stationName;
    }

    /** 
     * Sets the stationName.
     * 
     * @param stationName the stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /** 
     * Returns the transactionType.
     * 
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /** 
     * Sets the transactionType.
     * 
     * @param transactionType the transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /** 
     * Returns the transactionFor.
     * 
     * @return the transactionFor
     */
    public String getTransactionFor() {
        return transactionFor;
    }

    /** 
     * Sets the transactionFor.
     * 
     * @param transactionFor the transactionFor
     */
    public void setTransactionFor(String transactionFor) {
        this.transactionFor = transactionFor;
    }

    /** 
     * Returns the journalTransactionId.
     * 
     * @return the journalTransactionId
     */
    public Long getJournalTransactionId() {
        return journalTransactionId;
    }

    /** 
     * Sets the journalTransactionId.
     * 
     * @param journalTransactionId the journalTransactionId
     */
    public void setJournalTransactionId(Long journalTransactionId) {
        this.journalTransactionId = journalTransactionId;
    }

    /** 
     * Returns the accountKey.
     * 
     * @return the accountKey
     */
    public Integer getAccountKey() {
        return accountKey;
    }

    /** 
     * Sets the accountKey.
     * 
     * @param accountKey the accountKey
     */
    public void setAccountKey(Integer accountKey) {
        this.accountKey = accountKey;
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