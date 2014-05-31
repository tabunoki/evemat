package com.binarysprite.evemat.page.product.data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author Tabunoki
 *
 */
public class Material implements Comparable<Material>, Serializable {
	
	private final int id;
	
	private final String name;
	
	private final BigDecimal price;
	
	private int quantity;

	
	public Material(int id, String name, BigDecimal price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public BigDecimal getCosts() {
		
		final BigDecimal cost = new BigDecimal(0);
		
		cost.add(price);
		cost.multiply(new BigDecimal(quantity));
		
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Material o) {
		
		return this.name.compareTo(o.name);
	}
}