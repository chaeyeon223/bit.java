
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		//수학과 학생들의 기말고사 시험점수
		int[] score=new int[] {79,88,97,54,56,95};
		int max=score[0]; //max 변수 : 79
		int min=score[0]; //min 변수 : 79
		
		//제어문을 사용해서 max 변수에 시험점수 최대값을 , min 변수에 시험점수 최소값을 저장해라
		//단. for문은 한번만 사용할 것
		for (int i=0;i<score.length;i++) {
			if (score[i]>max) {
				max=score[i];
			}else if(score[i]<min){
				min=score[i];
			}
			//max=(score[i]>max)?score[i]:max;
			//min=(score[i]<min)?score[i]:min;
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);

		
		int[] number=new int[10];
		//10개의 방의 값을 1~10까지 값으로 초기화 해라
		for (int i=0;i<number.length;i++) { //array는 default값을 갖고있기 때문에, 초기화하지 않으면 0값을 갖고있음
			number[i]=i+1;
			System.out.println(number[i]);
		}
		
		//Quiz. 어느 학생의 기말고사 시험 점수(5과목)
		int sum=0;
		float average=0f;
		int[] jumsu= {100,55,90,60,78};
		
		//1. 총 과목의 수
		//2. 과목의 합
		//3. 과목의 평균
		//4. 단 2.3문제는 하나의 for문만 사용
		for (int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
	//		if(i==jumsu.length-1) { //마지막 방 번호와 i값이 같으면 ...
	//			average=sum/(float)jumsu.length;
			
		}average=sum/(float)jumsu.length;
		System.out.printf("sum : %d, average : %f",sum,average);
		
		
	}

}
