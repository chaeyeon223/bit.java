import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		//반복문 (while / do while)
		int i=10;
		while (i>=10) {
			System.out.println(i);
			i--; //반드시 증가감 논리 필요
		}
		
		//while 문 1~100까지의 합
		int sum=0;
		int j=1;
		while (j<=100) {
			//j++; >>> sum=5150 **주의 사항 (먼저 더하기)
			sum+=j;
			j++;
		}System.out.println(sum);

		//while 문 구구단
		int a=2;
		int b=1;
		while(a<=9) {
			b=1; // 초기화 하지 않으면, b는 계속 10.
			while(b<=9) {
				System.out.printf("%d*%d=%d\t",a,b,a*b);
				b++;
			}System.out.println();
			a++;
		}
		
		/* while 안에서 if / swicth  가능
		 * while(true) { if(true) break; }
		 */
		
		//do ~ while >> 강제적 수행  : 무조건 한번은 실행함
		//do { 실행문 } while (조건문)
		//메뉴 구성
		
		Scanner sc=new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.println("숫자 입력해(0~9)");
			inputdata=Integer.parseInt(sc.nextLine());
		}while(inputdata>=10); //조건이 true 일 경우 >> do문 계속 실행
											//조건이 false 일 경우 >> 탈출
											//탈출하고 싶으면 >> 거짓으로 만들기
		System.out.println("당신이 입력한 숫자는 :"+inputdata);
			
		//
		
		
		
		
		
	}

}
