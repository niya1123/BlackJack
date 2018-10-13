package Tramp;

public enum Num {
	one("1") ,two("2"), three("3"), four("4"), five("5"), six("6"), seven("7"), eight("8"), nine("9")
	, ten("10"), j("J"), q("Q"), k("K");
	
	private String num;
	
	private Num(String num) {
		this.num = num;
	}
	
	public String getNum(){
	    return this.num;
	}
}
