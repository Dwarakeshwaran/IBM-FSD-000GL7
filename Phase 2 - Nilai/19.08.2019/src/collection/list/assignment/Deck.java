package collection.list.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Deck {

	public static List<Card> deckObj = new ArrayList<Card>();

	static {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deckObj.add(new Card(s, r));
			}
		}
		// System.out.println(deckObj);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hand : ");
		int hand = sc.nextInt();
		System.out.print("Card: ");
		int card = sc.nextInt();
		Collections.shuffle(deckObj);
		// System.out.println(deckObj);
		int count = 1;
		
		for (int i = 0; i < hand*card; i++) {
			
				
				System.out.print(deckObj.get(i));
				if((i+1)%card == 0)
				{
					System.out.print("Hand "+count+++ " has the above mentioned cards");
					System.out.println("\n");
				}
					
				
				
					
			
		}

	}
}
