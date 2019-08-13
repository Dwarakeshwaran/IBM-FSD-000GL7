package com.practice.array;

public class ArrayJava {
	
	private char[] charArr;
	private int[] intArr;
	public int length;
	public int top = 0;
	//Below is nothing but the getter and setter for the Array
	public void createArray(int length)
	{
		charArr = new char[length];
		
	}
	
	
	public void setArray()
	{
		for(int i = 0; i<charArr.length; i++)
		{
			charArr[i] = (char) ('A'+i);//A should be single quotes
		}
	}
	
	public char[] getArray()
	{
		return charArr;
	}
	
	public void createIntArray(int length)
	{
		intArr = new int[length];
		this.length = length;
	}
	
	public void push(int value)
	{
		if(this.length <= top)
			System.out.println("Overflow!");
		else
		{
			intArr[top] = value; 
			top++;
		}
		
	}
	public void pop()
	{
		if(top <= 0)
			System.out.println("Underflow!");
		else
		{
			intArr[top-1]=0;
			top--;
		}
			
		
	}
	
	public void getIntArray()
	{
		for(int i = 0; i<intArr.length ; i++)
		{
			System.out.print(intArr[i] + " ");
		}
	}

}
