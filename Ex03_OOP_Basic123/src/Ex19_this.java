/*
 this
1. ��ü �ڽ��� ����Ű�� this (������ ������ ��ü�� �ּҸ� ���� ���̶�� ����)
2. this ��ü�ڽ� (������ ȣ��) >> ��Ģ : �������� ������ ȣ�� ����
*/
class Test{
	int i;
	int j;
	
	Test(){ //default ������ �Լ�
		
	}
	Test(int i, int j){ //������ �Լ�
		//�ڵ� ��ü�� ������ ������, �������� ���� ...
		//parameter �̸��� member field��� �Ȱ��� �Ϸ��� ??
		//Test(int i, int j){i=i; / j=j;} >> 0,0 ��� (���ϴ� ��� X)
		this.i=i;
		this.j=j;
	}
}

class Book2{
	String bookname;
	
	Book2(String bookname){
		this.bookname=bookname;
	}
}

 //Today Point 
class Socar{
	String color;
	String geartype;
	int door;
	
	public Socar() { //default constructor
		this.color="red";
		this.geartype="auto";
		this.door=2;
	}
	public Socar(String color, String geartype, int door) {
		this.color=color;
		this.geartype=geartype;
		this.door=door;
	}
	public void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}
public class Ex19_this {

	public static void main(String[] args) {
		Test t=new Test(10,20);
		System.out.println(t.i+","+t.j);
		
		Book2 book=new Book2("ȫ�浿��");
		System.out.println(book.bookname);
			
		Socar dcar=new Socar();
		dcar.print();
		Socar scar=new Socar("green", "auto", 4);
		scar.print();
	}

}
