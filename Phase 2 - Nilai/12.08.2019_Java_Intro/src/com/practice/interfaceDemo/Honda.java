package com.practice.interfaceDemo;

public class Honda implements Vehicle{

	@Override
	public void accelerate() {
		
		System.out.println("Honda gets acclerated");
	}

	@Override
	public void brake() {
		System.out.println("Honda gets stopped");
		
	}

}
