import kr.or.bit.Emp;

/*






 */
class Test2{
	int x=100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2{
	int x=300; //c# : "부모 무시하기" //쓰지 말기 !!!
	
	@Override
	void print() {
		System.out.println("자식이 부모 함수를 재정의");
	}
	void print(String str) { //오버로딩
		System.out.println("나는 오버로딩 함수야"+str);
	}
}
public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3=new Test3();
		System.out.println(t3.x);
		t3.print();
		t3.print("~ 반가워");
		
		Emp emp=new Emp(1000,"홍길동");
		System.out.println(emp.toString());
		
		//Java API가 제공하는 수많은 클래스가 Object 클래서의 toString() 재정의 ...
		

	}

}
