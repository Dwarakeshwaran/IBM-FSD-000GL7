package com.spring.product_service.model;

public class ResponseModel {
	
	private String name;
	private int price;
	public ResponseModel(String name, int price) {
		super();
		
		this.name = name;
		this.price = price;
	}
	public ResponseModel() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
