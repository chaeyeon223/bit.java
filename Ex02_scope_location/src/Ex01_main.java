import kr.or.bit.common.Airplane;
import kr.or.bit.common.Car;

/*
 클래스=설계도=타입
 클래스 구성 요소 : (필드+함수) + 생성자 함수
 - 필드 (field) >> 고유정보, 상태정보, 참조(부품) 정보 자원 >> 변수
 - 함수 (function) >> 기능, 행위
 - 추가적으로 생성자 >> 필드의 초기화를 목적으로 하는 함수
 
 클래스, 필드, 생성자, 함수 : 영역(범위; scope) >> 접근자, 한정자, 수정자 (modifier)
 >> public, private, default, protected
 Ex1. public class Car{} // 자동차 설계도 : **다른 폴더 접근 가능
 Ex2. class AirPlane{} // 컴파일러가 자동(내부적)으로 default 접근자 
  >> default class Airplane{} : **같은 폴더에서만 접근 가능 / 다른 폴더에 있으면, 접근 불가  => 같은 폴더(패키지) 내에서 연습할 목적으로만 사용할 것!

//하나의 물리적인 자바 파일은 여러개의 클래스를 가질 수 있다
 Ex01_main.java >> class Test{}
 단 대표는 하나 >> public 클래스는 하나만 >> 나머지는 전부  default
*/
class Test{
	int data;
	public int p_iv;
	private int pri_iv; //숨긴다, 감춘다, 캡슐화
}

public class Ex01_main {

	public static void main(String[] args) {
		Car c=new Car();
		
		Airplane air=new Airplane();
		
		Test t=new Test();
		t.data=100;
		t.p_iv=200;

	}

}
