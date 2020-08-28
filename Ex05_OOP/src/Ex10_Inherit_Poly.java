/*
 다형성 (상속관계)
 다형성 : 여러가지 성질(형태)를 가질 수 있는 능력
 
 c# : 다형성(overloading, override)...
 java : '상속관계' 에서 '하나'의 참조변수가 '여러개'의 타입을 가질 수 있다 (**하나의 참조변수 : 부모타입)
 부모클래스 타입의 참조변수가 여러개의 자식클래스 객체를 담을 수 있다
 
 다형성 : 현실) 부모는 자식에게 조건없이 .. 모든것을 ..
 		   프로그램) 자식이 부모에게 조건없이.. 모든것을..
 
 */
class Tv2{ //부모(일반화, 추상화), 공통자원
	boolean power;
	int ch;
	
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class CapTv extends Tv2{ //CapTv의 특수화, 구체화, 고유한 자원들만 표현하면 됨
	String text;
	String captionText() {
		return this.text="현재 자막 처리중...";
	}
}
public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv cap=new CapTv();
		cap.power();
		System.out.println("전원상태 : "+cap.power);
		cap.chUp();
		cap.chUp();
		cap.chUp();
		System.out.println(cap.ch);
		System.out.println(cap.captionText());

		Tv2 tv2=cap; //상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다 (다형성)
							//단, 부모는 자신의 자원만 접근할 수 있다
							//단, 재정의만 제외하고 ...
		System.out.println(tv2.toString()); //CapTv@2cb4c3ab
		System.out.println(cap.toString());//CapTv@2cb4c3ab
	}

}
