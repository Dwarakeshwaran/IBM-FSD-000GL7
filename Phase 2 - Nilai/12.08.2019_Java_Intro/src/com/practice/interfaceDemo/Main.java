package com.practice.interfaceDemo;

public class Main {
	public static void main(String[] args) {
		Honda bike = new Honda();
		bike.accelerate();
		bike.brake();
		
		Vehicle yamaha = new Vehicle() {

			@Override
			public void accelerate() {
				System.out.println("Yamaha gets acclerated");
				
			}

			@Override
			public void brake() {
				System.out.println("Yamaha gets stopped");
				
			}
			
		};
		yamaha.accelerate();
		yamaha.brake();
	}

}
