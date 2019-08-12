package com.practice.client;
import com.practice.MyDate;
import com.practice.client.ConstructorChaining;
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

	}

}
