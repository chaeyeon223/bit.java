import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str="hello";
		String concatstr=str.concat(" world"); //���� ���ڿ� + ���ο� ���ڿ� = ���ڿ� ����
		System.out.println(concatstr);
		
		boolean bo=str.contains("oell"); //�Է°��� ���ڿ��� �ִ��� (�������) Ȯ�� = boolean ����
		System.out.println(bo);
		
		String str2="a b c d"; //[a][ ][b][ ][c][ ][d]
		System.out.println(str2.length()); //���ڵ� ����
		
		String filename="hello java world";//[h][e][l][l][o][ ][j][a][v][a] ...
		System.out.println(filename.indexOf("h")); //index��ġ ���
		System.out.println(filename.indexOf("java"));//�ܾ��� ���� ��ġ
		System.out.println(filename.indexOf("����"));// '-1' : �迭 ���� ���ٴ� �� **
		//���ϴ� ���ڿ��� ���ԵǾ� �ִ��� Ȯ�� ���� ... 0���� ũ�ٸ�, ������  1���� ����
		if (filename.indexOf("wo")>0) { //= filename.indexOf("kim")!= -1 
			System.out.println("wo�� �ϳ��� ������ �ֳ׿�");
		}
		
		System.out.println(filename.lastIndexOf("a")); //������ ó�������� a�� ã�ƶ� **�ڿ������� 0���� ���� X !! ������ �տ������� ����
		 
		//length(), indexOf(), substring(), replace(), split() ...
		String result="superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(5));
		System.out.println(result.substring(0,5)); //beginindex : ���� / endindex : ������ (endindex -1)
		System.out.println(result.substring(5,6)); //�ڱ� �ڽ�
		System.out.println(result.substring(0,0)); // = (0,-1) �ȳ���
		
		//Quiz.
		String filename2="aaaa.zip"; //�Ǵ� hong.png �Ǵ� h.jpeg 
		//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ����ϱ�
		//1. ���ϸ� >> aaaa
		//2. Ȯ���� >> zip
		int indexnum=filename2.indexOf(".");
		System.out.println("���ϸ� : "+filename2.substring(0,indexnum));
		System.out.println("Ȯ���� : "+filename2.substring(indexnum+1));
		
		//replace (ġȯ.��ȯ)
		String str3="ABCDADDDDD";
		String result3=str3.replace("DDDDD","������ �����");
		System.out.println(result3);
		result3=str3.replace("D","d");
		System.out.println(result3);
		
		//split
		//String str4="���۸�,��Ƽ,�����,������,������";
		//String[] namearray=str4.split(",");
		String str4="���۸�.��Ƽ.�����.������.������";
		String[] namearray=str4.split("\\."); 	// "." : ����ǥ���� ����  >> ���� �״�� \. >> �̰͵� ����ǥ���� ���� >> \\.��� ǥ���ؾ���
		for(String s:namearray) {
			System.out.println(s);
		}
		/*
		 ����ǥ���� ǥ�� (java, c# , javascript, oracle) �������� ��Ģ
		 ��� ���ڸ� ���鶧, ��Ģ�� �ο� >> ��ȿ�� �Ǵ��� �ٰ�
		 Ex.�ֹε�Ϲ�ȣ (����6�ڸ�  + '-' + ����7�ڸ�)
		 
		 �������� : ����Ʈ���� ã��, ���� �ؼ� !! 5��
		 (��Ű�Ǿ�)
		*/
		
		//Quiz. split����ؼ� ���ϸ�� Ȯ���� �и�
		String filename3="bit.hwp";
		String[] file=filename3.split("\\.");
		System.out.println("���ϸ� : "+file[0]);
		System.out.println("Ȯ���� : "+file[1]);
		
		//?????
		String str5="a/b,c-d.f";
		StringTokenizer sto=new StringTokenizer(str5,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//ETC
		System.out.println(str3.charAt(5)); //�Է°�(����)�� ���� char�� �ѱ���
		System.out.println(str3.endsWith("DDDA")); //���̻� �� true/false
		System.out.println(str3.endsWith("DDD"));
		System.out.println(str3.equalsIgnoreCase("abcdADDddd")); //��ҹ��� ���� true/false
		
		//�ͼ���
		String str6="ȫ      ��    ��";
		//����� : ���� �����ϰ� ������ ...
		System.out.println(str6);
		System.out.println(str6.replace(" ", ""));
		
		String str7="              ȫ�浿                ";
		System.out.println(">"+str7+"<");
		System.out.println(">"+str7.trim()+"<"); //trim() : �յ� ���� ���� �Լ� 
		
		String str8="            ȫ      ��    ��           ";
		//***�������� �Լ� ���� (method chain ���)***
		System.out.println(str8.trim().replace(" ", ""));
		
		
		
		//Quiz-2
		   String jumin="123456-1234567";
		   //�� �ֹι�ȣ�� ���� ���ϼ���_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum2+= Integer.parseInt(numstr);
		   } 
		   System.out.println("�ֹι�ȣ ��:" + sum2);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("�ֹι�ȣ ��2:" + sum3);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_3
		   String jumin4 = jumin.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("�ֹι�ȣ ��4:" + sum4);

	}

}
