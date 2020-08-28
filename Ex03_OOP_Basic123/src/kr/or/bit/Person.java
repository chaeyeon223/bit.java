package kr.or.bit;
//class == 설계도 == 데이터 타입
//설계도는 구체화(메모리) 를 통해서 객체 생성
//구체화된 것 : 객체 , 인스턴스

//설계도 : 필드(고유 , 상태 , 부품)  + 함수 ... + 생성자
// 속성 + 기능 
public class Person {
	public String name; // 기본 값 : null
	public int age;		 // 기본 값 : 0
	public boolean power; // 기본 값 : false
	
	//member field = instance variable
	//초기화 필요 X >> default 값을 가진다 >> 초기화 : 변수가 처음으로 값을 할당 받는 것 (default값 != 초기화값)
	//인스턴스 변수를 초기화하지 않는 이유 : 생성되는 객체(사람)마다 다른 이름을 갖기 때문
	
	//기능(행위) : 메소드
	public void personPrint() { //void : 리턴타입 x
		System.out.println("name : "+name+"age : "+age+"power : "+power);
	}
}
