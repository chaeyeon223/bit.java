import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok) >> return : true/false
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 return : true/false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 >> void 출력

//3개의 함수 static 
public class Ex07_String_Total_Quiz {

	//1. 14자리 체크 기능
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
	//3. 남자,여자 구별
	static void printGender(String juminnum) {
		if(juminnum.substring(7,8).equals("1")||juminnum.substring(7,8).equals("3")) {
			System.out.println("남자입니다.");
		}else if(juminnum.substring(7,8).equals("2")||juminnum.substring(7,8).equals("4")) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("****************");
			System.out.println("주민등록번호를 입력하세요");
			String juminnum=sc.nextLine();
			if(!juminCheck(juminnum)) {
				System.out.println("14자리로 입력해주세요");
			}else if(!juminFirstnum(juminnum)) {
				System.out.println("뒷자리에 1~4값만 입력해주세요");
			}else {
				printGender(juminnum);
				break;
			}
		}
		
	}

}
