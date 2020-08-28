
public class Ex10_Static_Method {

	public void method () {
			System.out.println("나 일반함수야");
		}
		
	public static void smethod() {
			System.out.println("나  static 함수야");
		}
		
	public static void main(String[] args) {
		smethod();
		Ex10_Static_Method.smethod(); //static 함수 바로 호출 가능(같은 클래스일 때) = smethod();
		Ex10_Static_Method ex10=new Ex10_Static_Method();
		ex10.method();

	}

}
