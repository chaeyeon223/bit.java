/*
 this : 객체 자신을 가르키는 this >> this.empno, this.ename
 this : 생성자를 호출하는 this >> this(100,"red")
 
 상속
 부모. 자식
 
 super(현재자식이 부모의 접근 주소값을 갖게 하는 것) : 상속관계에서의 부모에 대한 접근 방법 = 부모객체의 주소값
 1. 상속관계에서 부모자원 접근
 2. 상속관계에서 부모의 생성자를 호출 (명시적으로)
 //this와 비슷하나, super는 '상속관계'
 **자식의 '기능(함수) 안에서만' 사용 
 
 
 
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	void method() {
		System.out.println("부모 메소드");
	}
	
	Base(String basename){
		this.basename=basename;
		System.out.println("부모 : "+this.basename);
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
	}
	
	Derived(String dname){
		super(dname); //부모 생성자 호출
		this.dname=dname;
		System.out.println("자식 : "+this.dname);
	}
	
	@Override
	void method() {
		//System.out.println("자식 메소드");
		super.method();
	}

}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d=new Derived();
		System.out.println(d.basename);
		System.out.println(d.dname);
		d.method();
		
		Derived d2=new Derived("hello");
	}

}
