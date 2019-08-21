package assignment.contact_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of contacts");
		
		String noc;
		noc = sc.nextLine();
		
		String name;
		String email;
		String phone;
		String address;
		
		List<Contact> contactList = new ArrayList<Contact>();
		for(int i=1; i<=Integer.parseInt(noc); i++) {
			
			System.out.println("Enter contact "+i+" detail ");
			System.out.print("Enter Name : ");
			name = sc.nextLine();
			System.out.print("Enter Email: ");
			email = sc.nextLine();
			System.out.print("Enter Phone Number: ");
			phone = sc.nextLine();
			System.out.print("Enter Address: ");
			address = sc.nextLine();
			System.out.println("\n");
			
			contactList.add(new Contact(name, email, phone, address));
		}
		Collections.sort(contactList);
		Iterator<Contact> iterator = contactList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		
		
		

	}

}
