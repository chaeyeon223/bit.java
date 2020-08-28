package kr.or.bit;

/*���(����) ����� ���
�Լ� (Function, Method)
method : ���� �Ǵ� ��� (�ּ� ����) : �ϳ��� �Լ��� �ϳ��� ��ɸ� ����
ex) �Դ´�, �ܴ�, �ȴ´�, 

Ŭ���� : �ʵ� + �Լ� + ������
ex)  ���ӱ� - ���� �ְ� ... ���Ӹ� �ϰ� �����ִ� �� ����
ex) �����̱� - ���� �ְ� ... ���� �ޱ�

** �Լ��� ȣ�⿡ ���ؼ��� ���� (call)
1. void / parameter(0) : void print(Stiring str) {�����ڵ�} //���� �ϳ� �ִ� ����
2. void / parameter(X) : void print() {�����ڵ�} //���� �ȳִ� ����
3. return type, parameter(O) : int print(int data) {return 100;}
4. return type, parameter(X) : int print() {return 100;}
- void : return value ����
- return type : 8���� �⺻ Ÿ�� + String + Class, Array, Collection, Interface ...
ex. boolean print (boolean bo){return true/false;}
ex. Car print(){Car c=new Car(); return c;}
- parameter :  8���� �⺻ Ÿ�� + String + Class, Array, Collection, Interface ...
ex. void print(int a, int b, int c, int d){} >>> print (1,2,3,4) //���� ������ŭ �� �����

* �Լ��� �̸� - �ǹ��ִ� �ܾ��� ����
ex. getChannelNumber()
*/

public class Fclass {
	public int data;
	//1
	public void m() {
		System.out.println("�Ϲ� �Լ� : void, parameter(X)");
	}
	//2
	public void m2(int i) {
		System.out.println("�Ϲ� �Լ� : void, parameter(O)");
		System.out.println("praameter value (scope �Լ�����) : "+i);
	}
	//3
	public int m3() {
		return 0; //return Ÿ���� �����ϸ� �ݵ�� return Ű���� �ʿ�
	}
	//4
	public int m4(int data) {
		return 10+data;
	}
	
	//Ȯ��
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	private int subSum(int i) { //private : ���� Ŭ���������� ��� ����
		//Ŭ���� ���� : public, private, default ���� x
		//�ٸ� �Լ��� �����ִ� �Լ� : ���ο��� ȣ�� >> ����, �ݺ����� ���뿡 ��� 
		return i+100;
	}
	public void callSubSum() {
		int result=subSum(100);
		System.out.println(result);
	}
	private int operationMethod(int data) { //Ŭ���� ���ο��� �����Լ��� ���
		return data*200;
	}
	public int opSum(int data) {
		int result=operationMethod(data);
		if (result>0){
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz.
	//a�� b �� �߿� ū ���� return �ϴ� �Լ��� ���弼��
	//**return ��� �ּ�ȭ
	public int getMax(int a, int b) {
		int result=0;
		if (a>=b) {
			result= a;
		}else {
			result= b;
		}
		return result;
	}
	//100��
	public int max(int a, int b) {
		return (a>b)? a:b;
	}
	//�Լ��� ����� �� �⺻Ÿ�� (��Ÿ��)
	//�Լ��� ����Ÿ��
	//return type >> Ŭ����
	public TV tCall() { //Tv Ÿ���� ������ **�ּ�**�� ���� >>1. new... 2. �ٸ� �ּ� ��������
		//return null;
		TV t=new TV();
		return t;
	}
	//�� ȿ������ �ڵ�
	public TV tCall2() {
		return new TV();
	}
	
	public void tCall3(TV t) {//TV Ÿ���� ������ �ּ�
		System.out.println("t �ּҰ� : "+t);
		//1. tCall3(new TV())
		//2. TV t= new TV(); //t��ü ���� ����
		//	  tCall3(t)
	}
	
	
	
	
}
