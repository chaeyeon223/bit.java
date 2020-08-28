/*
 this : ��ü �ڽ��� ����Ű�� this >> this.empno, this.ename
 this : �����ڸ� ȣ���ϴ� this >> this(100,"red")
 
 ���
 �θ�. �ڽ�
 
 super(�����ڽ��� �θ��� ���� �ּҰ��� ���� �ϴ� ��) : ��Ӱ��迡���� �θ� ���� ���� ��� = �θ�ü�� �ּҰ�
 1. ��Ӱ��迡�� �θ��ڿ� ����
 2. ��Ӱ��迡�� �θ��� �����ڸ� ȣ�� (���������)
 //this�� ����ϳ�, super�� '��Ӱ���'
 **�ڽ��� '���(�Լ�) �ȿ�����' ��� 
 
 
 
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻ ������ �Լ�");
	}
	void method() {
		System.out.println("�θ� �޼ҵ�");
	}
	
	Base(String basename){
		this.basename=basename;
		System.out.println("�θ� : "+this.basename);
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived �⺻ ������ �Լ�");
	}
	
	Derived(String dname){
		super(dname); //�θ� ������ ȣ��
		this.dname=dname;
		System.out.println("�ڽ� : "+this.dname);
	}
	
	@Override
	void method() {
		//System.out.println("�ڽ� �޼ҵ�");
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
