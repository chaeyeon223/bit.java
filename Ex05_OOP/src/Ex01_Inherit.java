/*
 OOP Ư¡
1. ���
2. ĸ��ȭ(����ȭ) >> private
3. ������

 ���
 java > child extends Base (extends)
 c# > child : Base (:)
 1) ���� ����� �Ұ� 
 2) ���� ��Ӹ� ���� (�Ҿƹ��� > �ƹ��� > �� : ������ ����� ���ؼ� �������� Ŭ���� ��� ����)
 3) ���߻���� �����ϰ� �����ϴ� �� >> Interface
 4) **���뼺 
 5) ���� : �ʱ� ���� ���
 6) ���뼺 >> ���� >>��� (�ð�. ��� ���� >> �����ڿ� ����� : �θ���� : �߻�ȭ)
 7) ��Ӱ��迡���� memory���� 
 	(�޸𸮿� �ö󰡴� ����) : Grandfather > Father >Child 
 	
  ����ڰ�(������) ����� ��� Ŭ������ default Object Ŭ���� ���
  class Car (extends Object)...����
  Object (�ܱ� ) : ��� Ŭ������ root(�ֻ���) = ��� Ŭ������ �θ� Ŭ���� 
*/
class Car{
	
}
class Grandfather extends Object{
	public Grandfather() {
		System.out.println("Grandfather");
	}
	public int gmoney=5000;
	private int pmoney=10000; //���� �Ұ� (��ü, ��Ӱ���)
}

class Father extends Grandfather{
	public Father() {
		System.out.println("Father");
	}
	public int fmoney=3000;
}

class Child extends Father{
	public Child() {
		System.out.println("Child");
	}
	public int cmoney=1000;
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.gmoney); //�Ҿƹ��� ��
		System.out.println(child.fmoney); //�ƹ��� ��
		
		Car c=new Car();
		
	}

}
