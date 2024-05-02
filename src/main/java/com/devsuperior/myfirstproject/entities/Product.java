package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double price;
	
	private Category category;
	
	
	//constru
	public Product(long l, String string, String string2, Category cat1) {
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}



}
