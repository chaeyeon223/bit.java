
public class Ex08_Array {

	public static void main(String[] args) {
		//다차원 배열(2차원)
		//[행][열]
		//영화관 좌석, 지도 (좌표 x.y), 바둑판, 
		//영화관 예매관리 프로그램 (조회, 취소)
		
		int[][] score=new int[3][2];
		System.out.println(score[0][0]); //int default = 0
		score[0][0]=100;
		score[0][1]=200;
		score[1][0]=300;
		score[1][1]=400;
		score[2][0]=500;
		score[2][1]=600;
		//이중 for문 
		//행의 개수 : 배열이름.length >> score.length
		//열의 개수 : 배열이름[i].length
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) { //*** j<score[i].length ***
				System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
			}System.out.println();
		}
		
		int[][] score3=new int[][] {
			{11,12},
			{13,14},
			{15,16}
		};
		//모닝 퀴즈
		//개선된 for문을 사용해서 배열 값 출력
		for (int[] value:score3) {  //행의 주소값
			for(int value1:value)
			System.out.println(value1);
		}
		
		
		
		
		
	}
}
