package com.practice.client;
import com.practice.ConstructorChaining;
import com.practice.MyDate;
import com.practice.Account;
import com.practice.Product;
public class Client {

	public static void main(String[] args) {
		MyDate myDate = new MyDate();
		myDate.setDay(17);
		myDate.setMonth(02);
		myDate.setYear(1998);
		System.out.println(myDate.getDay());
		System.out.println(myDate.getMonth());
		myDate.getYear();
		
		ConstructorChaining cc = new ConstructorChaining(20);
		System.out.println(cc.getDetails());
		
		Account acc1 = new Account("Dwaki",1000);
		Account acc2 = new Account("Dwaki",1000);
		
		System.out.println(acc1.equals(acc2));
		
		Product pro = new Product();
		//Product book = new Book();
		System.out.println(pro.item);

	}

}
