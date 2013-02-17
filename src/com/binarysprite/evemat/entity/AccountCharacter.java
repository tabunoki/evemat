package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = AccountCharacterListener.class)
@Table(name = "ACCOUNT_CHARACTER")
public class AccountCharacter {

    /**  */
    @Column(name = "CHARACTER_ID")
    Long characterId;

    /**  */
    @Column(name = "CHARACTER_NAME")
    String characterName;

    /**  */
    @Column(name = "CORPORATION_ID")
    Long corporationId;

    /**  */
    @Column(name = "COPORATION_NAME")
    String coporationName;

    /**  */
    @Column(name = "API_ID")
    Integer apiId;

    /**  */
    @Column(name = "API_VERIFICATION_CODE")
    String apiVerificationCode;

    /**  */
    @Column(name = "SKILL_INDUSTRY")
    Integer skillIndustry;

    /**  */
    @Column(name = "SKILL_PRODUCTION_EFFICIENCY")
    Integer skillProductionEfficiency;

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

    /** 
     * Returns the characterName.
     * 
     * @return the characterName
     */
    public String getCharacterName() {
        return characterName;
    }

    /** 
     * Sets the characterName.
     * 
     * @param characterName the characterName
     */
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    /** 
     * Returns the corporationId.
     * 
     * @return the corporationId
     */
    public Long getCorporationId() {
        return corporationId;
    }

    /** 
     * Sets the corporationId.
     * 
     * @param corporationId the corporationId
     */
    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    /** 
     * Returns the coporationName.
     * 
     * @return the coporationName
     */
    public String getCoporationName() {
        return coporationName;
    }

    /** 
     * Sets the coporationName.
     * 
     * @param coporationName the coporationName
     */
    public void setCoporationName(String coporationName) {
        this.coporationName = coporationName;
    }

    /** 
     * Returns the apiId.
     * 
     * @return the apiId
     */
    public Integer getApiId() {
        return apiId;
    }

    /** 
     * Sets the apiId.
     * 
     * @param apiId the apiId
     */
    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    /** 
     * Returns the apiVerificationCode.
     * 
     * @return the apiVerificationCode
     */
    public String getApiVerificationCode() {
        return apiVerificationCode;
    }

    /** 
     * Sets the apiVerificationCode.
     * 
     * @param apiVerificationCode the apiVerificationCode
     */
    public void setApiVerificationCode(String apiVerificationCode) {
        this.apiVerificationCode = apiVerificationCode;
    }

    /** 
     * Returns the skillIndustry.
     * 
     * @return the skillIndustry
     */
    public Integer getSkillIndustry() {
        return skillIndustry;
    }

    /** 
     * Sets the skillIndustry.
     * 
     * @param skillIndustry the skillIndustry
     */
    public void setSkillIndustry(Integer skillIndustry) {
        this.skillIndustry = skillIndustry;
    }

    /** 
     * Returns the skillProductionEfficiency.
     * 
     * @return the skillProductionEfficiency
     */
    public Integer getSkillProductionEfficiency() {
        return skillProductionEfficiency;
    }

    /** 
     * Sets the skillProductionEfficiency.
     * 
     * @param skillProductionEfficiency the skillProductionEfficiency
     */
    public void setSkillProductionEfficiency(Integer skillProductionEfficiency) {
        this.skillProductionEfficiency = skillProductionEfficiency;
    }
}