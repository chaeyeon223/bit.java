import java.util.ArrayList;

/*
 �ڹ� 8���� �⺻Ÿ�� (��Ÿ��) 
 Wrapper class : 8���� �⺻Ÿ�Կ� ���ؼ� ��ü ���·� ��밡���ϵ��� ���� ��
 -�⺻Ÿ�� ��ſ� ��ü ���� Ÿ���� ����ؾ��� >> '���ʸ�', Static (���� > ����,�Ǽ�)
 1. �Ű�����(parameter)�� ��ü�� �䱸�� ��
 2. �⺻�� ���� �ƴ� ��ü ���·� ���� ����Ǿ�� �� ��
 3. ��ü�� �� �� �� ��
 4. Ÿ�� ��ȯ�� ó���� �䱸�� ��
 
 
 
 
 
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i=100;
		Integer n=new Integer(500);
		System.out.println("n : "+n); //toString ������ (������ �ּҰ��� ���;���)
		System.out.println(n.MAX_VALUE); //static/final (��ü �������� �ʰ� ����� �� ����)
		System.out.println(n.MIN_VALUE);
		
		//POINT
		//parameter�� ��� (���ʸ�) : ��ü�� ������ �� Ÿ�� ���� >> Object�� ���� Ÿ���� ���� ... downcasting���� �ʵ���...
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(100);
		//li.add("A"); >> ����Ÿ�Ը� �ֵ��� ����
		li.add(200);
		for(int value:li) { //returnŸ�� ��� X
			System.out.println(value);
		}
		Integer i2=new Integer(100);
		Integer i3=new Integer(100);
		System.out.println(i2==i3); //==(����Ÿ�Կ���)�ּҰ� ��
		System.out.println(i2.equals(i3));//equals(Object�ڿ�) >> String Ŭ���� ������, Integer Ŭ���� ������ (���� ���� ���ϵ��� )
		
		int i4=100;
		int i5=100;
		System.out.println(i4==i5); //����
		
		
		Integer t=new Integer(500);
		intMethod(t);//t��� ���������� �����ִ� '��'�� �ѱ� 
		integerMethod(t); //t��� ���������� �����ִ� '�ּҰ�' �ѱ�
		
		
	}
	static void integerMethod(Integer i) {
		System.out.println("integer param : "+i); //toString ������ : �� ����
		System.out.println(i.MAX_VALUE);
	}
	static void intMethod(int i) {
		System.out.println("int param : "+i);
	}
}
