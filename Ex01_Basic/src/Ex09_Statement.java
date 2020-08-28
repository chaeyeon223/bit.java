import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner sc= new Scanner(System.in);
		/*
		 * if(sc.hasNextInt()){ //의문 (true/false) 
		 * 정수가 입력됨 
		 * }else {
		 * 
		 * }
		 */
		
		//암기 **
		//조건문 : if문 3가지, switch문
		//반복문 : for문 (반복 횟수 명확), while문 (treu/false), do ~ while문
		//분기문 : break (블록 탈출) / continue (아래 구문 스킵)
		
		int count=0;
		if (count<1) {
			System.out.println("true");
		}
		
		char data='A';
		switch(data) {
		case 'A':System.out.println("문자비교");
			break; //스위치 블록 탈출 <> return : (main) 함수 탈출
		default:System.out.println("나머지 모든 것");
			break; //default는  break 생략 가능
		}
		//1~100까지의 합 - for문
		int sum=0;
		for (int i=1;i<=100;i++) {
			sum+=i;
		}System.out.println(sum);
		
		//1~5까지의 합 (공식 사용)
		//n*(a+l)/2 >>> 개수*(시작값+끝값)/2
		sum=5*(1+5)/2;
		System.out.println(sum);
		
		//for문을 사용하여 1~10까지의 홀수의 합 구하기
		//단, for문만 사용
		int sum_1=0;
		for (int i=1;i<=10;i+=2) { 
			sum_1+=i;
		}System.out.println(sum_1);
		
		//1~100까지의 짝수 합 
		//if 사용 가능
		int sum_2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum_2+=i;
			}
			}
		System.out.println("짝수의 합 : "+sum_2);
		
		//입사시험 필수 문제 - 구구단 출력 (중첩 for문)
		//2단-9단
		for (int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				//System.out.printf("[%d]*%d[]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//분기문 (continue / break)
		//Today Point : continue (아래 구문 skip) / break (while, for 블록 탈출 >> 함수 탈출 x)
		for (int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if (i==j) {
					break;
				}
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		//
		for (int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if (i==j) {
					continue;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		//별찍기
		for (int i=2;i<=9;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역으로 돌기
		for(int i=100;i>=0;i--) {
			System.out.println(i);
		}
		
		//피보나치 수열
		int a=0, b=1, c=0;
		for(int i=0;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(" "+c);
		}
		
		
		
	}
}
