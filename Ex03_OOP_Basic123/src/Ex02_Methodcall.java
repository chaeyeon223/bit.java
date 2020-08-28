import kr.or.bit.Fclass;

public class Ex02_Methodcall {

	public static void main(String[] args) {
		Fclass fc=new Fclass();
		fc.m();
		fc.m2(100);
		int result=fc.m3();
		System.out.println(result);
		
		result=fc.m4(10);
		System.out.println(result);
		
		result=fc.sum(5, 8, 20);
		System.out.println(result);
		
		fc.callSubSum();

		result=fc.opSum(20);
		System.out.println(result);
		
		result=fc.getMax(500, 200);
		System.out.println(result);

	}


}
