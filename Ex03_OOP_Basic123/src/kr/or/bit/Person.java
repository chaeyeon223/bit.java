package kr.or.bit;
//class == ���赵 == ������ Ÿ��
//���赵�� ��üȭ(�޸�) �� ���ؼ� ��ü ����
//��üȭ�� �� : ��ü , �ν��Ͻ�

//���赵 : �ʵ�(���� , ���� , ��ǰ)  + �Լ� ... + ������
// �Ӽ� + ��� 
public class Person {
	public String name; // �⺻ �� : null
	public int age;		 // �⺻ �� : 0
	public boolean power; // �⺻ �� : false
	
	//member field = instance variable
	//�ʱ�ȭ �ʿ� X >> default ���� ������ >> �ʱ�ȭ : ������ ó������ ���� �Ҵ� �޴� �� (default�� != �ʱ�ȭ��)
	//�ν��Ͻ� ������ �ʱ�ȭ���� �ʴ� ���� : �����Ǵ� ��ü(���)���� �ٸ� �̸��� ���� ����
	
	//���(����) : �޼ҵ�
	public void personPrint() { //void : ����Ÿ�� x
		System.out.println("name : "+name+"age : "+age+"power : "+power);
	}
}
