/*
 String Ŭ����(���ڿ�)
 - ������ �Լ� (���ڿ� ���� : �ڸ���, ��ġ�� ...)
 >> static �Լ� + �Ϲ��Լ�
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str=""; //default >> null or ""
		//����� : int, double ó�� ��� 
		String [] arr= {"aaa","bbb","ccc"};
		for(String s:arr) {
			System.out.println(s);
		}
		
		////////////////////////////////////////
		String str1="ȫ�浿";
		System.out.println(str1.length());
		System.out.println(str1.toString());
		System.out.println(str1); //�ּҰ��� �ȳ��� >> �ڿ� toString()����
		//Object�� ������ toString() ������ >> ���� ����ϵ���
		String stra=new String("ȫ�浿");
		//1. String name="�����ٶ�"; >>
		//String�� ����������  char[]�޸𸮸� ����Ѵ� >> char[] >> [��][��][��][��][��]
		//length��� ���� (���� ���� ����)					
		String name="�����ٶ�";
		System.out.println(name.length());
		//class String extends Object{char[] ... @Override toString{...} length()  }
		
		String str2="AAA";
		String str3="AAA";
		System.out.println(str2);
		System.out.println(str3.toString());
		System.out.println(str2==str3);
		// == ������ ��  (�� ��)>> str2(�ּҰ�), str3(�ּҰ�)
		//�޸𸮿� ���� ���ڿ��� ������, ���� ������ �ʰ� ���� ... >> ���� �ּҰ� ����
		System.out.println(str2.equals(str3)); // �ּҸ� ã�ư��� �� �ȿ� �ִ� �� ��
		
		//�׷���..����
		String str4=new String("BBB");
		String str5=new String("BBB");
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
		//new : ���ο� �޸� ���� (���� X) >> �ּҰ� ���� �ٸ�
		
		}

}
