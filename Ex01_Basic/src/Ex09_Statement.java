import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
		System.out.println("�Է�");
		Scanner sc= new Scanner(System.in);
		/*
		 * if(sc.hasNextInt()){ //�ǹ� (true/false) 
		 * ������ �Էµ� 
		 * }else {
		 * 
		 * }
		 */
		
		//�ϱ� **
		//���ǹ� : if�� 3����, switch��
		//�ݺ��� : for�� (�ݺ� Ƚ�� ��Ȯ), while�� (treu/false), do ~ while��
		//�б⹮ : break (��� Ż��) / continue (�Ʒ� ���� ��ŵ)
		
		int count=0;
		if (count<1) {
			System.out.println("true");
		}
		
		char data='A';
		switch(data) {
		case 'A':System.out.println("���ں�");
			break; //����ġ ��� Ż�� <> return : (main) �Լ� Ż��
		default:System.out.println("������ ��� ��");
			break; //default��  break ���� ����
		}
		//1~100������ �� - for��
		int sum=0;
		for (int i=1;i<=100;i++) {
			sum+=i;
		}System.out.println(sum);
		
		//1~5������ �� (���� ���)
		//n*(a+l)/2 >>> ����*(���۰�+����)/2
		sum=5*(1+5)/2;
		System.out.println(sum);
		
		//for���� ����Ͽ� 1~10������ Ȧ���� �� ���ϱ�
		//��, for���� ���
		int sum_1=0;
		for (int i=1;i<=10;i+=2) { 
			sum_1+=i;
		}System.out.println(sum_1);
		
		//1~100������ ¦�� �� 
		//if ��� ����
		int sum_2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum_2+=i;
			}
			}
		System.out.println("¦���� �� : "+sum_2);
		
		//�Ի���� �ʼ� ���� - ������ ��� (��ø for��)
		//2��-9��
		for (int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				//System.out.printf("[%d]*%d[]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//�б⹮ (continue / break)
		//Today Point : continue (�Ʒ� ���� skip) / break (while, for ��� Ż�� >> �Լ� Ż�� x)
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
		//�����
		for (int i=2;i<=9;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//������ ����
		for(int i=100;i>=0;i--) {
			System.out.println(i);
		}
		
		//�Ǻ���ġ ����
		int a=0, b=1, c=0;
		for(int i=0;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(" "+c);
		}
		
		
		
	}
}
