package com.binarysprite.evemat.page.product.data;

import java.math.BigDecimal;

/**
 * 
 * @author Tabunoki
 *
 */
public class Product {
	
	private final int id;
	
	private final String name;
	
	private final BigDecimal price;
	
	private int quantity;
	
	
	public Product(int id, String name, BigDecimal price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public BigDecimal getSales() {
		
		final BigDecimal sale = new BigDecimal(0);
		
		sale.add(price);
		sale.multiply(new BigDecimal(quantity));
		
		return sale;
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
		return "Product [name=" + name + ", price=" + price
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
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}