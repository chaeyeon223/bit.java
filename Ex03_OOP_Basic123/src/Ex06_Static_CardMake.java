import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53�� ����
		/*Card c=new Card();
		c.number=1;
		c.kind="heart";
		c.cardInfo();
		
		Card c2=new Card();
		c2.number=2;
		c2.kind="heart";
		c2.cardInfo();*/
		
		Card c=new Card();
		c.number=1;
		c.kind="heart";
		c.h=70; 
		c.w=50;
		c.cardInfo();
		
		Card c2=new Card();
		c2.number=2;
		c2.kind="heart";
		c2.cardInfo();
		
		Card c3=new Card();
		c3.number=2;
		c3.kind="star";
		c3.cardInfo();
		
		
		//Ŭ���̾�Ʈ "ũ�Ⱑ �߸� �ƾ��"
		//���Ǽ��� > ��������� ������ �ٽ� ����
		//���α׷� ���� > ������ �ʰ� ���� ... h=70 / w=50
		//1. ���徿 �����ϱ� (53��)
		//2. ���赵 ���� > ���� �� ������ ���� �����
		//3. static Ȱ���ϸ� > static ������ �ٲٸ� ���� �ٲ� �� ����
	}

}
