package Week06;

import java.util.*;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private Map<String, Integer> nameValues = new HashMap<String, Integer>();
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	
	
	public Deck() {
		nameValues.put("Two", 2);
		nameValues.put("Three", 3);
		nameValues.put("Four", 4);
		nameValues.put("Five", 5);
		nameValues.put("Six", 6);
		nameValues.put("Seven", 7);
		nameValues.put("Eight", 8);
		nameValues.put("Nine", 9);
		nameValues.put("Ten", 10);
		nameValues.put("Jack", 11);
		nameValues.put("Queen", 12);
		nameValues.put("King", 13);
		nameValues.put("Ace", 14);
		for (Map.Entry<String, Integer> entry: nameValues.entrySet()) {
			for (String suit: suits) {
				cards.add(new Card(entry.getKey(), suit, entry.getValue()));
			}
		}
		
	}
	public void describe() {
		for (Card card: cards) {
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}

}
