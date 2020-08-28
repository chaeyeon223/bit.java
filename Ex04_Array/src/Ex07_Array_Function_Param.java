

class Human{
	String name;
}
class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add(Human human) { //*** Human타입을 가지는 객체의 주소값 넣기 
		System.out.println(human.name);
	}
	int add(int param) {
		return param;
	}
	//Today point : 배열도 타입이다
	int [] add(int[] param) {//배열의 주소값을 받아서 >> 배열의 주소값을 리턴해라
		int[] target=new int[param.length];
		for(int i=0;i<target.length;i++) {
			target[i]=param[i]+1;
		}
		return target; //target 배열의 주소
	}
	int[] add(int[] so, int[] so2) {
		return null;
		//연습...
	}
	
}

public class Ex07_Array_Function_Param {

	public static void main(String[] args) {
		OverTest ot=new OverTest();
		int[] source= {10,20,30,40,50};
		int[] target=ot.add(source);
		for(int value:target) {
			System.out.println(value);
		}
	}

}
