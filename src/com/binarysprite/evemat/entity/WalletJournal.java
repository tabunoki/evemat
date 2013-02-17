package com.binarysprite.evemat.entity;

import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = WalletJournalListener.class)
@Table(name = "WALLET_JOURNAL")
public class WalletJournal {

    /**  */
    @Id
    @Column(name = "REF_ID")
    Long refId;

    /**  */
    @Column(name = "DATE")
    Timestamp date;

    /**  */
    @Column(name = "REF_TYPE_ID")
    Integer refTypeId;

    /**  */
    @Column(name = "OWNER_NAME_1")
    String ownerName1;

    /**  */
    @Column(name = "OWNER_ID_1")
    Integer ownerId1;

    /**  */
    @Column(name = "OWNER_NAME_2")
    String ownerName2;

    /**  */
    @Column(name = "OWNER_ID_2")
    Integer ownerId2;

    /**  */
    @Column(name = "ARG_NAME_1")
    String argName1;

    /**  */
    @Column(name = "ARG_ID_1")
    Integer argId1;

    /**  */
    @Column(name = "AMOUNT")
    Double amount;

    /**  */
    @Column(name = "BALANCE")
    Double balance;

    /**  */
    @Column(name = "REASON")
    String reason;

    /**  */
    @Column(name = "TAX_RECEIVER")
    String taxReceiver;

    /**  */
    @Column(name = "TAX_AMOUNT")
    String taxAmount;

    /**  */
    @Column(name = "ACCOUNT_KEY")
    Integer accountKey;

    /**  */
    @Column(name = "CHARACTER_ID")
    Long characterId;

    /** 
     * Returns the refId.
     * 
     * @return the refId
     */
    public Long getRefId() {
        return refId;
    }

    /** 
     * Sets the refId.
     * 
     * @param refId the refId
     */
    public void setRefId(Long refId) {
        this.refId = refId;
    }

    /** 
     * Returns the date.
     * 
     * @return the date
     */
    public Timestamp getDate() {
        return date;
    }

    /** 
     * Sets the date.
     * 
     * @param date the date
     */
    public void setDate(Timestamp date) {
        this.date = date;
    }

    /** 
     * Returns the refTypeId.
     * 
     * @return the refTypeId
     */
    public Integer getRefTypeId() {
        return refTypeId;
    }

    /** 
     * Sets the refTypeId.
     * 
     * @param refTypeId the refTypeId
     */
    public void setRefTypeId(Integer refTypeId) {
        this.refTypeId = refTypeId;
    }

    /** 
     * Returns the ownerName1.
     * 
     * @return the ownerName1
     */
    public String getOwnerName1() {
        return ownerName1;
    }

    /** 
     * Sets the ownerName1.
     * 
     * @param ownerName1 the ownerName1
     */
    public void setOwnerName1(String ownerName1) {
        this.ownerName1 = ownerName1;
    }

    /** 
     * Returns the ownerId1.
     * 
     * @return the ownerId1
     */
    public Integer getOwnerId1() {
        return ownerId1;
    }

    /** 
     * Sets the ownerId1.
     * 
     * @param ownerId1 the ownerId1
     */
    public void setOwnerId1(Integer ownerId1) {
        this.ownerId1 = ownerId1;
    }

    /** 
     * Returns the ownerName2.
     * 
     * @return the ownerName2
     */
    public String getOwnerName2() {
        return ownerName2;
    }

    /** 
     * Sets the ownerName2.
     * 
     * @param ownerName2 the ownerName2
     */
    public void setOwnerName2(String ownerName2) {
        this.ownerName2 = ownerName2;
    }

    /** 
     * Returns the ownerId2.
     * 
     * @return the ownerId2
     */
    public Integer getOwnerId2() {
        return ownerId2;
    }

    /** 
     * Sets the ownerId2.
     * 
     * @param ownerId2 the ownerId2
     */
    public void setOwnerId2(Integer ownerId2) {
        this.ownerId2 = ownerId2;
    }

    /** 
     * Returns the argName1.
     * 
     * @return the argName1
     */
    public String getArgName1() {
        return argName1;
    }

    /** 
     * Sets the argName1.
     * 
     * @param argName1 the argName1
     */
    public void setArgName1(String argName1) {
        this.argName1 = argName1;
    }

    /** 
     * Returns the argId1.
     * 
     * @return the argId1
     */
    public Integer getArgId1() {
        return argId1;
    }

    /** 
     * Sets the argId1.
     * 
     * @param argId1 the argId1
     */
    public void setArgId1(Integer argId1) {
        this.argId1 = argId1;
    }

    /** 
     * Returns the amount.
     * 
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /** 
     * Sets the amount.
     * 
     * @param amount the amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /** 
     * Returns the balance.
     * 
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /** 
     * Sets the balance.
     * 
     * @param balance the balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /** 
     * Returns the reason.
     * 
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Sets the reason.
     * 
     * @param reason the reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Returns the taxReceiver.
     * 
     * @return the taxReceiver
     */
    public String getTaxReceiver() {
        return taxReceiver;
    }

    /** 
     * Sets the taxReceiver.
     * 
     * @param taxReceiver the taxReceiver
     */
    public void setTaxReceiver(String taxReceiver) {
        this.taxReceiver = taxReceiver;
    }

    /** 
     * Returns the taxAmount.
     * 
     * @return the taxAmount
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /** 
     * Sets the taxAmount.
     * 
     * @param taxAmount the taxAmount
     */
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
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