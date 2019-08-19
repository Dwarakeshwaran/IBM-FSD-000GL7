package practice.Collections;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    private String str[];
    private Set<String> set;
    
    public Main() throws InputMismatchException {
        
        System.out.print("Number of Elements in the Array: ");
        str = new String[sc.nextInt()];
        for(int i=0; i<str.length; i++) {
            System.out.println("Name: ");
            str[i]=sc.next().toString().toLowerCase();
        }
        set = new HashSet<String>();
        for(String s: str) {
            if(!set.add(s))
            {
                System.out.println("Duplicate element cannot be added...");
            }
        }
    }
    
    public void displayCollection() {
        for(String ss: set) {
            System.out.println(ss.toString());
        }
        //iterator should be used for good practice
        Iterator<String> i =set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }

}