package kr.or.bit;

public class Card {
	public int number;
	public String kind;
	
	public static int h=50;
	public static int w=20;
	
	//ī���� ���� Ȯ�� ���
	public void cardInfo() {
		System.out.printf("���� ī���� ��ȣ : %d, ī���� ��� : %s, ���� : %d, �ʺ� : %d\n",number,kind,h,w);
	}
}
	