/*
 추상클래스 <-> 인터페이스
 
 * 인터페이스 : 표준, 약속, 규칙, 규약을 만드는 행위
 
 <공통점>
 1. 스스로 객체 생성 불가 (new 사용 X) 
 	1.1 차이점 : 추상클래스 > 완성+미완성  /  인터페이스 > 모두 미완성
 2. 사용
 	- 추상클래스 : extends(확장)
 	- 인터페이스 : implements(구현)
 	class Car extends abclass { }
 	class Car implements Ia { } 
 	=> 가지고 있는 자원(추상자원)을 강제로 구현하도록 .. (재정의)
 	
  <차이점>
  1. 인터페이스는 다중 구현 가능  >> 작은 단위로 여러개 만들기  >> 필요한 것만 모아서 큰약속 만들 수 있음 (약속을 너무 크게 만들면 사용성 떨어짐 )
  class Test extends Object implements Ia, Ib, Ic
  인터페이스와 인터페이스는 extends 가능
  2. 추상클래스는 단일 상속만 가능 (계층적 상속)
  3. 추상클래스는 완성된 코드 + 미완성 코드
  4. 인터페이스는 상수를 제외하고, 전부 미완성 코드(함수)
 
  인터페이스는 소프트웨어 설계의 최상위 단계
  어떤 프로젝트를 진행할 때, 약속 정의
  
  ** 개발자(초급) **
  1. 인터페이스를 '다형성' 입장으로 접근 (인터페이스 부모 타입)
  2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능 (같은 부모를 갖는다)
  3. java API가 수많은 인터페이스 설계해놓음 > 직접 설계하지 않아도 됨 
  4. 인터페이스 (~able) : 날 수 있는, 수리할 수 있는 (설계)
  5. 객체간 연결고리 (객체간 소통) >> 다형성
 
 */
interface Ia{
	String print(); //구현부 없음, 약속 >> 출력할 때는 print / return은 문자
}
class Test implements Ia{
	@Override
	public String print() {
		
		return null;
	}
}
/*
 인터페이스 : 설계표준 >> 구현 >>재정의
 1. 실제 구현부를 가지고 있지 않다 (실행블럭 X), 약속만 갖고있음
     Ex. 시스템에서 이동하는 것이 move라는 이름을 사용하고, 이동시에는 좌표값을 받아야 한다
    >>  void move(inx x, int y); >> 실행블럭은 구현자가  재정의
    >> 활용 : collection (동적배열, 자료구조) >> Vector, **ArrayList, HastSet, **HashMap (여러개의 인터페이스 구현한 것)
 2. 생성방법
 	2.1 상수(final) : [public static final] int VERSION=1; >> (public static final)생략가능 : 컴파일러가 자동 생성
 	2.2 함수(method) : [public abstract] void run(); >> (public abstract) 생략가능
 	 Interface{
 	     int VERSION=1; //모든 필드는 public static final 생략
 	     void run(); //모든 함수는 public abstract 생략
 	     String move(int x, int y);
 	}
 	
 	interface lable { }
 	interface lable {int NUM=0;}
 	interface lable {void run();}
 	
 	class Test extends Object implements Ia, Ib, Ic {}
 3. 
 */

interface Ib{
	int AGE=100;
	String GENDER="남";
	
	String print();
	void message(String str);
}
interface Ic{
	int AGE=10;
	
	void  info();
	String val(String s);
}

class Test1 extends Object implements Ib, Ic{
	@Override
	public void info() {
		// TODO Auto-generated method stub
	}
	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex03_Interface {

	public static void main(String[] args) {
		Test1 t=new Test1();
		Ib ib=t; //부모는 자식타입의 주소를 가질 수 있다 (다형성)
		System.out.println(ib.AGE);
		System.out.println(ib.GENDER);
		ib.message("AA");
		
		Ic ic=t;
		System.out.println(ic.AGE);
	}

}
