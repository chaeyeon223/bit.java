import java.util.Scanner;

public class Ex12_do_while_Static_Menu {
	//��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	Scanner sc = new Scanner(System.in); //��ǰ(����:Ŭ����)
	String choiceMenu="";
	
//	//���
	public void inputRecord() {
		System.out.println("�޴��� �Է��ϼ���");
		String a=sc.nextLine();
		choiceMenu+=a;
		System.out.println(a+"�� �߰��Ǿ����ϴ�.");
	}
	public void deleteRecord() {
		System.out.println("�� ���ŵǾ����ϴ�.");

	}
	public void sortRecord() {
		System.out.println("���� ��Ƴ��� �޴� : "+choiceMenu);
	}
	
	
	
	
	 int displayMenu() {
		System.out.println("***************");
		System.out.println("****�޴��� �Է��ϼ���****");
		System.out.println("1. �޴� �߰� ");
		System.out.println();
		System.out.println("2. �޴� ���� ");
		System.out.println();
		System.out.println("3. ��ٱ��� ");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while Ż�� (1<= menu <=4) >> break : for / do(while)�� ������
						}else {
							//1���� �۰ų� 4���� ū ���� .. ���α׷����� ���� (x)
							//���� ���� ���ڴ� (���� ����� ����)
							//System.out.println("�߸� �Է� �ϼ̽��ϴ�");
							throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("�޴� ���� ���� �߻�");
				  System.out.println("�޴� 1~4������ �Է�");
			  }
		}while(true);
		//���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
		return menu;
	}
	
	public static void main(String[] args) {
		Ex12_do_while_Static_Menu ex12=new Ex12_do_while_Static_Menu();
		while(true) {
			switch (ex12.displayMenu()) {
			case 1 : ex12.inputRecord();
				break;
			case 2 : ex12.deleteRecord();
				break;
			case 3 : ex12.sortRecord();
				break;
			case 4 : System.out.println("���α׷� ����");
					 //return;  //main ����
					 System.exit(0); //���α׷� ���� ���� (kill)
			}
		}
	}

}



