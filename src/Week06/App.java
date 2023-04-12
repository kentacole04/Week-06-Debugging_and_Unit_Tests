package Week06;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 1, enter your name:");
		Player p1 = new Player(sc.nextLine());
		System.out.print("Player 2, enter your name:");
		Player p2 = new Player(sc.nextLine());
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(myDeck);
			} else {
				p2.draw(myDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card oneFlip = p1.flip();
			Card twoFlip = p2.flip();
			oneFlip.describe();
			twoFlip.describe();
			if (oneFlip.getValue() > twoFlip.getValue()) {
				p1.incrementScore();
				System.out.println(p1.getName() + " wins this turn");
				System.out.println();
			} else {
				p2.incrementScore();
				System.out.println(p2.getName() + " wins this turn");
				System.out.println();
			}
			System.out.println(p1.getName() + ": " + p1.getScore());
			System.out.println(p2.getName() + ": " + p2.getScore());
			System.out.println();
			
		}
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + "  wins!");
		}
		if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " wins!");
		}
		if (p2.getScore() == p1.getScore()) {
			System.out.println("Draw game!");
		}
		

	}

}
