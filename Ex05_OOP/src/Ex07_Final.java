/*
 변수 <-> 상수
 상수 : 한번값이 초기화되면 변경 불가 (프로그램이 실행되는동안 바뀌면 안되는 것들)
 상수자원 : 고유값(주민등록번호), 수학(PI), 버전번호, 시스템 관리 번호 ... 
 - 관용적으로 대문자 사용
 java : final int NUM=10;
 c# : const integer NUM=10;
 
 final 키워드 
 1. 클래스 앞에 >> final class Car{} , final Math >> 상속금지 (마지막 클래스, 더이상 확장 X)
 2. 함수 앞에 >> public final void print(){} >> (상속)재정의 금지 (Override)
 					 public static final void print(){} >> 객체간 공유 함수
3. 변수 앞에 >> final int NUM=10;
 */

class Vcard{
	final String KIND="heart";
	final int NUM=10;
	
	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2{ //설계도 제작 상수 초기화 보장 (생성자)
	final String KIND;
	final int NUM;
	Vcard2(){ 
		this.KIND="heart";
		this.NUM=10;
	}
	Vcard2(String kind, int num){ //카드53장의 모양과 숫자는 다르다(한번 정해지면 변경 불가)
		this.KIND=kind;
		this.NUM=num;
	}
	@Override
	public String toString() {
		//return "Ex07_Final [toString()=" + super.toString() + "]";
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard v=new Vcard();
		System.out.println(v.KIND);
		v.method();
		
		Vcard2 v1=new Vcard2("spade",1);
		System.out.println(v1.toString());
		
		Vcard2 v2=new Vcard2("spade",2);
		System.out.println(v2.toString());
		
		Vcard2 v3=new Vcard2("spade",3);
		System.out.println(v3.toString());

	}


}
