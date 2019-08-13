package com.practice.singletonDP;

public class Singleton {
	private static Singleton single;
	public int number;
	
	public static Singleton createObject() {
		if(single == null)
		{
			single = new Singleton();
		}
		return single;
	}

}
