import java.util.Scanner;

public class Ex11_Quiz {

	public static void main(String[] args) {
		//1. 1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
		int sum=0;
		for (int i=1;i<=20;i++) {
			if (!((i%2==0)||(i%3==0))){
				sum+=i;
			}
		}System.out.println(sum);
		
		//2. 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		for (int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				if(a+b==6) {
					System.out.println("a :"+a+", b :"+b);
				}
				}
			}
		
		Ex11_Quiz quiz = new Ex11_Quiz();
		//3. 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
		//가위 : 1
		//바위 : 2
		//보 : 3
		Scanner sc=new Scanner(System.in);
		int random=(int)(Math.random()*3)+1;
		int rsp=0;
		System.out.println("[1:가위].[2:바위].[3:보]");
		rsp=Integer.parseInt(sc.nextLine());
		int result = rsp - random; // 0: 비김, 1: 이김 -2: 이김 // 나머지는 짐
		if (rsp==1) { //사용자 : 가위
			if(random==1) {
				quiz.sayDraw();
			}else if(random==2) {
				quiz.sayLose();
			}else {
				quiz.sayWin();
			}
		}else if(rsp==2) { //사용자 : 바위
			if(random==1) {
				System.out.println("이겼습니다");
			}else if(random==2) {
				System.out.println("비겼습니다");
			}else {
				System.out.println("졌습니다");
			}
		}else if(rsp==3) { //사용자 : 보
			if(random==1) {
				System.out.println("졌습니다");
			}else if(random==2) {
				System.out.println("이겼습니다");
			}else {
				System.out.println("비겼습니다");
			}
		}else {
			System.out.println("다시 입력하세요");
		}
		
		//은행 입출금
		boolean auto = true;
		int balance = 0;
		
		Scanner sc1 = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**********************");
			System.out.println("1. 예금  |  2. 출금  |  3. 잔고  |  4. 종료");
			System.out.println("**********************");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc1.nextLine());
			switch (input) {
				case 1: 
							System.out.println("예금 :");
							balance +=  Integer.parseInt(sc1.nextLine());
							break;
				case 2:
							System.out.println("출금 :");
							balance -=  Integer.parseInt(sc1.nextLine());
							break;
				case 3:
							System.out.println("잔고 : " + balance);
							break;
				case 4:
							System.out.println("종료합니다");
							auto = false;
							break;
				default: System.out.println("올바른 메뉴를 선택하세요");
			}
		}
		
		}
	
	void sayWin() {
		System.out.println("이겼습니다");
	}
	
	void sayLose() {
		System.out.println("졌습니다");		
	}
	
	void sayDraw() {
		System.out.println("비겼습니다");				
	}
	}
