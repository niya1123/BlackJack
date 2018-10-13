package Tramp;

import java.util.ArrayList;

/**
 * トランプのカードの情報を納めたクラス.
 * @author YK
 *
 */
public class Card {
	
	/*
	 * カードのマークを納めたもの.finalで固定.
	 */
	final private String MARK[] = {"ハート", "スペード", "クラブ", "ダイヤ"};
	/*
	 * カードの番号を納めたもの.finalで固定.
	 */
	final private String NUM[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	private ArrayList<String> cardList;
	
	public Card() {
		cardList = new ArrayList<>();
	}
	/**
	 * 指定したカードの得点を返します.
	 * @param card 指定されたカード名
	 * @return 得点
	 */
	public int getPoint(String card) {
		String card_num = card.split(" ")[2];
		return (card_num.equals("J") || card_num.equals("Q") || card_num.equals("K")) ? 10: Integer.parseInt(card_num);
	}
	
	/**
	 * カードのListを得ます.
	 * @return
	 */
	public ArrayList<String> getCardList() {
		for(String mark: MARK) {
			for(String num: NUM) {
				cardList.add(mark+" の "+num);
			}
		}
		return cardList;
	}
	
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.getCardList());
	}
}
