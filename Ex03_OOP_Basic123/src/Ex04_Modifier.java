import kr.or.bit.Car;

/*
접근자 ; modifier
public (공유): package 구분 없이 공유
private (개인): 클래스 내부 공유 자원, 참조변수 입장에서는 접근 불가(사용 불가)

객체지향 특징
1. 캡슐화(은닉화) 
> 클래스 내부 자원 (member field , member method) 캡슐화 적용
ex. private int number : 직접 할당을 막고 간접 할당을 통해 자원 보호  >> 간접 : 함수사용 (setter/getter)
ex. private void call() : 클래스 내부에서 다른 함수의 보조 역할 (공통 함수) >> 외부에서 접근 불가

  setter/getter
  1. setter만 만든다 (O) : 내부 (class)에서만 쓰겠다 > 별로 쓰이지는 않음
  2. getter만 만든다 (X) : 읽기만 하겠다 (값을 바꾸지 않는다)
  3. getter / setter 모두 만든다 : write / read (보통 둘다 만들어놓음)

*/
public class Ex04_Modifier {
	public static void main(String[] args) {
		Car car=new Car();
		car.setSpeed(10);
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
	}

}
