package kr.or.bit;

/*기능(행위) 만드는 방법
함수 (Function, Method)
method : 행위 또는 기능 (최소 단위) : 하나의 함수는 하나의 기능만 구현
ex) 먹는다, 잔다, 걷는다, 

클래스 : 필드 + 함수 + 생성자
ex)  게임기 - 동전 넣고 ... 게임만 하고 돌려주는 것 없음
ex) 인형뽑기 - 동전 넣고 ... 인형 받기

** 함수는 호출에 의해서만 동작 (call)
1. void / parameter(0) : void print(Stiring str) {실행코드} //동전 하나 넣는 게임
2. void / parameter(X) : void print() {실행코드} //동전 안넣는 게임
3. return type, parameter(O) : int print(int data) {return 100;}
4. return type, parameter(X) : int print() {return 100;}
- void : return value 없음
- return type : 8가지 기본 타입 + String + Class, Array, Collection, Interface ...
ex. boolean print (boolean bo){return true/false;}
ex. Car print(){Car c=new Car(); return c;}
- parameter :  8가지 기본 타입 + String + Class, Array, Collection, Interface ...
ex. void print(int a, int b, int c, int d){} >>> print (1,2,3,4) //같은 개수만큼 다 줘야함

* 함수의 이름 - 의미있는 단어의 조합
ex. getChannelNumber()
*/

public class Fclass {
	public int data;
	//1
	public void m() {
		System.out.println("일반 함수 : void, parameter(X)");
	}
	//2
	public void m2(int i) {
		System.out.println("일반 함수 : void, parameter(O)");
		System.out.println("praameter value (scope 함수내부) : "+i);
	}
	//3
	public int m3() {
		return 0; //return 타입이 존재하면 반드시 return 키워드 필요
	}
	//4
	public int m4(int data) {
		return 10+data;
	}
	
	//확장
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	private int subSum(int i) { //private : 같은 클래스에서만 사용 가능
		//클래스 내부 : public, private, default 구분 x
		//다른 함수를 도와주는 함수 : 내부에서 호출 >> 공통, 반복적인 내용에 사용 
		return i+100;
	}
	public void callSubSum() {
		int result=subSum(100);
		System.out.println(result);
	}
	private int operationMethod(int data) { //클래스 내부에서 공통함수로 사용
		return data*200;
	}
	public int opSum(int data) {
		int result=operationMethod(data);
		if (result>0){
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz.
	//a와 b 둘 중에 큰 값을 return 하는 함수를 만드세요
	//**return 사용 최소화
	public int getMax(int a, int b) {
		int result=0;
		if (a>=b) {
			result= a;
		}else {
			result= b;
		}
		return result;
	}
	//100점
	public int max(int a, int b) {
		return (a>b)? a:b;
	}
	//함수를 사용할 때 기본타입 (값타입)
	//함수에 참조타입
	//return type >> 클래스
	public TV tCall() { //Tv 타입을 가지는 **주소**를 리턴 >>1. new... 2. 다른 주소 가져오기
		//return null;
		TV t=new TV();
		return t;
	}
	//더 효율적인 코드
	public TV tCall2() {
		return new TV();
	}
	
	public void tCall3(TV t) {//TV 타입을 가지는 주소
		System.out.println("t 주소값 : "+t);
		//1. tCall3(new TV())
		//2. TV t= new TV(); //t객체 조작 가능
		//	  tCall3(t)
	}
	
	
	
	
}
