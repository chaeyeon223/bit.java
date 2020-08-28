package kr.or.bit;

public class Card {
	public int number;
	public String kind;
	
	public static int h=50;
	public static int w=20;
	
	//카드의 정보 확인 기능
	public void cardInfo() {
		System.out.printf("현재 카드의 번호 : %d, 카드의 모양 : %s, 높이 : %d, 너비 : %d\n",number,kind,h,w);
	}
}
	