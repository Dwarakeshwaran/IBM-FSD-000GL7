package com.app.mymavenapp;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String option;
		boolean check = true;
		String tf="";
		String name;
		String heroName;
		String power;
		String id;
		CRUD crud = new CRUD();
		crud.createSession();
		System.out.println("Welcome To Hero Database");
		System.out.println("Here you can add the details about your favourite heros \n\n");
		
		
		while(check) {

			System.out.println("1. Add Heroes");
			System.out.println("2. Delete Heroes\n");
			
			System.out.println("Enter your Option: ");
			option = sc.nextLine();
			
			switch(option) {
			case "1":
				System.out.println("Enter Original Name: ");
				name = sc.nextLine();
				System.out.println("Enter Hero Name: ");
				heroName = sc.nextLine();
				System.out.println("Enter Power Level: ");
				power = sc.nextLine();
				App hero = new App(name,heroName,Integer.parseInt(power));
				crud.InsertData(hero);
				System.out.println("Enter 0 to exit");
				tf = sc.nextLine();
				if(tf == "0")
					check = false;
				break;
				
			case "2":
				System.out.println("Enter the id to be deleted: ");
				id = sc.nextLine();
				crud.deleteData(Integer.parseInt(id));
				System.out.println("Enter 0 to exit");
				//crud.viewData();
				tf = sc.nextLine();
				if(tf == "0")
					check = false;
				break;
				
			default:
				System.out.println("Invalid Input");
			}
		}
		
		System.out.println("Thank You!!");
		
	}

}

