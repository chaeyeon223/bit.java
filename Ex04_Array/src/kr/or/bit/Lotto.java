package kr.or.bit;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

/* 
1. 1~45������ ������ �߻����� 6���� �迭�� ��������
     (int)(Math.random()*45 + 1)
     lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)

���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
���� main �Լ� �ȿ��� ��� ....����..
*/

//
public class Lotto {
	//public int[] numbers=new int[6]; //Ʋ���ڵ�� �ƴ�����, ���� �ʿ�
	//public Scanner sc=new Scanner(System.in); //������ ����
	private int[] numbers;
	private Scanner sc;
	private Random r;
	public Lotto() { //member field �ʱ�ȭ
		numbers=new int[6];
		sc=new Scanner(System.in);
		r=new Random();
	}
	//��� : �Լ� �ϳ��� ��� �ϳ�
	//�Լ��� public >> ���� �ʿ� 
	// private �Լ� ?? >> ���ο��� ���Ǵ� ���� �Լ�
	public void selectLottoNumbers() {
		loop_1 : while(true) {
			String selectnum=showMenu();
			switch(selectnum) {
			case "1": //makeLottoNumber(); showLottoNumbers();//�ǹ�ȣ ����
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
			case "2": //���α׷� ���� >> �Լ� ���� : return / ���α׷� ���� : System.exit(0) , �󺧰� ���
				System.out.println("Good Luck ^^");
				break loop_1; //break�� ������ switch�� �ƴ�, ��(loop_1)��ġ�� Ż�� (while�� Ż��)
			default : System.out.println("not in operation~~~");
				break;
			}
		}
	}
	private String showMenu() {
		System.out.println("***********************");
		System.out.println("1. ��÷ ���� ��ȣ �����ϱ�");
		System.out.println("2. ���α׷� ���� ^^! ^^!");
		System.out.println("���ϴ� �޴� ��ȣ�� �Է��ϼ���");
		String selectnum=sc.nextLine();
		return selectnum;
		//return null; //ó�� �������� ���� ����
	}
	//��ȣ���� + �ߺ��� ����
	private void makeLottoNumber() {
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*45 + 1); //1~45 ���� �̱�
			for (int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					i--; //���ҽ�Ű�� ������, for�� Ż���ؼ� ������ for������ i�����ϱ� ������ >> �ٽ� �����ϱ� ���� i�� ���ҽ��� �ٽ� ����
					break;
				}
			}
		}
	}
	//ȭ�� ��� (����)
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
		
		//Lotto ���Ͽ� ����
		FileWriter writerlotto=new FileWriter("Lotto.txt",true);
		BufferedWriter bw=new BufferedWriter(writerlotto);
		String str="";
		for(int i=0;i<numbers.length;i++) {
			str+=numbers[i];
		}
		bw.write("�ζ� ��÷��ȣ");
		bw.newLine();
		bw.write(str);
		bw.newLine();
		bw.close();
		writerlotto.close();
		

		
		
	}
	//�ζǹ�ȣ�� ���� ��� ����...�ƴϸ� ������
	private boolean checkAverage() {
		int sum=0;
		int average=0;
		for(int num:numbers) {
			sum+=num;
		}
		average=sum/numbers.length;
		System.out.println("��� : "+average);
		return(average>=15&&average<=35); //true : OK / false : ������
	}
	
	

	
	
}
