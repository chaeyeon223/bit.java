class Human2{
	String name;
	int age;
}

class Test2{
	Human2 add(Human2 h) {
		System.out.println(h.name+"의 나이는 "+h.age);
		return h;
	}
	Human2 add(Human2 h, Human2 h2) {
		h2.name="홍길동";
		h2.age=500;
		h.name="박채연";
		h.age=100;
		System.out.println(h2.name);
		System.out.println(h.name);
		return h;
	}
}

public class Ex15_Method_Overloading {

	public static void main(String[] args) {
		Test2 t2=new Test2();
		Human2 h=new Human2();
		Human2 h2=new Human2();
		h2= t2.add(h,h2); //h2 에 h 주소 할당
		t2.add(h2);


	}

}
