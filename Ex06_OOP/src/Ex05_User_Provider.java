/*
 user 사용자 : provider 제공자
 
 class A {}
 class B {}
 관계 : A는 B를 사용합니다
 1. 상속 : A extends B
 2. 포함 : A 클래스 안에서 member field로 B 사용 / class A {B b;}
  	2.1 부분포함
  	2.2 전체포함
  	
 //전체집합 - Composition(합성연관)
 class B {}
 class A {
 	int i;
 	B b; //A는 B를 사용 (포함)
 	A(){
 		b=new B();
 	}
 }
 >>B는 독자적 생성 불가 ... A라는 객체가 만들어져야 B도 만들 수 있다
 >>A a= new A(); >> A객체 생성과 동시에 B객체 생성(운명 : 같이 태어나서 같이 죽는다) >> Composition(합성연관)
-------------------------------------------------------------
 //부분집합 - aggregation(집합연관)
class B {}
class A {
	int i;
	B b; //A는 B를 사용 (참조)
	A() {}
	A(B b){
	  this.b=b;
	}
}
>>B b=new B();
>>A a=new A(b);
>>A를 만들었다고 B를 만드는 것은 아님 (운명 X) >> aggregation(집합연관)
--------------------------------------------------------------
 A는 B를 참조한다 (= B가 member field로 선언)
 member field로 클래스를 갖고있는가 ? O : 연관관계 / X : 의존관계 (ex. Buyer)
 -------------------------------------------------------------
 //의존관계(함수) - 의존관계 (dependency)
 class B{}
 class A{
 	int i;
 	//member field로 B타입을 갖지 않음 >> 함수의 파라미터로 받음
 	void print(B c){}
 	B print(){
 		B=new B();
 		return b;
 	}
 }
 >>B b=new B();
 >>A a=new A();
 >>a.print(b);
 >>B b2=a.print();
 */
interface Icall{
	void m();
}

class D implements Icall{
	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m() 재정의");
	}
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m() 재정의");
	}
}

class C {
	void method(Icall ic) { //ic는 Icall을 구현한 모든 객체의 주소를 받을 수 있다 (확장성)
		ic.m();
	}
}

//현대적인 프로그래밍 방식 (interface) >> 유연하게 대충...

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c=new C();
		D d=new D();
		F f=new F();
		c.method(d);
		c.method(f);

	}

}
