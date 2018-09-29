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
	
	/*
	 * 山札.
	 */
	private List<String> deck;
	
	/**
	 * コンストラクタ.フィールドのdeckを初期化.
	 */
	public Card() {
		this.deck = new ArrayList<>();
	}
	
	/**
	 * 山札を構築します.
	 * @return ハートの1などのStringが入ったListが返される.
	 */
	public List<String> structDeck(){
		//拡張for文を用いてデッキを構築.4×13の計52枚のトランプが生成される.
		for(String mark: MARK) {
			for(String num: NUM) {
				deck.add(mark+" の "+num);
			}
		}
		return deck;
	}
	
	/**
	 * 山札からカードを引くためのもの.Randomを用いて山札から１枚カードを引く.
	 * その際,引いたカードはdeckから削除しておく.
	 * @param deck 山札.
	 * @return 引いたカード.
	 */
	public String drawCard() {
		//新たに山札を構築しない限り,減って行く一方のはず.
		Random rnd = new Random();
		int index = rnd.nextInt(deck.size());
		String card = deck.get(index);
		deck.remove(index);
		return card;
	}
	
	/**
	 * カードの得点を管理するもの.
	 * @return カードの得点.
	 */
	public int getPoint(String drawCard) {
		String num = drawCard.split(" ")[2];
		return (num.equals("J") || num.equals("Q") || num.equals("K")) ? 10: Integer.parseInt(num);
	}
	
	/**
	 * フィールドdeckのゲッター
	 * @return deck デッキ
	 */
	public List<String> getDeck(){
		return deck;
	}
	
	//テスト用.後に削除予定.
	public static void main(String[] args) {
		Card card = new Card();
		System.out.println("山札を生成します.");
		card.structDeck();
		System.out.println("山札を生成しました.");
		int i = 52;
		while(true) {
			System.out.println("残り" + i + "回");
			System.out.println("カードを１枚引きます.");
			String drawCard = card.drawCard();
			System.out.println(drawCard);
			System.out.println("引いたカードのスコアを表示します.");
			System.out.println(card.getPoint(drawCard));
			i--;
			if(card.getDeck().isEmpty()) {
				System.out.println("残り" + i + "回"); break;
			}
		}
		
	}
	
}
