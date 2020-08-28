/*
1. instance variable >> class Car {private String color} >>객체마다 다른 값을 가질 수 있는 변수 (default 있음)
2. local variable >> 클래스가 가지는 함수 안에서 사용되는 변수 class Car {public void move() {int speed;}} >> 사용전에 반드시 초기화 필요 (default 없음)
> main 함수 안에 만들어지는 모든 변수는 local variable
3. static variable : 객체 간 공유 자원, 객체 생성 이전에 메모리에 올라감 (class area, method area)
++static 은 member field에만 해당 (local variable은 필요없음)


*/

class Variable{
	int iv; //instance variable (초기화 필요 X) = member field
	// Variable v=new Variable() : heap 메모리에 생성(객체) >>iv 생성
	// Variable v2=new Variable() : heap 메모리에 생성(객체)>>iv 생성
	//iv 의 목적 : 정보를 담으려고 한다. >> 고유정보, 상태정보, 부품정보(참조타입;클래스)
	//iv는 생성되는 객체마다 다른 값을 가질 수 있다 >> 굳이 초기화 필요 없음 (default값 존재)
	//default값 >> int : 0 / double : 0.0 / char : ' ' / boolean : false / String : null / Car(참조타입) : null
	//iv 변수의 생성시점 : new 연산자를 통해서 heap에 객체가 만들어지고 나서 바로 객체 안에 생성
	
	void method() {
		int lv=0; //local variable (함수 안에 있는 변수) >> 사용전에 반드시 초기화 필요
		//함수가 호출되면 생성 - stack영역 >> 함수가 종료되면 같이 소멸
		//함수안에 block 변수  >>ex1. for(int i..) : for문 시작되면 생성...for 문 끝나면 소멸
	}
	static int cv;
	//class variable (클래스 변수) = static variable (객체간 공유 자원)
	//목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)>> heap영역에 생성된 객체들 간의 공통 자원
	//특징 <접근방법 >
	//1. 클래스 이름. static 변수명 >> variable.cv >>객체가 만들어지기 전에 접근 가능
	//보통의 경우 >> Variable v=new Variable(); >> v. 로 접근  ( but. static은 new로 생성되기 전에 접근 가능)
	//2. Variable v=new Variable(); >>v.cv == Variable v2=new Variable(); >>v2.cv
	//v.cv ==  v2.cv (같은 메모리 접근 : 주소를 통해서 접근)
	//=> Variable.cv == v.cv == v2.cv
	
	/*
	 * 4. 생성시점 : Hello.java > javac Hello.java > Hello.class >java.exe Hello 엔터 실행
	 * ... >class loader System 에 의해서 클래스를 정보(metadata : 설명) class area(method area)
	 * 올려요 --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개 ...기술 .. --이 클래스 안에 static
	 * variable 또는 static method 있으면 --이 녀석을 memory (class area) 에 올려 놓는다
	 */
}

public class Ex05_Variable_Scope {
	
	public static void main(String[] args) {
		Variable.cv=100;
		Variable v=new Variable();
		System.out.println(v.cv); //100
		
		Variable v2=new Variable();
		v2.cv=500;
		
		System.out.println(Variable.cv); //500
		

	}

}
