package com.binarysprite.evemat.page.blueprint.data;

import java.io.Serializable;

/**
 * 
 * @author Tabunoki
 * 
 */
public class Blueprint implements Serializable {

	private int ID;

	private int blueprintTypeID;

	private String blueprintTypeName;

	private int materialEfficiency;

	private int productionEfficiency;

	private GroupSelect groupSelect;

	public Blueprint() {
		super();
	}

	public Blueprint(int iD, int blueprintTypeID, String blueprintTypeName, int materialEfficiency,
			int productionEfficiency, GroupSelect groupSelect) {
		super();
		ID = iD;
		this.blueprintTypeID = blueprintTypeID;
		this.blueprintTypeName = blueprintTypeName;
		this.materialEfficiency = materialEfficiency;
		this.productionEfficiency = productionEfficiency;
		this.groupSelect = groupSelect;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBlueprintTypeID() {
		return blueprintTypeID;
	}

	public void setBlueprintTypeID(int blueprintTypeID) {
		this.blueprintTypeID = blueprintTypeID;
	}

	public String getBlueprintTypeName() {
		return blueprintTypeName;
	}

	public void setBlueprintTypeName(String blueprintTypeName) {
		this.blueprintTypeName = blueprintTypeName;
	}

	public int getMaterialEfficiency() {
		return materialEfficiency;
	}

	public void setMaterialEfficiency(int materialEfficiency) {
		this.materialEfficiency = materialEfficiency;
	}

	public int getProductionEfficiency() {
		return productionEfficiency;
	}

	public void setProductionEfficiency(int productionEfficiency) {
		this.productionEfficiency = productionEfficiency;
	}

	public GroupSelect getGroupSelect() {
		return groupSelect;
	}

	public void setGroupSelect(GroupSelect groupSelect) {
		this.groupSelect = groupSelect;
	}
}