package Main;

import Player.Player;
import Player.Challenger;
import Player.Dealer;
import Tramp.Deck;

/**
 * 勝負させるクラス
 * @author YK
 *
 */
public class BlackJack {
	protected Deck deck;
	protected Player challenger;
	protected Player dealer;
	
	public BlackJack() {
		deck = new Deck();
		challenger = new Challenger(deck);
		dealer = new Dealer(deck);
	}
	
	public void showInfo(String info) {
		System.out.println(info);
	}
	
	public void showResult() {
		if(challenger.getWin()) showInfo("あなとの勝利です！");
		else if(dealer.getWin()) showInfo("あなたの負けです…");
		else showInfo("引き分けです");
	}
	
	public void singleTon() {
		deck.structDeck();
		deck.suffle();
	}
	
	public void match() {
		
	}
	
}
