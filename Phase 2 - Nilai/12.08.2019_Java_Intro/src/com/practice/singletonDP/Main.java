package com.practice.singletonDP;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.createObject();
		//s1.createObject();
		Singleton s2 = Singleton.createObject();
		
		s1.number = 2;
		System.out.println(s1.number);
		s2.number = 4;
		System.out.println(s1.number);
		
		System.out.println(s1 == s2);

	}

}
