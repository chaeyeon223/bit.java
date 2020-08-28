import java.util.Arrays;

/*
 배열은 객체다 (Array)
 1. new 를 통해서 생성 / 주소값을 통해 ...
 2. heap 영역에 생성
 3. 고정 배열(정적 배열) >> 배열의 크기가 한번 정해지면, '변경 불가' (고정)
 4. 자료구조 기본 ... 

 */



public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// int s, s1, s2, s3; //같은 타입의 변수들
		
		int [] score=new int[3]; //int방 3개 heap 영역에 생성
		System.out.println(score[0]); //read >> new 객체 default값: 0
		score[0]=101; //write
		score[1]=202;
		score[2]=303;
		System.out.println(score[0]);
		//방의 개수는 항상 index값보다 1크다
		
		//Array 배열 (궁합 : 제어문)
		for(int i=0;i<3;i++) {
			System.out.printf("%d=%d\t",i,score[i]);
		}
		System.out.println();
		for(int i=0;i<score.length;i++) { //score.length >> 배열의 개수 (같다 포함 X : index값은 방의 개수보다 1작기 때문)
			System.out.printf("%d=%d\t",i,score[i]);
		}
		//Tip Array 도와주는 클래스 (**처음 하는 사람은 금기**)
		System.out.println();
		//1
		String resultarray=Arrays.toString(score);
		System.out.println(resultarray);
		//2
		Arrays.parallelSort(score);;
		resultarray=Arrays.toString(score);
		System.out.println(resultarray);
		
		
		//Today point
		//배열 생성 3가지
		int[] arr=new int[5]; //기본
		int[] arr2=new int[] {100,200,300}; //초기값을 통해서 방이 만들어지고 초기화
		int[] arr3= {11,22,33,44,55}; //가장 많이 쓰임
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//배열은 객체다
		int [] arr4; //배열 선언
		arr4=new int[] {21,22,23,24,25}; //할당 (선언과 할당 분리 가능)
		System.out.println(arr4); //주소값
		
		int[] arr5=arr4; //주소값 할당
		System.out.println(arr5);
		System.out.println(arr4==arr5);
		
		//배열의 타입은 : 8가지 기본타입 + String + 클래스 (사용자 정의 타입)
		String[] strarr=new String[] {"가", "나", "다라마"};
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);
	}
		char[] charr=new char[10]; //default값 : 빈문자 \u0000
		for(int i=0;i<charr.length;i++) {
			System.out.println(">"+charr[i]+"<");
		}

	}
}