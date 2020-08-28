public class Ex03_Array_Lotto_main {

	public static void main(String[] args) {
		//중복제거
		int[] lotto=new int[6] ; //방 6개 만들기
		for (int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45 + 1); //1~45 숫자 뽑기
			for (int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--; //감소시키지 않으면, for문 탈출해서 맨위에 for문에서 i증가하기 때문에 >> 다시 추출하기 위해 i를 감소시켜 다시 돌기
					break;
				}
			}
		}
		for (int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}System.out.println();
		//정렬
		int temp=0;
		for (int i=0;i<lotto.length;i++) {
			for(int j=(i+1);j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					temp=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp;
				}
			}
			System.out.println(lotto[i]);
		}
	
	
	
	
	
	}
}