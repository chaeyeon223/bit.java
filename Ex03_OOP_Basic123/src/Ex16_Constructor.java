/*
 생성자 함수 (constructor)
1. 함수(특수한 목적)
2. 특수한 목적 : member field 의 초기화
Tip) 같은 기능
	1. { 일반 초기자 함수 }
	2. static {초기자 함수}
3. 일반함수와 다른점
	1) 함수 이름이 고정 (class 이름과 동일)
	2) 실행 시점 : 객체 생성(new) >> heap에 공간을 만들고 >> 변수가(member field) 올라감 >> '자동'으로 호출되는 함수'
	3) 실행 시점때문에 ... return type 없음 >> 'void' >>public (void) 클래스 이름 >> 생성자는 항상 void이기 때문에 생략 >> public 클래스 이름
4. 목적 : 생성되는 객체마다 '강제적'으로 다른 member field의 값을 초기화 할 수 있다
Ex. class Car{String color;}
	 - 자동차를 만들면 자동차는 무조건 색상을 하나 가져야 한다 -
	 class Car {String color="blue";}
	 - 자동차를 만들면 하나의 색상을 갖는데, 다른 색상을 가질 수 있다 - 
	 class Car {String color="blue";} >> new >> c.color="red";
** class Car{String color; public Car(String color){this.color=color}}
5. 생성자 함수도 (overloading) 가능
6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면, 
	** default 생성자 함수는 반드시 구현을 통해서만 사용 가능하다. (자동으로 생성해주지 않음)
*/

//당신이 만약 자동차를 만들면, 반드시 자동차의 이름을 부여하세요
class Car{
	String carname;
	//컴파일러가 알아서  함수를 만든다
	//개발자가 직접 생성자를 만들지 않으면, 컴파일러가 자동으로 아래 코드를 생성한다
	//public Car(){}
	public Car() {System.out.println("생성자 강제 구현"); }
	//내가 강제 구현하지 않아도 컴파일러가 자동으로 생성

}

class Car2{
	String carname;
	public Car2() { // default constructor >>객체를 만들면 무조건 실행되는 함수
		carname="포니";
	}
}

class Car3{
	String carname;
	public Car3() { //default constructor
		carname="포니";
	}
	public Car3(String name) { //overloading
		carname=name;
	}
}

class Car4{
	String carname;
	public Car4(String name) {
		carname=name;
	//default constructor 코드가 없음
	//예외적으로 : overloading 생성자를 구현했다면, default 는 자동으로 만들어지지 않음
	//설계자의 의도 : 자동차 생산시 무조건 이름을 넣으세요 ...
	}
}
public class Ex16_Constructor {

	public static void main(String[] args) {
		Car c=new Car(); //Car() : 함수를 호출해라
		Car2 c2=new Car2();
		System.out.println(c2.carname);

		Car3 c3=new Car3("카니발");
		System.out.println(c3.carname);
		Car4 c4=new Car4("k7");
		System.out.println(c4.carname);
	}

}
