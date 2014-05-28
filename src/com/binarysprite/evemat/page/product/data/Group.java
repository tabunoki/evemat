package com.binarysprite.evemat.page.product.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Tabunoki
 * 
 */
public class Group {
	
	/**
	 * 
	 */
	private String groupName;

	/**
	 * 
	 */
	private final List<Product> products = new ArrayList<Product>();

	/**
	 * 
	 */
	private final List<Material> materials = new ArrayList<Material>();

	/**
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName groupName を設定します。
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
