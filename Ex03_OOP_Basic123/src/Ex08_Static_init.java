/*static 변수는 객체마다 같은 값을 가지게 할거야
instance 변수는 객체마다 다른 값을 가지게 할거야*/

class InitTest{
	static int cv=10; //static variable
	static int cv2;
	int iv=11; //instance variable
	
	static{ //static 초기자 : static  자원 초기화
		cv=111;
		cv2=cv+222;
	}
	
	{ 	//초기자 블럭 > member field 초기화
		//객체 생성 후에 ... int iv=1; 변수가 메모리에  올라가고 나서 ... 바로 호출
		//인위적  조작 가능>> if(iv>10) iv=100;
		System.out.println("초기자 블럭");
	}

	
}


public class Ex08_Static_init {

	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
	//	System.out.println(InitTest.iv); > new 객체 없기 때문에 instance variable은 호출 불가능
		InitTest it=new InitTest();
		System.out.println(it.iv);
	}

}
