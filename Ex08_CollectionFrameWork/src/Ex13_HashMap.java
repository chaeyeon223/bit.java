import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

	public static void main(String[] args) {
		//�ϻ��Ȱ
		//������ȣ, �����ȣ, ȸ������(id/password) ����...
		HashMap loginmap=new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		//�츮 �ý����� ������ ȸ���� ���̵�,��� ����
		//id(o), pw(o) >> ȸ��(�氡)
		//id(o), pw(x) >> ��й�ȣ �ٽ� �Է��� >> 3��Ʋ���� 
		//id(x) pw(o) >> 
		//id(x) pw(x) >>
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("id, pw�Է����ּ���");
			System.out.println("ID");
			String id=sc.nextLine().trim().toLowerCase(); //���ʰ�������, �ҹ��ڷ� ��ȯ
			System.out.println("PWD");
			String pwd=sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) { //ID(x)
				System.out.println("ID�� �����ʽ��ϴ�.");
			}else {
				if(loginmap.get(id).equals(pwd)) { //ID(o), pwd(o)
					System.out.println("ȸ�� �氡");
					break;
				}else {
					System.out.println("��й�ȣ�� Ȯ���ϼ���"); //id(o), pwd(x)
				}
			}
		}
		
		
	}
}
