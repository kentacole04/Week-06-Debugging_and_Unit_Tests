package Week06;

import java.util.*;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
		setScore(0);
	}
	
	public void describe() {
		System.out.println(name + "'s hand:");
		for(Card card: hand) {
			card.describe();
		}
		
	}
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
}
