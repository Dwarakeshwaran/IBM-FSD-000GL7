package com.assignment.abstractclass;

public class Tester {
	public static void main(String[] args) {
		Line test1 = new Line(0,20);
		Line test2 = new Line(0,10);
		
		
		System.out.println(test1.isLesser(test1,test2));
	}

}
