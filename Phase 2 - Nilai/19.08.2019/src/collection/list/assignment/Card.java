package collection.list.assignment;

public class Card {
	
	public Suit suit;
	public Rank rank;
	
	
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card: "+"[Suit:"+suit+" Rank:"+rank+"]"+"\n";
	}
	

}
