import java.util.Scanner;

public class Ex11_Quiz {

	public static void main(String[] args) {
		//1. 1���� 20������  ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		int sum=0;
		for (int i=1;i<=20;i++) {
			if (!((i%2==0)||(i%3==0))){
				sum+=i;
			}
		}System.out.println(sum);
		
		//2. �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		for (int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				if(a+b==6) {
					System.out.println("a :"+a+", b :"+b);
				}
				}
			}
		
		Ex11_Quiz quiz = new Ex11_Quiz();
		//3. ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)
		//���� : 1
		//���� : 2
		//�� : 3
		Scanner sc=new Scanner(System.in);
		int random=(int)(Math.random()*3)+1;
		int rsp=0;
		System.out.println("[1:����].[2:����].[3:��]");
		rsp=Integer.parseInt(sc.nextLine());
		int result = rsp - random; // 0: ���, 1: �̱� -2: �̱� // �������� ��
		if (rsp==1) { //����� : ����
			if(random==1) {
				quiz.sayDraw();
			}else if(random==2) {
				quiz.sayLose();
			}else {
				quiz.sayWin();
			}
		}else if(rsp==2) { //����� : ����
			if(random==1) {
				System.out.println("�̰���ϴ�");
			}else if(random==2) {
				System.out.println("�����ϴ�");
			}else {
				System.out.println("�����ϴ�");
			}
		}else if(rsp==3) { //����� : ��
			if(random==1) {
				System.out.println("�����ϴ�");
			}else if(random==2) {
				System.out.println("�̰���ϴ�");
			}else {
				System.out.println("�����ϴ�");
			}
		}else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		//���� �����
		boolean auto = true;
		int balance = 0;
		
		Scanner sc1 = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**********************");
			System.out.println("1. ����  |  2. ���  |  3. �ܰ�  |  4. ����");
			System.out.println("**********************");
			
			System.out.println("����");
			int input = Integer.parseInt(sc1.nextLine());
			switch (input) {
				case 1: 
							System.out.println("���� :");
							balance +=  Integer.parseInt(sc1.nextLine());
							break;
				case 2:
							System.out.println("��� :");
							balance -=  Integer.parseInt(sc1.nextLine());
							break;
				case 3:
							System.out.println("�ܰ� : " + balance);
							break;
				case 4:
							System.out.println("�����մϴ�");
							auto = false;
							break;
				default: System.out.println("�ùٸ� �޴��� �����ϼ���");
			}
		}
		
		}
	
	void sayWin() {
		System.out.println("�̰���ϴ�");
	}
	
	void sayLose() {
		System.out.println("�����ϴ�");		
	}
	
	void sayDraw() {
		System.out.println("�����ϴ�");				
	}
	}
