public class Ex03_Array_Lotto_main {

	public static void main(String[] args) {
		//�ߺ�����
		int[] lotto=new int[6] ; //�� 6�� �����
		for (int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45 + 1); //1~45 ���� �̱�
			for (int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--; //���ҽ�Ű�� ������, for�� Ż���ؼ� ������ for������ i�����ϱ� ������ >> �ٽ� �����ϱ� ���� i�� ���ҽ��� �ٽ� ����
					break;
				}
			}
		}
		for (int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}System.out.println();
		//����
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