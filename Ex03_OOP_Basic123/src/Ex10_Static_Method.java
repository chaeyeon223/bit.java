
public class Ex10_Static_Method {

	public void method () {
			System.out.println("�� �Ϲ��Լ���");
		}
		
	public static void smethod() {
			System.out.println("��  static �Լ���");
		}
		
	public static void main(String[] args) {
		smethod();
		Ex10_Static_Method.smethod(); //static �Լ� �ٷ� ȣ�� ����(���� Ŭ������ ��) = smethod();
		Ex10_Static_Method ex10=new Ex10_Static_Method();
		ex10.method();

	}

}
