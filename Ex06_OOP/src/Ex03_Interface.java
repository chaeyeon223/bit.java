/*
 �߻�Ŭ���� <-> �������̽�
 
 * �������̽� : ǥ��, ���, ��Ģ, �Ծ��� ����� ����
 
 <������>
 1. ������ ��ü ���� �Ұ� (new ��� X) 
 	1.1 ������ : �߻�Ŭ���� > �ϼ�+�̿ϼ�  /  �������̽� > ��� �̿ϼ�
 2. ���
 	- �߻�Ŭ���� : extends(Ȯ��)
 	- �������̽� : implements(����)
 	class Car extends abclass { }
 	class Car implements Ia { } 
 	=> ������ �ִ� �ڿ�(�߻��ڿ�)�� ������ �����ϵ��� .. (������)
 	
  <������>
  1. �������̽��� ���� ���� ����  >> ���� ������ ������ �����  >> �ʿ��� �͸� ��Ƽ� ū��� ���� �� ���� (����� �ʹ� ũ�� ����� ��뼺 ������ )
  class Test extends Object implements Ia, Ib, Ic
  �������̽��� �������̽��� extends ����
  2. �߻�Ŭ������ ���� ��Ӹ� ���� (������ ���)
  3. �߻�Ŭ������ �ϼ��� �ڵ� + �̿ϼ� �ڵ�
  4. �������̽��� ����� �����ϰ�, ���� �̿ϼ� �ڵ�(�Լ�)
 
  �������̽��� ����Ʈ���� ������ �ֻ��� �ܰ�
  � ������Ʈ�� ������ ��, ��� ����
  
  ** ������(�ʱ�) **
  1. �������̽��� '������' �������� ���� (�������̽� �θ� Ÿ��)
  2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ��� (���� �θ� ���´�)
  3. java API�� ������ �������̽� �����س��� > ���� �������� �ʾƵ� �� 
  4. �������̽� (~able) : �� �� �ִ�, ������ �� �ִ� (����)
  5. ��ü�� ����� (��ü�� ����) >> ������
 
 */
interface Ia{
	String print(); //������ ����, ��� >> ����� ���� print / return�� ����
}
class Test implements Ia{
	@Override
	public String print() {
		
		return null;
	}
}
/*
 �������̽� : ����ǥ�� >> ���� >>������
 1. ���� �����θ� ������ ���� �ʴ� (����� X), ��Ӹ� ��������
     Ex. �ý��ۿ��� �̵��ϴ� ���� move��� �̸��� ����ϰ�, �̵��ÿ��� ��ǥ���� �޾ƾ� �Ѵ�
    >>  void move(inx x, int y); >> ������� �����ڰ�  ������
    >> Ȱ�� : collection (�����迭, �ڷᱸ��) >> Vector, **ArrayList, HastSet, **HashMap (�������� �������̽� ������ ��)
 2. �������
 	2.1 ���(final) : [public static final] int VERSION=1; >> (public static final)�������� : �����Ϸ��� �ڵ� ����
 	2.2 �Լ�(method) : [public abstract] void run(); >> (public abstract) ��������
 	 Interface{
 	     int VERSION=1; //��� �ʵ�� public static final ����
 	     void run(); //��� �Լ��� public abstract ����
 	     String move(int x, int y);
 	}
 	
 	interface lable { }
 	interface lable {int NUM=0;}
 	interface lable {void run();}
 	
 	class Test extends Object implements Ia, Ib, Ic {}
 3. 
 */

interface Ib{
	int AGE=100;
	String GENDER="��";
	
	String print();
	void message(String str);
}
interface Ic{
	int AGE=10;
	
	void  info();
	String val(String s);
}

class Test1 extends Object implements Ib, Ic{
	@Override
	public void info() {
		// TODO Auto-generated method stub
	}
	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex03_Interface {

	public static void main(String[] args) {
		Test1 t=new Test1();
		Ib ib=t; //�θ�� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ� (������)
		System.out.println(ib.AGE);
		System.out.println(ib.GENDER);
		ib.message("AA");
		
		Ic ic=t;
		System.out.println(ic.AGE);
	}

}
