package com.practice.array;

import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		ArrayJava arr = new ArrayJava();
		arr.createArray(26);
		arr.setArray();
		System.out.println(arr.getArray());
		
		
		
		int[] array = {11,33,10,9,5};
		int[] arrayReverse= {};
		Arrays.sort(array); //bubble sort
//		for(int i = 0 , j = array.length-1; i < array.length && j >= 0  ; i++ , j--)
//		{
//				arrayReverse[i] = array[j];
//		}
		
		for(int i=0;i<array.length;i++)
			System.out.print(" " + array[i]);
//		for(int i=0;i<array.length;i++)
//			System.out.print(" " + arrayReverse[i]);
		
		System.out.println("\n INDEX: " + Arrays.binarySearch(array, 33));
	
		
		
		ArrayJava intArray = new ArrayJava();
		
		intArray.createIntArray(5);
		intArray.push(3);
		intArray.push(6);
		intArray.push(9);
		intArray.push(12);
		intArray.push(15);
		intArray.pop();
		intArray.pop();
		intArray.pop();
		intArray.pop();
		intArray.pop();
		intArray.pop();
		
		intArray.getIntArray();
	}
	

}
