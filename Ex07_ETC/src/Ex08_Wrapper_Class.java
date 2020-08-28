import java.util.ArrayList;

/*
 자바 8가지 기본타입 (값타입) 
 Wrapper class : 8가지 기본타입에 대해서 객체 형태로 사용가능하도록 만든 것
 -기본타입 대신에 객체 형태 타입을 사용해야함 >> '제너릭', Static (문자 > 정수,실수)
 1. 매개변수(parameter)로 객체가 요구될 때
 2. 기본형 값이 아닌 객체 형태로 값이 저장되어야 할 때
 3. 객체간 값 비교 할 때
 4. 타입 변환시 처리가 요구될 때
 
 
 
 
 
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i=100;
		Integer n=new Integer(500);
		System.out.println("n : "+n); //toString 재정의 (원래는 주소값이 나와야함)
		System.out.println(n.MAX_VALUE); //static/final (객체 생성하지 않고도 사용할 수 있음)
		System.out.println(n.MIN_VALUE);
		
		//POINT
		//parameter로 사용 (제너릭) : 객체로 생성할 때 타입 강제 >> Object를 막고 타입을 강제 ... downcasting하지 않도록...
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(100);
		//li.add("A"); >> 정수타입만 넣도록 생성
		li.add(200);
		for(int value:li) { //return타입 고민 X
			System.out.println(value);
		}
		Integer i2=new Integer(100);
		Integer i3=new Integer(100);
		System.out.println(i2==i3); //==(참조타입에서)주소값 비교
		System.out.println(i2.equals(i3));//equals(Object자원) >> String 클래스 재정의, Integer 클래스 재정의 (실제 값을 비교하도록 )
		
		int i4=100;
		int i5=100;
		System.out.println(i4==i5); //값비교
		
		
		Integer t=new Integer(500);
		intMethod(t);//t라는 참조변수가 갖고있는 '값'을 넘김 
		integerMethod(t); //t라는 참조변수가 갖고있는 '주소값' 넘김
		
		
	}
	static void integerMethod(Integer i) {
		System.out.println("integer param : "+i); //toString 재정의 : 값 리턴
		System.out.println(i.MAX_VALUE);
	}
	static void intMethod(int i) {
		System.out.println("int param : "+i);
	}
}
