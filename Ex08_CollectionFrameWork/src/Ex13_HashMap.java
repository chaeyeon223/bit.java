import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

	public static void main(String[] args) {
		//일상생활
		//지역번호, 우편번호, 회원가입(id/password) 정보...
		HashMap loginmap=new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		//우리 시스템의 가입한 회원의 아이디,비번 정보
		//id(o), pw(o) >> 회원(방가)
		//id(o), pw(x) >> 비밀번호 다시 입력해 >> 3번틀리면 
		//id(x) pw(o) >> 
		//id(x) pw(x) >>
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("id, pw입력해주세요");
			System.out.println("ID");
			String id=sc.nextLine().trim().toLowerCase(); //양쪽공백제거, 소문자로 변환
			System.out.println("PWD");
			String pwd=sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) { //ID(x)
				System.out.println("ID가 맞지않습니다.");
			}else {
				if(loginmap.get(id).equals(pwd)) { //ID(o), pwd(o)
					System.out.println("회원 방가");
					break;
				}else {
					System.out.println("비밀번호를 확인하세요"); //id(o), pwd(x)
				}
			}
		}
		
		
	}
}
