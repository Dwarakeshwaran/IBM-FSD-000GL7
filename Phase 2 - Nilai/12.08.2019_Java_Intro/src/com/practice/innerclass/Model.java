package com.practice.innerclass;

public class Model {
	public void modelMethod()
	{
		System.out.println("Model Got Called");
	}
	
	public class Square {
		public void squareMethod()
		{
			System.out.println("Square Got Called");
			modelMethod();
		}
	}
	
	

}
