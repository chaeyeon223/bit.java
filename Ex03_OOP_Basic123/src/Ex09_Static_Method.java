/*
1. static method : 설계자가 static 함수를 만든다는 것은 ... 많이 사용하니까, 편하게 쓰세요. (new 객체 생성 없이 사용 가능)
ex. Math m =new Math(); (X) >> Math.Random();

*/
class StaticClass{
	int iv; //instance variable
	
	static int cv; //static variable
	
	void m() { //일반 함수
		//일반함수
		//1. iv 값은 가지고 놀 수 있다. 
		iv=100;
		//2. cv 값을 가지고 놀 수 있다 >> static 자원이 미리 올라가기 때문 (생성 시점: static 자원은 '항상' 일반 자원보다 메모리에 먼저 생성된다)
		cv=200; //=StaticClass.cv=200;
		System.out.println(cv);
	}
	
	static void sm() { //static method
		//static 함수
		//1. iv 값을 가지고 놀 수 없다. >> static이 메모리에 올라갔을 시점에, iv는 생성 x
		//. cv 값은 가지고 놀 수 있다.
		cv=300;
		System.out.println(cv);
	}
	
	
}

public class Ex09_Static_Method {

	public static void main(String[] args) {
		//new 객체 안만든 시점 > static 자원은 사용 가능
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		StaticClass sc=new StaticClass();
		sc.m();
		System.out.println(sc.iv);
	}

}
