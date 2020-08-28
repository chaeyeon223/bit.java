/*
 OOP (��ü���� ���α׷���)
1. ��� (���뼺 )
2. ĸ��ȭ (����ȭ ) : private >> setter / getter (�����Ҵ��� ���� �����Ҵ��� ���� ������ ��ȣ)
3. ������ : �ϳ��� Ÿ������ �������� ��ü�� ���� �� �ִ� �� 

 method overloading
- �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
//		System.out.println(); >> println() �����ε��� �����ϰ� �ִ� �Լ�
 1. �����ε��� ������� (X) >> ������ ���ϰ� ����Ϸ��� �����ڰ� ���
 2. �����ε� �𸣸� 20���� �ٸ� �̸� ����� ��
 ����) �Լ� �̸��� ����, parameter�� '����'�� 'Ÿ��'�� �ٸ���.
 1. �Լ� �̸��� ���ƾ� ��
 2. parameter��  ���� �Ǵ� Ÿ���� �޶����
 3. return type : �����ε��� �Ǵܱ����� �ƴ�
 4. parameter �� ������ �ٸ��� ����
*/
class Human{
	String name;
	int age;
}
class OverTest{
	int add(int i) {
		return 0+i;
	}
	int  add(int i, int j){
		System.out.println("�����ε� :"+i+j);
		return i+j;
	}
	String add(String s){
		System.out.println("�����ε� :"+s);
		return "hello"+s;
	}
	
	String add(String s, int i){ //parameter�� ������ �ٸ��� ����
		return s+i;
	}
	String add(int i, String s) {
		return null;
	}
	
	void add(Human human) { //����Ÿ�� parameter�� �����ε�
		human.name="ȫ�浿";
		human.age=10;
		System.out.println(human.age);
	}
}

public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot=new OverTest();
		int result=ot.add(100, 200);
		String add=ot.add("�ȳ�", 500);
		System.out.println(result);
		System.out.println(add);
		
		Human h=new Human();
		ot.add(h);
		System.out.println(h.name);
		
		
	}

}
