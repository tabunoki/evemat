package com.binarysprite.evemat.page.blueprint.data;

import java.io.Serializable;

/**
 * 
 * @author Tabunoki
 * 
 */
public class GroupSelect implements Serializable {

	private final int id;

	private final String groupName;

	public GroupSelect(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
}