package kr.or.bit;

// �� (�����ڿ�) - �Ϲ�ȭ, �߻�ȭ  : �� �� �ִ�, ������ ...>> �θ� 

public class Bird {
	//������
	public void fly() {
		System.out.println("flying");
	}
	//�������� �ǵ� : protected >> ���� ����ϴ� ����� ... moveFast�� '�ʿ信 ���� ������' ������ ���ھ� ~ (������ 90, ���ص� ���� ������, �����ϸ� �ض�~)
	protected void moveFast() {
		fly();
	}
}
