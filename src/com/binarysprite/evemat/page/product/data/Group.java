package com.binarysprite.evemat.page.product.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Tabunoki
 * 
 */
public class Group implements Serializable {

	/**
	 * 
	 */
	private int id;

	/**
	 * 
	 */
	private String groupName;

	/**
	 * 
	 */
	private String characterName;

	/**
	 * 
	 */
	private final List<Product> products = new ArrayList<Product>();

	/**
	 * 
	 */
	private final List<Material> materials = new ArrayList<Material>();


	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id id を設定します。
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 *            groupName を設定します。
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param characterName
	 *            characterName を設定します。
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @return materials
	 */
	public List<Material> getMaterials() {
		return materials;
	}

}
