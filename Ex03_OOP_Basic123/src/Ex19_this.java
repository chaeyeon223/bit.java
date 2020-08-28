/*
 this
1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
2. this 객체자신 (생성자 호출) >> 원칙 : 여러개의 생성자 호출 가능
*/
class Test{
	int i;
	int j;
	
	Test(){ //default 생성자 함수
		
	}
	Test(int i, int j){ //생성자 함수
		//코드 자체는 문제가 없지만, 가독성의 문제 ...
		//parameter 이름을 member field명과 똑같이 하려면 ??
		//Test(int i, int j){i=i; / j=j;} >> 0,0 출력 (원하는 결과 X)
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
		
		Book2 book=new Book2("홍길동전");
		System.out.println(book.bookname);
			
		Socar dcar=new Socar();
		dcar.print();
		Socar scar=new Socar("green", "auto", 4);
		scar.print();
	}

}
