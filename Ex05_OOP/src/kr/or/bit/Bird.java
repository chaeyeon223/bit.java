package kr.or.bit;

// 새 (공통자원) - 일반화, 추상화  : 날 수 있다, 빠르다 ...>> 부모 

public class Bird {
	//공통기능
	public void fly() {
		System.out.println("flying");
	}
	//설계자의 의도 : protected >> 나를 상속하는 당신은 ... moveFast를 '필요에 따라서 재정의' 했으면 좋겠어 ~ (강제성 90, 안해도 문제 없지만, 웬만하면 해라~)
	protected void moveFast() {
		fly();
	}
}
