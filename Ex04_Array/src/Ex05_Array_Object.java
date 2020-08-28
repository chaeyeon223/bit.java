class Person{
	String name;
	int age;
	
	void print() {
		System.out.println(this.name+"."+this.age);
	}
}


//클래스 = 데이터타입

public class Ex05_Array_Object {

	public static void main(String[] args) {
		int [] intarr=new int[10]; //값타입 배열
		boolean[] boarr=new boolean[5]; //값타입 배열
		//값타입 배열은 각각의 방에 기본값이 들어있다. (default value)
		
		//참조타입 배열
		Person p=new Person();
		p.name="홍길동";
		p.age=100;
		
		//사람을 3명 만들어라
		Person[] personarr=new Person[3]; // 3개의 방이 만들어지는데, 방은 비어있다.
		System.out.println(personarr); //배열의 주소값
		System.out.println(personarr[0]); //참조타입의 default : null
		
		personarr[0]=new Person();
		personarr[1]=new Person();
		System.out.println(personarr); //배열의 주소값
		System.out.println(personarr[0]); //참조타입의 default : null
		personarr[0].age=100;

		//****** 객체 배열은 방을 만드는 작업과 방을 채우는 작업은 별도 ********\
		personarr[2]=personarr[0];
		personarr[0].name="김유신";
		personarr[1].name="아무개";
		
		//객체 배열  for
		for(int i=0;i<personarr.length;i++) {
			System.out.println(personarr[i].name);
		}
		
		//객체 배열 3가지 방법으로 만들기
		//1. int[] arr=new int[5]
		Person[] personarr1=new Person[5];
		for(int i=0;i<personarr1.length;i++) {
			personarr1[i]=new Person(); //배열은 주소를 갖는다
			System.out.println(personarr1[i]);
		}
		//2. int[] arr=new int[]{10,20,30}
		Person[] peresonarr2=new Person[] {new Person(),new Person(),new Person()};
		//3. int[] arr={10,20,30}
		Person[] personarr3={new Person()	,new Person(),new Person()};
	}

}
