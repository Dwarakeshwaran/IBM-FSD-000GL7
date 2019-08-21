package assignment.password_validation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		String password = scan.nextLine();
		
		if(UserMainCode.checkPassword(password))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");

	}

}
