import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		// 사칙 연산기
		Scanner sc=new Scanner(System.in);
		System.out.println("입력값1 : ");
		String num1=sc.nextLine(); //1번째 입력값
		System.out.println("입력값2 : ");
		String num2=sc.nextLine(); //2번째 입력값
		System.out.println("연산자 : ");
		String oper=sc.nextLine(); //연산자

		int result=0;
		//
		
		if (oper.equals("+")) {
			result=Integer.parseInt(num1)+Integer.parseInt(num2);
		}else if  (oper.equals("-")) {
			result=Integer.parseInt(num1)-Integer.parseInt(num2);
		}else if  (oper.equals("*")) {
			result=Integer.parseInt(num1)*Integer.parseInt(num2);
		}else if  (oper.equals("/")) {
			result=Integer.parseInt(num1)/Integer.parseInt(num2);
		}else {
			System.out.println("다시 입력하세요");
		}
		

		System.out.println("입력값1 :"+num1 );
		System.out.println("입력값2 :"+num2);
		System.out.println("연산자 : "+oper);
		System.out.println("연산결과 : "+result);
	}
}
