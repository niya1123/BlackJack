package Manager;

import java.util.ArrayList;

import Tramp.Card;


public class Hand {
	
	private ArrayList<Card> cards;
	
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public int score() {
		int total_score = 0;
		
		for(Card card: cards) {
			total_score += card.getPoint();
		}
		
		return total_score;
	}
	
	
	
}
