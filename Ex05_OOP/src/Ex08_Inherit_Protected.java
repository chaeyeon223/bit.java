import kr.or.bit.Pclass;

/*
 public, private, default, '��Ӱ���'���� protected
 protected: ��鼺 (����) >> default / public 
 1.  ����� ���� Ŭ���� �ȿ��� protected : default�� ���
 2.  ��Ӱ��迡���� �ǹ̸� ������.
 */

class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k; //=default >>�Ϲ� Ŭ���������� protected����� ������ ����
}
class Child2 extends Pclass{
	void method() {
		this.j=10;
		this.k=1000; //��Ӱ��迡�� �ڽ��� �θ��� protected �ڿ��� ���� ���� (publicó�� ��� ����)
		System.out.println(this.k);
		
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p=new Pclass();
		p.j=500;
		System.out.println(p.j); // (�ٸ���Ű��) pŬ������ public ������ ���� ����
		
		Child2 ch=new Child2();
		ch.method();
	}

}
