/*
1. instance variable >> class Car {private String color} >>��ü���� �ٸ� ���� ���� �� �ִ� ���� (default ����)
2. local variable >> Ŭ������ ������ �Լ� �ȿ��� ���Ǵ� ���� class Car {public void move() {int speed;}} >> ������� �ݵ�� �ʱ�ȭ �ʿ� (default ����)
> main �Լ� �ȿ� ��������� ��� ������ local variable
3. static variable : ��ü �� ���� �ڿ�, ��ü ���� ������ �޸𸮿� �ö� (class area, method area)
++static �� member field���� �ش� (local variable�� �ʿ����)


*/

class Variable{
	int iv; //instance variable (�ʱ�ȭ �ʿ� X) = member field
	// Variable v=new Variable() : heap �޸𸮿� ����(��ü) >>iv ����
	// Variable v2=new Variable() : heap �޸𸮿� ����(��ü)>>iv ����
	//iv �� ���� : ������ �������� �Ѵ�. >> ��������, ��������, ��ǰ����(����Ÿ��;Ŭ����)
	//iv�� �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ� >> ���� �ʱ�ȭ �ʿ� ���� (default�� ����)
	//default�� >> int : 0 / double : 0.0 / char : ' ' / boolean : false / String : null / Car(����Ÿ��) : null
	//iv ������ �������� : new �����ڸ� ���ؼ� heap�� ��ü�� ��������� ���� �ٷ� ��ü �ȿ� ����
	
	void method() {
		int lv=0; //local variable (�Լ� �ȿ� �ִ� ����) >> ������� �ݵ�� �ʱ�ȭ �ʿ�
		//�Լ��� ȣ��Ǹ� ���� - stack���� >> �Լ��� ����Ǹ� ���� �Ҹ�
		//�Լ��ȿ� block ����  >>ex1. for(int i..) : for�� ���۵Ǹ� ����...for �� ������ �Ҹ�
	}
	static int cv;
	//class variable (Ŭ���� ����) = static variable (��ü�� ���� �ڿ�)
	//���� : ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�)>> heap������ ������ ��ü�� ���� ���� �ڿ�
	//Ư¡ <���ٹ�� >
	//1. Ŭ���� �̸�. static ������ >> variable.cv >>��ü�� ��������� ���� ���� ����
	//������ ��� >> Variable v=new Variable(); >> v. �� ����  ( but. static�� new�� �����Ǳ� ���� ���� ����)
	//2. Variable v=new Variable(); >>v.cv == Variable v2=new Variable(); >>v2.cv
	//v.cv ==  v2.cv (���� �޸� ���� : �ּҸ� ���ؼ� ����)
	//=> Variable.cv == v.cv == v2.cv
	
	/*
	 * 4. �������� : Hello.java > javac Hello.java > Hello.class >java.exe Hello ���� ����
	 * ... >class loader System �� ���ؼ� Ŭ������ ����(metadata : ����) class area(method area)
	 * �÷��� --�� Ŭ���� ���� ������� � �ڿ��� import �ϰ� �ְ� ���� � ...��� .. --�� Ŭ���� �ȿ� static
	 * variable �Ǵ� static method ������ --�� �༮�� memory (class area) �� �÷� ���´�
	 */
}

public class Ex05_Variable_Scope {
	
	public static void main(String[] args) {
		Variable.cv=100;
		Variable v=new Variable();
		System.out.println(v.cv); //100
		
		Variable v2=new Variable();
		v2.cv=500;
		
		System.out.println(Variable.cv); //500
		

	}

}
