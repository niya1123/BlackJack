package Tramp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	protected Card card;
	private ArrayList<String> deck;
	private ArrayList<String> decks;
	
	public Deck() {
		card = new Card();
		deck = card.getCardList();
		decks = new ArrayList<>();
	}
	

	public ArrayList<String> strucktDeck(){
		
		for(int i = 0; i < 6; i++) {
			decks.addAll(deck);
		}
		return decks;
	}
	
	public String draw() {
        Collections.shuffle(decks);
        String drawCard = decks.get(0);
        decks.remove(0);
        return drawCard;
	}
	
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d.strucktDeck().size());
		System.out.println(d.draw());
	}
	
}
