import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		// ��Ģ �����
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է°�1 : ");
		String num1=sc.nextLine(); //1��° �Է°�
		System.out.println("�Է°�2 : ");
		String num2=sc.nextLine(); //2��° �Է°�
		System.out.println("������ : ");
		String oper=sc.nextLine(); //������

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
			System.out.println("�ٽ� �Է��ϼ���");
		}
		

		System.out.println("�Է°�1 :"+num1 );
		System.out.println("�Է°�2 :"+num2);
		System.out.println("������ : "+oper);
		System.out.println("������ : "+result);
	}
}
