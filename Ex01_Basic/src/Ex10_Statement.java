import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		//�ݺ��� (while / do while)
		int i=10;
		while (i>=10) {
			System.out.println(i);
			i--; //�ݵ�� ������ �� �ʿ�
		}
		
		//while �� 1~100������ ��
		int sum=0;
		int j=1;
		while (j<=100) {
			//j++; >>> sum=5150 **���� ���� (���� ���ϱ�)
			sum+=j;
			j++;
		}System.out.println(sum);

		//while �� ������
		int a=2;
		int b=1;
		while(a<=9) {
			b=1; // �ʱ�ȭ ���� ������, b�� ��� 10.
			while(b<=9) {
				System.out.printf("%d*%d=%d\t",a,b,a*b);
				b++;
			}System.out.println();
			a++;
		}
		
		/* while �ȿ��� if / swicth  ����
		 * while(true) { if(true) break; }
		 */
		
		//do ~ while >> ������ ����  : ������ �ѹ��� ������
		//do { ���๮ } while (���ǹ�)
		//�޴� ����
		
		Scanner sc=new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.println("���� �Է���(0~9)");
			inputdata=Integer.parseInt(sc.nextLine());
		}while(inputdata>=10); //������ true �� ��� >> do�� ��� ����
											//������ false �� ��� >> Ż��
											//Ż���ϰ� ������ >> �������� �����
		System.out.println("����� �Է��� ���ڴ� :"+inputdata);
			
		//
		
		
		
		
		
	}

}
