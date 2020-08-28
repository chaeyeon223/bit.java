/*
 ������ �Լ� (constructor)
1. �Լ�(Ư���� ����)
2. Ư���� ���� : member field �� �ʱ�ȭ
Tip) ���� ���
	1. { �Ϲ� �ʱ��� �Լ� }
	2. static {�ʱ��� �Լ�}
3. �Ϲ��Լ��� �ٸ���
	1) �Լ� �̸��� ���� (class �̸��� ����)
	2) ���� ���� : ��ü ����(new) >> heap�� ������ ����� >> ������(member field) �ö� >> '�ڵ�'���� ȣ��Ǵ� �Լ�'
	3) ���� ���������� ... return type ���� >> 'void' >>public (void) Ŭ���� �̸� >> �����ڴ� �׻� void�̱� ������ ���� >> public Ŭ���� �̸�
4. ���� : �����Ǵ� ��ü���� '������'���� �ٸ� member field�� ���� �ʱ�ȭ �� �� �ִ�
Ex. class Car{String color;}
	 - �ڵ����� ����� �ڵ����� ������ ������ �ϳ� ������ �Ѵ� -
	 class Car {String color="blue";}
	 - �ڵ����� ����� �ϳ��� ������ ���µ�, �ٸ� ������ ���� �� �ִ� - 
	 class Car {String color="blue";} >> new >> c.color="red";
** class Car{String color; public Car(String color){this.color=color}}
5. ������ �Լ��� (overloading) ����
6. ����� ���� overloading ������ �Լ��� �ϳ��� �����ߴٸ�, 
	** default ������ �Լ��� �ݵ�� ������ ���ؼ��� ��� �����ϴ�. (�ڵ����� ���������� ����)
*/

//����� ���� �ڵ����� �����, �ݵ�� �ڵ����� �̸��� �ο��ϼ���
class Car{
	String carname;
	//�����Ϸ��� �˾Ƽ�  �Լ��� �����
	//�����ڰ� ���� �����ڸ� ������ ������, �����Ϸ��� �ڵ����� �Ʒ� �ڵ带 �����Ѵ�
	//public Car(){}
	public Car() {System.out.println("������ ���� ����"); }
	//���� ���� �������� �ʾƵ� �����Ϸ��� �ڵ����� ����

}

class Car2{
	String carname;
	public Car2() { // default constructor >>��ü�� ����� ������ ����Ǵ� �Լ�
		carname="����";
	}
}

class Car3{
	String carname;
	public Car3() { //default constructor
		carname="����";
	}
	public Car3(String name) { //overloading
		carname=name;
	}
}

class Car4{
	String carname;
	public Car4(String name) {
		carname=name;
	//default constructor �ڵ尡 ����
	//���������� : overloading �����ڸ� �����ߴٸ�, default �� �ڵ����� ��������� ����
	//�������� �ǵ� : �ڵ��� ����� ������ �̸��� �������� ...
	}
}
public class Ex16_Constructor {

	public static void main(String[] args) {
		Car c=new Car(); //Car() : �Լ��� ȣ���ض�
		Car2 c2=new Car2();
		System.out.println(c2.carname);

		Car3 c3=new Car3("ī�Ϲ�");
		System.out.println(c3.carname);
		Car4 c4=new Car4("k7");
		System.out.println(c4.carname);
	}

}
