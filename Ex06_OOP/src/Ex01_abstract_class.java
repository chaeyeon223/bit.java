/*
 추상클래스
 >> 미완성 클래스 (설계도)
 	1. 완성된 코드 + 미완성 코드
 	2. 완성(함수) 실행블럭이 있는 함수 + 미완성(함수) 실행블럭이 없는 함수 >> public void run();   ({}>(x) )
 	3. 완성된 클래스 (new가능) - 미완성 클래스 (스스로 객체 생성 불가)
 	
 	정리
 	1. 추상클래스 (미완성) ...스스로 객체 생성 불가 (new 사용 불가)
 	2. 추상클래스는 결국 ... 완성된 클래스 만드는 것이 목적 ... 상속을 통해서 완성해라 ~
 	3. 상속관계에서 미완성된 자원(추상함수) 완성해라  (구현) >> 추상함수를 재정의 해라 (override) 
 	
 	설계자 입장에서
 	>> 의도 : 반드시 재정의해라 >> 강제적 구현 목적 (믿지 못하니까)
 
 */
abstract class Abclass{
	//abstract class 안에서 최소 1개의 추상함수(자원)를 만들겠다
	//완성된코드
	int pos;
	void run() {
		pos++;
	}
	//미완성코드
	abstract void stop(); //추상함수 (실행블록 없음) >> 재정의 강제
}
class  Child extends Abclass{
	@Override
	void stop() {
		this.pos=0;
		System.out.println(this.pos);
	}
}

class Child2 extends Abclass{
	@Override
	void stop() {
		this.pos=-1;
		System.out.println(this.pos);
	}
}


public class Ex01_abstract_class {
	public static void main(String[] args) {
	Child ch=new Child();
	ch.run();
	Child2 ch2=new Child2(); 
	ch2.run();
	//다형성
	Abclass ab=ch; //부모타입의 참조변수는 자식타입의 객체주소를 가질 수 있다 (단,부모는 자기타입의 객체만 볼 수 있다) 
	ab.run();
	ab.stop();
	//******************부모타입 접근 ... 그자원이 추상함수라면 ? 재정의(자식에서) >> 재정의된 함수 호출
	}
}
