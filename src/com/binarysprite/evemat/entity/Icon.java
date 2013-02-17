package com.binarysprite.evemat.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = IconListener.class)
@Table(name = "ICON")
public class Icon {

    /**  */
    @Id
    @Column(name = "ICON_ID")
    Integer iconId;

    /**  */
    @Column(name = "ICON_FILE")
    String iconFile;

    /**  */
    @Column(name = "DESCRIPTION")
    String description;

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

    /** 
     * Returns the iconFile.
     * 
     * @return the iconFile
     */
    public String getIconFile() {
        return iconFile;
    }

    /** 
     * Sets the iconFile.
     * 
     * @param iconFile the iconFile
     */
    public void setIconFile(String iconFile) {
        this.iconFile = iconFile;
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