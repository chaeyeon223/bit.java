/*
 OOP 특징
1. 상속
2. 캡슐화(은닉화) >> private
3. 다형성

 상속
 java > child extends Base (extends)
 c# > child : Base (:)
 1) 다중 상속은 불가 
 2) 단일 상속만 가능 (할아버지 > 아버지 > 나 : 계층적 상속을 통해서 여러개의 클래스 상속 가능)
 3) 다중상속을 유일하게 지원하는 것 >> Interface
 4) **재사용성 
 5) 단점 : 초기 설계 비용
 6) 재사용성 >> 설계 >>비용 (시간. 비용 투자 >> 공통자원 만들기 : 부모생성 : 추상화)
 7) 상속관계에서의 memory구조 
 	(메모리에 올라가는 순서) : Grandfather > Father >Child 
 	
  사용자가(개발자) 만드는 모든 클래스는 default Object 클래스 상속
  class Car (extends Object)...생략
  Object (단군 ) : 모든 클래스의 root(최상위) = 모든 클래스의 부모 클래스 
*/
class Car{
	
}
class Grandfather extends Object{
	public Grandfather() {
		System.out.println("Grandfather");
	}
	public int gmoney=5000;
	private int pmoney=10000; //접근 불가 (객체, 상속관계)
}

class Father extends Grandfather{
	public Father() {
		System.out.println("Father");
	}
	public int fmoney=3000;
}

class Child extends Father{
	public Child() {
		System.out.println("Child");
	}
	public int cmoney=1000;
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.gmoney); //할아버지 돈
		System.out.println(child.fmoney); //아버지 돈
		
		Car c=new Car();
		
	}

}
