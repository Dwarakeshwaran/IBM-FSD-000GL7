package com.practice.client;

public class ConstructorChaining {
	private int x;
	private int y;
	private int z;
	
	public ConstructorChaining() {
		this(10);
	}
	
	public ConstructorChaining(int x) {
		//this.x = x;
		this(x,20);
	}
	
	public ConstructorChaining(int x, int y) {
		//this.y = y;
		this(x,y,100);
	} 
	public ConstructorChaining(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public String getDetails() {
		return "X:"+this.x+"Y:"+this.y+"Z:"+this.z;
	}
	

}
