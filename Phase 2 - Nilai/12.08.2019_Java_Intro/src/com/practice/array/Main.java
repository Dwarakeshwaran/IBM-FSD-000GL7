package com.practice.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayJava arr = new ArrayJava();
		arr.createArray(26);
		arr.setArray();
		System.out.println(arr.getArray());
		
		int[] array = {11,33,10,9,5};
		
		Arrays.sort(array); 
		
		for(int i=0;i<array.length;i++)
			System.out.print(" " + array[i]);
		
		
		System.out.println("\n INDEX: " + Arrays.binarySearch(array, 33));
	}

}
