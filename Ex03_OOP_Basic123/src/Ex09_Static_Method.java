/*
1. static method : �����ڰ� static �Լ��� ����ٴ� ���� ... ���� ����ϴϱ�, ���ϰ� ������. (new ��ü ���� ���� ��� ����)
ex. Math m =new Math(); (X) >> Math.Random();

*/
class StaticClass{
	int iv; //instance variable
	
	static int cv; //static variable
	
	void m() { //�Ϲ� �Լ�
		//�Ϲ��Լ�
		//1. iv ���� ������ �� �� �ִ�. 
		iv=100;
		//2. cv ���� ������ �� �� �ִ� >> static �ڿ��� �̸� �ö󰡱� ���� (���� ����: static �ڿ��� '�׻�' �Ϲ� �ڿ����� �޸𸮿� ���� �����ȴ�)
		cv=200; //=StaticClass.cv=200;
		System.out.println(cv);
	}
	
	static void sm() { //static method
		//static �Լ�
		//1. iv ���� ������ �� �� ����. >> static�� �޸𸮿� �ö��� ������, iv�� ���� x
		//. cv ���� ������ �� �� �ִ�.
		cv=300;
		System.out.println(cv);
	}
	
	
}

public class Ex09_Static_Method {

	public static void main(String[] args) {
		//new ��ü �ȸ��� ���� > static �ڿ��� ��� ����
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		StaticClass sc=new StaticClass();
		sc.m();
		System.out.println(sc.iv);
	}

}
