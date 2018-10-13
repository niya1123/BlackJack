package Main;

import Tramp.Card;
import Tramp.Deck;

public class BlackJack {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.structDeck();
		int i = 0;
		for(Card c: d.getCards()) {
			i++;
			System.out.println(i+": "+c.getCardName());
		}
	}
}
