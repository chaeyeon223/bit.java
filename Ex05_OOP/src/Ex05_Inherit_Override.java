import kr.or.bit.Emp;

/*






 */
class Test2{
	int x=100;
	void print() {
		System.out.println("�θ��Լ� Test2");
	}
}

class Test3 extends Test2{
	int x=300; //c# : "�θ� �����ϱ�" //���� ���� !!!
	
	@Override
	void print() {
		System.out.println("�ڽ��� �θ� �Լ��� ������");
	}
	void print(String str) { //�����ε�
		System.out.println("���� �����ε� �Լ���"+str);
	}
}
public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3=new Test3();
		System.out.println(t3.x);
		t3.print();
		t3.print("~ �ݰ���");
		
		Emp emp=new Emp(1000,"ȫ�浿");
		System.out.println(emp.toString());
		
		//Java API�� �����ϴ� ������ Ŭ������ Object Ŭ������ toString() ������ ...
		

	}

}
