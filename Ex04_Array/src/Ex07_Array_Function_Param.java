

class Human{
	String name;
}
class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add(Human human) { //*** HumanŸ���� ������ ��ü�� �ּҰ� �ֱ� 
		System.out.println(human.name);
	}
	int add(int param) {
		return param;
	}
	//Today point : �迭�� Ÿ���̴�
	int [] add(int[] param) {//�迭�� �ּҰ��� �޾Ƽ� >> �迭�� �ּҰ��� �����ض�
		int[] target=new int[param.length];
		for(int i=0;i<target.length;i++) {
			target[i]=param[i]+1;
		}
		return target; //target �迭�� �ּ�
	}
	int[] add(int[] so, int[] so2) {
		return null;
		//����...
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
