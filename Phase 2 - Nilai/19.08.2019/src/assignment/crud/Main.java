package assignment.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Student Details Management System \n");
		int choice = 0;
		
		boolean yn = true;
		char yesorno;
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		
		while (yn) {
			
			s.viewOptions();
			Collection<Object> list = new ArrayList<Object>();
			
			System.out.print("\nEnter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				s.addStudents();
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				break;
			case 2:
				int id;
				System.out.print("Enter the id to be deleted: ");
				id = sc.nextInt();
				s.deleteStudent(id);
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				break;
			case 3:
				System.out.print("Enter the id to be Searched: ");
				id = sc.nextInt();
				s.searchStudent(id);
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				break;
			case 4:
				System.out.print("Enter the id to be modified: ");
				id = sc.nextInt();
				s.modifyStudent(id);
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				break;
			case 5:
				s.displayDetails();
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				break;
			default :
				System.out.println("You've entered an Invalid Option.");
				System.out.print("Type 'y' for continue 'n' for exit ");
				yesorno = sc.next().charAt(0);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.print("\n");
				if(yesorno == 'y')
					yn = true;
				else
					yn = false;
				
			}
			
		}
		
		
		 System.out.println("Thank You");
	}

}
