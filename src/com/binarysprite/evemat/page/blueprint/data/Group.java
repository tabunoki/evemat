package com.binarysprite.evemat.page.blueprint.data;

import java.io.Serializable;

/**
 * 
 * @author Tabunoki
 * 
 */
public class Group implements Serializable {

	private int ID;

	private String groupName;

	private int productionTime;

	private CharaterSelect characterSelect;

	public Group() {
		super();
	}

	public Group(int iD, String groupName, int productionTime, CharaterSelect characterSelect) {
		super();
		ID = iD;
		this.groupName = groupName;
		this.productionTime = productionTime;
		this.characterSelect = characterSelect;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getProductionTime() {
		return productionTime;
	}

	public void setProductionTime(int productionTime) {
		this.productionTime = productionTime;
	}

	public CharaterSelect getCharacterSelect() {
		return characterSelect;
	}

	public void setCharacterSelect(CharaterSelect charaterSelect) {
		this.characterSelect = charaterSelect;
	}
}