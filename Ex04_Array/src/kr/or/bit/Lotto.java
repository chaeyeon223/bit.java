package kr.or.bit;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

/* 
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
     (int)(Math.random()*45 + 1)
     lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)

추후에는 별도의 클래스 분리해서 Lotto.java ..... 
현재 main 함수 안에서 사용 ....연습..
*/

//
public class Lotto {
	//public int[] numbers=new int[6]; //틀린코드는 아니지만, 개선 필요
	//public Scanner sc=new Scanner(System.in); //개선의 여지
	private int[] numbers;
	private Scanner sc;
	private Random r;
	public Lotto() { //member field 초기화
		numbers=new int[6];
		sc=new Scanner(System.in);
		r=new Random();
	}
	//기능 : 함수 하나당 기능 하나
	//함수는 public >> 노출 필요 
	// private 함수 ?? >> 내부에서 사용되는 공통 함수
	public void selectLottoNumbers() {
		loop_1 : while(true) {
			String selectnum=showMenu();
			switch(selectnum) {
			case "1": //makeLottoNumber(); showLottoNumbers();//실번호 추출
						do {
							makeLottoNumber();
						}while(!checkAverage());
				try {
					showLottoNumbers();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "2": //프로그램 종료 >> 함수 종료 : return / 프로그램 종료 : System.exit(0) , 라벨값 사용
				System.out.println("Good Luck ^^");
				break loop_1; //break의 지점이 switch가 아닌, 라벨(loop_1)위치로 탈출 (while문 탈출)
			default : System.out.println("not in operation~~~");
				break;
			}
		}
	}
	private String showMenu() {
		System.out.println("***********************");
		System.out.println("1. 당첨 예상 번호 추출하기");
		System.out.println("2. 프로그램 종료 ^^! ^^!");
		System.out.println("원하는 메뉴 번호를 입력하세요");
		String selectnum=sc.nextLine();
		return selectnum;
		//return null; //처음 설정에서 에러 방지
	}
	//번호추출 + 중복값 배제
	private void makeLottoNumber() {
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*45 + 1); //1~45 숫자 뽑기
			for (int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					i--; //감소시키지 않으면, for문 탈출해서 맨위에 for문에서 i증가하기 때문에 >> 다시 추출하기 위해 i를 감소시켜 다시 돌기
					break;
				}
			}
		}
	}
	//화면 출력 (정렬)
	private void showLottoNumbers() throws Exception{
		int temp=0;
		for (int i=0;i<numbers.length;i++) {
			for(int j=(i+1);j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
			System.out.printf("[%2d]",numbers[i]);
		}System.out.println();
		
		//Lotto 파일에 저장
		FileWriter writerlotto=new FileWriter("Lotto.txt",true);
		BufferedWriter bw=new BufferedWriter(writerlotto);
		String str="";
		for(int i=0;i<numbers.length;i++) {
			str+=numbers[i];
		}
		bw.write("로또 당첨번호");
		bw.newLine();
		bw.write(str);
		bw.newLine();
		bw.close();
		writerlotto.close();
		

		
		
	}
	//로또번호의 합의 평균 범위...아니면 재추출
	private boolean checkAverage() {
		int sum=0;
		int average=0;
		for(int num:numbers) {
			sum+=num;
		}
		average=sum/numbers.length;
		System.out.println("평균 : "+average);
		return(average>=15&&average<=35); //true : OK / false : 재추출
	}
	
	

	
	
}
