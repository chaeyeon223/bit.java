import java.util.Arrays;

/*
 �迭�� ��ü�� (Array)
 1. new �� ���ؼ� ���� / �ּҰ��� ���� ...
 2. heap ������ ����
 3. ���� �迭(���� �迭) >> �迭�� ũ�Ⱑ �ѹ� ��������, '���� �Ұ�' (����)
 4. �ڷᱸ�� �⺻ ... 

 */



public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// int s, s1, s2, s3; //���� Ÿ���� ������
		
		int [] score=new int[3]; //int�� 3�� heap ������ ����
		System.out.println(score[0]); //read >> new ��ü default��: 0
		score[0]=101; //write
		score[1]=202;
		score[2]=303;
		System.out.println(score[0]);
		//���� ������ �׻� index������ 1ũ��
		
		//Array �迭 (���� : ���)
		for(int i=0;i<3;i++) {
			System.out.printf("%d=%d\t",i,score[i]);
		}
		System.out.println();
		for(int i=0;i<score.length;i++) { //score.length >> �迭�� ���� (���� ���� X : index���� ���� �������� 1�۱� ����)
			System.out.printf("%d=%d\t",i,score[i]);
		}
		//Tip Array �����ִ� Ŭ���� (**ó�� �ϴ� ����� �ݱ�**)
		System.out.println();
		//1
		String resultarray=Arrays.toString(score);
		System.out.println(resultarray);
		//2
		Arrays.parallelSort(score);;
		resultarray=Arrays.toString(score);
		System.out.println(resultarray);
		
		
		//Today point
		//�迭 ���� 3����
		int[] arr=new int[5]; //�⺻
		int[] arr2=new int[] {100,200,300}; //�ʱⰪ�� ���ؼ� ���� ��������� �ʱ�ȭ
		int[] arr3= {11,22,33,44,55}; //���� ���� ����
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//�迭�� ��ü��
		int [] arr4; //�迭 ����
		arr4=new int[] {21,22,23,24,25}; //�Ҵ� (����� �Ҵ� �и� ����)
		System.out.println(arr4); //�ּҰ�
		
		int[] arr5=arr4; //�ּҰ� �Ҵ�
		System.out.println(arr5);
		System.out.println(arr4==arr5);
		
		//�迭�� Ÿ���� : 8���� �⺻Ÿ�� + String + Ŭ���� (����� ���� Ÿ��)
		String[] strarr=new String[] {"��", "��", "�ٶ�"};
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);
	}
		char[] charr=new char[10]; //default�� : ���� \u0000
		for(int i=0;i<charr.length;i++) {
			System.out.println(">"+charr[i]+"<");
		}

	}
}