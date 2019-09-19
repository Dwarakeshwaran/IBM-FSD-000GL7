package com.spring.product_service.shared;

public class ProductDto {
	
	private String id;
	private String name;
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public ProductDto() {
		super();
	}
	public ProductDto(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
