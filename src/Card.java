import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	
	/**
	 * 山札を構築します.
	 * @return ハートの1などのStringが入ったListが返される.
	 */
	public List<String> structDeck(){
		//returnのためのList
		List<String> card = new ArrayList<>();
		//拡張for文を用いてデッキを構築.4×13の計52枚のトランプが生成される.
		for(String mark: MARK) {
			for(String num: NUM) {
				card.add(mark+" の "+num);
			}
		}
		return card;
	}
	
	/**
	 * 山札からカードを引くためのもの.
	 * @param deck 山札.
	 * @return 引いたカード.
	 */
	public String drawCard(List<String> deck) {
		Random rnd = new Random();
		return deck.get(rnd.nextInt(52));
	}
	
	/**
	 * カードのスコアを管理するもの.
	 * @return カードのスコア.
	 */
	public int getScore(String drawCard) {
		String num = drawCard.split(" ")[2];
		return (num.equals("J") || num.equals("Q") || num.equals("K")) ? 10: Integer.parseInt(num);
	}
	
	//テスト用.後に削除予定.
	public static void main(String[] args) {
		Card card = new Card();
		System.out.println("山札を生成します.");
		List<String> deck = card.structDeck();
		System.out.println("山札を生成しました.");
		System.out.println("カードを１枚引きます.");
		String drawCard = card.drawCard(deck);
		System.out.println(drawCard);
		System.out.println("引いたカードのスコアを表示します.");
		System.out.println(card.getScore(drawCard));
	}
	
}
