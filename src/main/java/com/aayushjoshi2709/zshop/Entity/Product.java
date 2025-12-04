package com.aayushjoshi2709.zshop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity()
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Float price;
	
	private String sku;
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Float getPrice() {
		return this.price;
	}
	
	public String getSku() {
		return this.sku;
	}
	
	public Product setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
		return this;
	}
	
	public Product setPrice(Float price) {
		if(price != null) {
			this.price = price;
		}
		return this;
	}
	
	public Product setSku(String sku) {
		if(sku != null && !sku.isEmpty()) {
			this.sku = sku;
		}
		return this;
	}
	
}
