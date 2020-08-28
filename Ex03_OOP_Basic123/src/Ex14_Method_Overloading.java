/*
 OOP (객체지향 프로그래밍)
1. 상속 (재사용성 )
2. 캡슐화 (은닉화 ) : private >> setter / getter (직접할당을 막고 간접할당을 통해 데이터 보호)
3. 다형성 : 하나의 타입으로 여러개의 객체를 가질 수 있는 것 

 method overloading
- 하나의 이름으로 여러가지 기능을 하는 함수
//		System.out.println(); >> println() 오버로딩을 구현하고 있는 함수
 1. 오버로딩은 성능향상 (X) >> 개발자 편하게 사용하려고 설계자가 배려
 2. 오버로딩 모르면 20개의 다른 이름 만들면 됨
 문법) 함수 이름은 같고, parameter의 '개수'와 '타입'을 다르게.
 1. 함수 이름은 같아야 함
 2. parameter의  개수 또는 타입은 달라야함
 3. return type : 오버로딩의 판단기준이 아님
 4. parameter 의 순서가 다름을 인정
*/
class Human{
	String name;
	int age;
}
class OverTest{
	int add(int i) {
		return 0+i;
	}
	int  add(int i, int j){
		System.out.println("오버로딩 :"+i+j);
		return i+j;
	}
	String add(String s){
		System.out.println("오버로딩 :"+s);
		return "hello"+s;
	}
	
	String add(String s, int i){ //parameter의 순서가 다름을 인정
		return s+i;
	}
	String add(int i, String s) {
		return null;
	}
	
	void add(Human human) { //참조타입 parameter의 오버로딩
		human.name="홍길동";
		human.age=10;
		System.out.println(human.age);
	}
}

public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot=new OverTest();
		int result=ot.add(100, 200);
		String add=ot.add("안녕", 500);
		System.out.println(result);
		System.out.println(add);
		
		Human h=new Human();
		ot.add(h);
		System.out.println(h.name);
		
		
	}

}
