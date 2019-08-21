package assignment.treemap_letterfrequency;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		String sentence;
		System.out.println("Enter the input String: ");
		sentence = sc.nextLine();
		
		
		
		LetterSequence lq = new LetterSequence(sentence);
		
		map = lq.computeFrequency();
		lq.displayLetterFrequency(map);
	}

}
