/*
 ��Ģ : �����ڴ� ��ü ������ 1���� ȣ��� (Ex. Car() or Car(10,20) ...)
 this : ��ü �ּ�
 */
class Zcar{
	String color;
	String geartype;
	int door;
	
	public Zcar() { //default constructor
		//this.color="red";
		//this.geartype="auto";
		//this.door=2;
		this("red","auto", 2); //���� �ٽ� ȣ���ϳ�?!?!
		System.out.println("default constructor");
	}
	public Zcar(String color, String geartype, int door) {
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println("overloading constructor");
	}
	public void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}

//////////////////////////////////////////////////////////////
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red",1);
		System.out.println("default constructor");
	}
	Zcar2(String color,int door){
		this(color,door,"auto");
		System.out.println("overloading constructor parameter 2��");
	}
	Zcar2(String color,int door, String geartype){
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println("overloading constructor parameter 3��");
	}
	public void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}
////////////////////////////////////////////////////////////////
public class Ex20_this {

	public static void main(String[] args) {
		Zcar zc=new Zcar();
		zc.print();
		//1. Zcar() >> 2. this("red","auto", 2); >> 3. Zcar(String color, String geartype, int door) >> 4. Zcar()
		Zcar zc2=new Zcar("green","auto",10);
		zc2.print();
		System.out.println("-------------------------------");
		Zcar2 zc3=new Zcar2();
		zc3.print();
	}

}
