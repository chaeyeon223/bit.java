import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53장 제작
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
		
		
		//클라이언트 "크기가 잘못 됐어요"
		//현실세계 > 만들어진것 버리고 다시 생산
		//프로그램 세계 > 버리지 않고 가능 ... h=70 / w=50
		//1. 한장씩 수정하기 (53번)
		//2. 설계도 변경 > 기존 것 버리고 새로 만들기
		//3. static 활용하면 > static 변수만 바꾸면 전부 바꿀 수 있음
	}

}
