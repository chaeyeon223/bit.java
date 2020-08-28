/*
 String 클래스(문자열)
 - 수많은 함수 (문자열 조작 : 자르고, 합치고 ...)
 >> static 함수 + 일반함수
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str=""; //default >> null or ""
		//사용방법 : int, double 처럼 사용 
		String [] arr= {"aaa","bbb","ccc"};
		for(String s:arr) {
			System.out.println(s);
		}
		
		////////////////////////////////////////
		String str1="홍길동";
		System.out.println(str1.length());
		System.out.println(str1.toString());
		System.out.println(str1); //주소값이 안나옴 >> 뒤에 toString()생략
		//Object가 가지는 toString() 재정의 >> 값을 출력하도록
		String stra=new String("홍길동");
		//1. String name="가나다라마"; >>
		//String은 내부적으로  char[]메모리를 사용한다 >> char[] >> [가][나][다][라][마]
		//length사용 가능 (방의 개수 세기)					
		String name="가나다라마";
		System.out.println(name.length());
		//class String extends Object{char[] ... @Override toString{...} length()  }
		
		String str2="AAA";
		String str3="AAA";
		System.out.println(str2);
		System.out.println(str3.toString());
		System.out.println(str2==str3);
		// == 연산자 비교  (값 비교)>> str2(주소값), str3(주소값)
		//메모리에 같은 문자열이 있으면, 새로 만들지 않고 재사용 ... >> 같은 주소값 참조
		System.out.println(str2.equals(str3)); // 주소를 찾아가서 그 안에 있는 값 비교
		
		//그런데..반전
		String str4=new String("BBB");
		String str5=new String("BBB");
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
		//new : 새로운 메모리 생성 (재사용 X) >> 주소값 서로 다름
		
		}

}
