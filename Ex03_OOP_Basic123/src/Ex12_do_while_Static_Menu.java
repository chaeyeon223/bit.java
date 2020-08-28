import java.util.Scanner;

public class Ex12_do_while_Static_Menu {
	//상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	Scanner sc = new Scanner(System.in); //부품(참조:클래스)
	String choiceMenu="";
	
//	//기능
	public void inputRecord() {
		System.out.println("메뉴를 입력하세요");
		String a=sc.nextLine();
		choiceMenu+=a;
		System.out.println(a+"가 추가되었습니다.");
	}
	public void deleteRecord() {
		System.out.println("가 제거되었습니다.");

	}
	public void sortRecord() {
		System.out.println("현재 담아놓은 메뉴 : "+choiceMenu);
	}
	
	
	
	
	 int displayMenu() {
		System.out.println("***************");
		System.out.println("****메뉴를 입력하세요****");
		System.out.println("1. 메뉴 추가 ");
		System.out.println();
		System.out.println("2. 메뉴 제거 ");
		System.out.println();
		System.out.println("3. 장바구니 ");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while 탈출 (1<= menu <=4) >> break : for / do(while)문 빠지기
						}else {
							//1보다 작거나 4보다 큰 값값 .. 프로그램적인 오류 (x)
							//나는 오류 보겠다 (오류 사용자 강제)
							//System.out.println("잘못 입력 하셨습니다");
							throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~4번까지 입력");
			  }
		}while(true);
		//실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
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
			case 4 : System.out.println("프로그램 종료");
					 //return;  //main 종료
					 System.exit(0); //프로그램 강제 종료 (kill)
			}
		}
	}

}



