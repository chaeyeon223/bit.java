package kr.or.bit;
import java.util.Scanner;

public class Computer {
	public int price;
	public String brand;
	public int num;
	public String color;
	public boolean mode;
	
	Scanner sc=new Scanner(System.in);
	static String input_v;
	//�Է�/��� ���
	//�޸���
	//1�� : �Է��ϱ� >> printIn()  , 2�� : ����ϱ� >>printOut()
	public void memo() {
		while(true) {
			System.out.println("[1] : �Է� , [2] : ���");
			int a=Integer.parseInt(sc.nextLine());
			if(a==1) {
				System.out.println("���� �Է��ϼ���");
				input_v=sc.nextLine();
		}else if(a==2){
				System.out.println(input_v);
		}else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		}
	}
	
	
	
	public void printIn() {
		System.out.println("�Է��ϼ���");
		input_v=sc.nextLine();
		System.out.println("�ڷΰ���");
		}
	
	public void printOut() {
		System.out.println("����Ͻðڽ��ϱ� ? >> [1 : ��] [2 : �ƴϿ�]");
		int a=Integer.parseInt(sc.nextLine());
		if(a==1) {
			System.out.println(input_v);
		}else {
			System.out.println("�ڷΰ���");
		}
	}

}
