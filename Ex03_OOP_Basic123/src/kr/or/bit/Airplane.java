package kr.or.bit;

/*�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
<�䱸����>
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ��� Ȯ�� �ϴ� �۾��� �ʿ��մϴ� (������� Ȯ��)
3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();*/


public class Airplane {
	private int number;
	private  String name;
	private static int totalcount;
	
	//�������Լ�
	public Airplane(String name, int number) {
		this.number=number;
		this.name=name;
		totalcount++;
		System.out.printf("����� �̸� : %s \t ����� ��ȣ : %d",this.name,this.number);
		System.out.println("\n�� ��� :"+totalcount);
	}
	
	/*
	public void makePlane(int number,String name) {
		this.number=number;
		this.name=name;
		//���� 
		totalcount++;
		System.out.printf("����� �̸� : %s \t ����� ��ȣ : %d",name,number);
		System.out.println("\n�� ��� :"+totalcount);
	}
	*/

	 
	 
}
