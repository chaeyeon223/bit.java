/*
 user ����� : provider ������
 
 class A {}
 class B {}
 ���� : A�� B�� ����մϴ�
 1. ��� : A extends B
 2. ���� : A Ŭ���� �ȿ��� member field�� B ��� / class A {B b;}
  	2.1 �κ�����
  	2.2 ��ü����
  	
 //��ü���� - Composition(�ռ�����)
 class B {}
 class A {
 	int i;
 	B b; //A�� B�� ��� (����)
 	A(){
 		b=new B();
 	}
 }
 >>B�� ������ ���� �Ұ� ... A��� ��ü�� ��������� B�� ���� �� �ִ�
 >>A a= new A(); >> A��ü ������ ���ÿ� B��ü ����(��� : ���� �¾�� ���� �״´�) >> Composition(�ռ�����)
-------------------------------------------------------------
 //�κ����� - aggregation(���տ���)
class B {}
class A {
	int i;
	B b; //A�� B�� ��� (����)
	A() {}
	A(B b){
	  this.b=b;
	}
}
>>B b=new B();
>>A a=new A(b);
>>A�� ������ٰ� B�� ����� ���� �ƴ� (��� X) >> aggregation(���տ���)
--------------------------------------------------------------
 A�� B�� �����Ѵ� (= B�� member field�� ����)
 member field�� Ŭ������ �����ִ°� ? O : �������� / X : �������� (ex. Buyer)
 -------------------------------------------------------------
 //��������(�Լ�) - �������� (dependency)
 class B{}
 class A{
 	int i;
 	//member field�� BŸ���� ���� ���� >> �Լ��� �Ķ���ͷ� ����
 	void print(B c){}
 	B print(){
 		B=new B();
 		return b;
 	}
 }
 >>B b=new B();
 >>A a=new A();
 >>a.print(b);
 >>B b2=a.print();
 */
interface Icall{
	void m();
}

class D implements Icall{
	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ������");
	}
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ������");
	}
}

class C {
	void method(Icall ic) { //ic�� Icall�� ������ ��� ��ü�� �ּҸ� ���� �� �ִ� (Ȯ�强)
		ic.m();
	}
}

//�������� ���α׷��� ��� (interface) >> �����ϰ� ����...

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c=new C();
		D d=new D();
		F f=new F();
		c.method(d);
		c.method(f);

	}

}
