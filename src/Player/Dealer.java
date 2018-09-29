package Player;
import java.util.ArrayList;
import java.util.List;

import Tramp.Card;

/**
 * ディーラークラス.
 * @author YK
 *
 */
public class Dealer implements Player{
	
	protected Card card;
	private List<String> havingCards;
	
	public Dealer() {
		card = new Card();
		havingCards = new ArrayList<>();
	}
	
	public void distributeCards() {
		
	}
	
	public void distributeCardForPlayer() {
		
	}
	
	public void distributeCardForDealer() {
		
	}
	
	public int getScore() {
		int score = 0;
		for(String havingCard: havingCards) {
			score += card.getPoint(havingCard);
		}
		return score;
	}
	
	public void CheckCard() {
		
	}
	
	public void payBet(){
		
	}

	@Override
	public void drawCard() {
		int minPoint = 17;
		int nowPoint = 0;
		String drawCardName;
		while(true) {
			drawCardName = card.drawCard();
			havingCards.add(drawCardName);
			nowPoint += card.getPoint(drawCardName);
			if(nowPoint >= minPoint) break;
		}
	}

	
	
}
