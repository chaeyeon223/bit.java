import kr.or.bit.common.Airplane;
import kr.or.bit.common.Car;

/*
 Ŭ����=���赵=Ÿ��
 Ŭ���� ���� ��� : (�ʵ�+�Լ�) + ������ �Լ�
 - �ʵ� (field) >> ��������, ��������, ����(��ǰ) ���� �ڿ� >> ����
 - �Լ� (function) >> ���, ����
 - �߰������� ������ >> �ʵ��� �ʱ�ȭ�� �������� �ϴ� �Լ�
 
 Ŭ����, �ʵ�, ������, �Լ� : ����(����; scope) >> ������, ������, ������ (modifier)
 >> public, private, default, protected
 Ex1. public class Car{} // �ڵ��� ���赵 : **�ٸ� ���� ���� ����
 Ex2. class AirPlane{} // �����Ϸ��� �ڵ�(������)���� default ������ 
  >> default class Airplane{} : **���� ���������� ���� ���� / �ٸ� ������ ������, ���� �Ұ�  => ���� ����(��Ű��) ������ ������ �������θ� ����� ��!

//�ϳ��� �������� �ڹ� ������ �������� Ŭ������ ���� �� �ִ�
 Ex01_main.java >> class Test{}
 �� ��ǥ�� �ϳ� >> public Ŭ������ �ϳ��� >> �������� ����  default
*/
class Test{
	int data;
	public int p_iv;
	private int pri_iv; //�����, �����, ĸ��ȭ
}

public class Ex01_main {

	public static void main(String[] args) {
		Car c=new Car();
		
		Airplane air=new Airplane();
		
		Test t=new Test();
		t.data=100;
		t.p_iv=200;

	}

}
