package assignment.practice;

import java.util.*; 
import java.lang.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*; 
  
  

// Driver class 
class Main 
{ 
    public static void main (String[] args) throws ParseException 
    { 
        ArrayList<Student> ar = new ArrayList<Student>(); 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ar.add(new Student(111, "bbbb", "london",sdf.parse("11/12/2000"))); 
        ar.add(new Student(131, "aaaa", "nyc",sdf.parse("10/12/2000"))); 
        ar.add(new Student(121, "cccc", "jaipur",sdf.parse("13/12/2000"))); 
        System.out.printf("%-15s","ABC");
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 