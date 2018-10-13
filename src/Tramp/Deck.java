package Tramp;

import java.util.ArrayList;

/**
 * Deckクラス
 * @author YK
 *
 */
public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<>();
	}
	
	public void structDeck() {
		for(int i = 0; i < 6; i++) {
			for(Mark m: Mark.values()) 
				for(Num n: Num.values()) 
					this.cards.add(new Card(n,m));
		}
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	
}
