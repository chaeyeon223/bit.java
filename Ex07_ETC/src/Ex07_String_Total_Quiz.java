import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����
//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�
//�Է°� : 123456-1234567 
//1. �ڸ��� üũ (���)�Լ� (14 ok) >> return : true/false
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ� return : true/false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ� >> void ���

//3���� �Լ� static 
public class Ex07_String_Total_Quiz {

	//1. 14�ڸ� üũ ���
	static boolean juminCheck(String juminnum) {
		if(juminnum.length()==14) {
		return true;
	}
		return false;
}
	//2. 
	static boolean juminFirstnum(String juminnum) {
		int num=Integer.parseInt(juminnum.substring(7,8));
		if(1<=num&&num<=4) {
			return true;
		}
		return false;
	}
	
	private static int parseInt(String substring) {
		// TODO Auto-generated method stub
		return 0;
	}
	//3. ����,���� ����
	static void printGender(String juminnum) {
		if(juminnum.substring(7,8).equals("1")||juminnum.substring(7,8).equals("3")) {
			System.out.println("�����Դϴ�.");
		}else if(juminnum.substring(7,8).equals("2")||juminnum.substring(7,8).equals("4")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("****************");
			System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
			String juminnum=sc.nextLine();
			if(!juminCheck(juminnum)) {
				System.out.println("14�ڸ��� �Է����ּ���");
			}else if(!juminFirstnum(juminnum)) {
				System.out.println("���ڸ��� 1~4���� �Է����ּ���");
			}else {
				printGender(juminnum);
				break;
			}
		}
		
	}

}
