package kr.or.bit;
import java.util.Scanner;

public class Cinema {
	private String[][] seat; 
	private Scanner sc;
	private String selectseat;
	public Cinema() {
		seat = new String[6][6];
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				seat[i][j]=((i+1)+"-"+(j+1));				
			}
		}
		sc = new Scanner(System.in);
	}
	public String showMenu() {
		System.out.println("********************");
		System.out.println("*****��ȭ ���� �ý���****");
		System.out.println("********************");
		System.out.println("1. �����ϱ�");
		System.out.println();
		System.out.println("2. ������ȸ");
		System.out.println();
		System.out.println("3. �������");
		System.out.println();
		String select = sc.nextLine();
		return select;
	}
	///////
	public void selectSeat() {
		System.out.println("***********************");
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals(((i+1)+"-"+(j+1)))){
				System.out.printf("[%s]",seat[i][j]);
				}else {
					System.out.print("[����]");
				}
			}System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("���Ͻô� �¼��� �Է����ּ��� (Ex. 3-3)");
		this.selectseat=sc.nextLine();
		String[] strIndex = this.selectseat.split("-");
		int i = Integer.parseInt(strIndex[0]) -1;
		int j = Integer.parseInt(strIndex[1]) -1;
		if(this.seat[i][j].equals(this.selectseat)) {
			check();			
		}else {
			System.out.println("�ٽ��Է��ϼ���");		
		}
	}
	private void check() {
	best_1 :for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(selectseat.equals(((i+1)+"-"+(j+1)))){
					System.out.println("���Ű� �����մϴ�");
					System.out.println("�����Ͻðڽ��ϱ� ?");
					System.out.println("1) ��   2) �ƴϿ�   0) �ʱ�ȭ��");
					String check=sc.nextLine();
					switch(check) {
					case "1": print();
						break ;
					case "2":selectSeat();
						break;
					case "0":return;
					}break best_1;
				}
			}
		}
	}
	private void print() {
		int ran = (int)(Math.random()*100000); ////////////////////����Ȯ��
	 best_2 : for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals(selectseat)) {
					seat[i][j] = ran+"";
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
					System.out.printf("������ �¼���ȣ[%s] / ���Ź�ȣ :[%s]",selectseat,seat[i][j]);
					System.out.println("�����մϴ�.");
					break best_2;
				}
			}
		}
	}
	//������ȸ
	public void showTicket() {
		System.out.println("���Ź�ȣ�� �Է��ϼ���");
		String num=sc.nextLine();
		String[] tic=forFor(seat, num);
		if(tic[0].equals("")) {
			System.out.println("���������� �����ϴ�.");
		}else{
			System.out.println("�¼���ȣ : "+tic[0]);		
		}
	}	
	public void cancleTickt() {
		System.out.println("���� ��ȣ�� �Է����ּ���.");
		String num = sc.nextLine();
		String[] tic = forFor(seat, num);	
		if(tic[0].equals("")) {
			System.out.println("����� ������ �����ϴ�.");
		}else {
			System.out.printf("������ �����Ͻ� �¼��� %s �Դϴ�.", tic[0]);
			System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
			System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է��� �ּ���.");
			int select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				seat[Integer.parseInt(tic[1])][Integer.parseInt(tic[2])]=tic[0];
				System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");	
			}
		}
	}
	private String[] forFor(String[][] seat, String num) {
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(num.equals(seat[i][j])) {
					return new String[]{
							(i+1)+"-"+(j+1),
							i+"",
							j+""};
				}
			}
		}return new String[] {""}; 
	}
}
