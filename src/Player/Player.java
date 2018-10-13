package Player;

import Manager.Hand;
import Tramp.Deck;

/**
 * Playerクラス.ゲームプレイヤー(Challenger)とDealerのinterface.
 * @author YK
 *
 */
public abstract class Player {
	
	protected Deck deck;
	protected Hand hand;
	private boolean win;
	
	public Player(Deck deck) {
		this.deck = deck;
		this.hand = new Hand();
		win = false;
	}
	
	public boolean isBust() {
		return hand.score() > 21;
	}
	
	public int getScore() {
		return hand.score();
	}
	
	public boolean getWin() {
		return win;
	}
	
	public void setWin(boolean win) {
		this.win = win;
	}
	
	
	
	
}
