package com.practice.array;

public class ArrayJava {
	
	private char[] arr;
	
	//Below is nothing but the getter and setter for the Array
	public void createArray(int length)
	{
		arr = new char[length];
		
	}
	
	public void setArray()
	{
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = (char) ('A'+i);//A should be single quotes
		}
	}
	
	public char[] getArray()
	{
		return arr;
	}

}
