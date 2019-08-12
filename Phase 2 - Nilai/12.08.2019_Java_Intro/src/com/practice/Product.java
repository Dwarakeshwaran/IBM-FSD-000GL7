//Blank final variable
//final methods cannot be overridden
//final classes cannot be extended for example, String Class cannot be extended since it is a Final Class

package com.practice;

public class Product {
	private int currentRate;
	
	private static int item;
	static {
		item=0;
	}
	
	public Product() {
		item++;
	}
	
	
	public static int getItem() {
		return item;
	}

	public int getCurrentRate() {
		return currentRate;
	}

	public void setCurrentRate(int currentRate) {
		this.currentRate = currentRate;
	}

	
	public static void main(String[] args) {
		Product pro = new Product();
		pro = new Book();
		
		System.out.println(Product.getItem());
		pro = new Tv();
		System.out.println(Product.getItem());
		//System.out.println(book.item);
		
		
	}

}

class Book extends Product{
	public String name;
	public String author;
	
	
}

class Electronics extends Product{
	public int mYear;
}

class Tv extends Electronics{
	public int rate;
	

}


