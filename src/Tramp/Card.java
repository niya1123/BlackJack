package Tramp;


/**
 * トランプのカードの情報を納めたクラス.
 * @author YK
 *
 */
public class Card {
	
	private Num num;
	private Mark mark;
	
	public Card(Num num, Mark mark) {
		this.num = num;
		this.mark = mark;
	}
	
	public String getCardName() {
		return this.mark.toString() + " の " + this.num.getNum();
	}
	
	public int getPoint() {
		return (num.getNum().equals("J") || num.getNum().equals("Q") || num.getNum().equals("K")) ? 10: Integer.parseInt(num.getNum());
	}
	
	public static void main(String[] args) {
		Card c = new Card(Num.eight, Mark.スペード);
		System.out.println(c.getCardName());
		System.out.println(c.getPoint());
	}
}
