import java.util.ArrayList;

/*
 Today Point
 Generic : jdk 1.5 (필수기능)
 
 Collection 클래스 >> 데이터 기본 저장공간 : Object
 1. Object 타입 : 넣을 때는 좋지만, 꺼낼 때 문제 >> 타입 강제(객체 생성시 타입 지정) >>제너릭
 2. 타입의 안정성 문제  >> 타입 강제
 3. 강제 형변환(casting) X : ex. (Car)Object (X)

 */
//클래스 설계할 때 제너릭 적용
class MyGen<T>{ //type parameter
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age=100;
	
}
public class Ex06_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen=new MyGen<String>();
		mygen.add("문자열");
		String str=mygen.get();
		System.out.println(str);
		
		ArrayList list=new ArrayList();
		//저장공간의 타입은 object[] elements
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		//개선된 for문으로 출력
		for(Object value:list) {
			//객체인 것과 아닌 것 구분해야함 (참조타입의 경우 주소 출력) >> 복잡!!!
			if(value instanceof Person) {
				Person p=(Person)value;
				System.out.println(p.age);
			}else {
			System.out.println(value);
			}
		}
		
		ArrayList<Person> plist=new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		plist.add(new Person());
		for(Person value:plist) {
			System.out.println(value.age);
		}
		
	}

}
