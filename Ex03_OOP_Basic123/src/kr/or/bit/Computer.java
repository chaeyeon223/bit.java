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
	//입력/출력 기능
	//메모장
	//1번 : 입력하기 >> printIn()  , 2번 : 출력하기 >>printOut()
	public void memo() {
		while(true) {
			System.out.println("[1] : 입력 , [2] : 출력");
			int a=Integer.parseInt(sc.nextLine());
			if(a==1) {
				System.out.println("값을 입력하세요");
				input_v=sc.nextLine();
		}else if(a==2){
				System.out.println(input_v);
		}else {
			System.out.println("다시 입력하세요");
		}
		}
	}
	
	
	
	public void printIn() {
		System.out.println("입력하세요");
		input_v=sc.nextLine();
		System.out.println("뒤로가기");
		}
	
	public void printOut() {
		System.out.println("출력하시겠습니까 ? >> [1 : 예] [2 : 아니오]");
		int a=Integer.parseInt(sc.nextLine());
		if(a==1) {
			System.out.println(input_v);
		}else {
			System.out.println("뒤로가기");
		}
	}

}
