/*
 ������ (��Ӱ���)
 ������ : �������� ����(����)�� ���� �� �ִ� �ɷ�
 
 c# : ������(overloading, override)...
 java : '��Ӱ���' ���� '�ϳ�'�� ���������� '������'�� Ÿ���� ���� �� �ִ� (**�ϳ��� �������� : �θ�Ÿ��)
 �θ�Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� ���� �� �ִ�
 
 ������ : ����) �θ�� �ڽĿ��� ���Ǿ��� .. ������ ..
 		   ���α׷�) �ڽ��� �θ𿡰� ���Ǿ���.. ������..
 
 */
class Tv2{ //�θ�(�Ϲ�ȭ, �߻�ȭ), �����ڿ�
	boolean power;
	int ch;
	
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class CapTv extends Tv2{ //CapTv�� Ư��ȭ, ��üȭ, ������ �ڿ��鸸 ǥ���ϸ� ��
	String text;
	String captionText() {
		return this.text="���� �ڸ� ó����...";
	}
}
public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv cap=new CapTv();
		cap.power();
		System.out.println("�������� : "+cap.power);
		cap.chUp();
		cap.chUp();
		cap.chUp();
		System.out.println(cap.ch);
		System.out.println(cap.captionText());

		Tv2 tv2=cap; //��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ� (������)
							//��, �θ�� �ڽ��� �ڿ��� ������ �� �ִ�
							//��, �����Ǹ� �����ϰ� ...
		System.out.println(tv2.toString()); //CapTv@2cb4c3ab
		System.out.println(cap.toString());//CapTv@2cb4c3ab
	}

}
