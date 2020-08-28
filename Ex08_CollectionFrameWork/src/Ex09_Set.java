import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set �������̽��� �����ϰ��ִ� Ŭ����
//Set : �� �ȿ� ������ (���� X, �ߺ� X) >> ������ ���� �ߺ��� ������� �ʴ� �������� ����
//HashSet, TreeSet

public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo2=hs.add(55);
		System.out.println(bo2); //���������� �� true
		
		bo2=hs.add(1);
		System.out.println(bo2); //���������� ���� ���� (�ߺ�������) false
		
		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); // ������ ���� : ��¼��� ���� X (index�� ���� ����)
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("A");
		hs2.add("B");
		hs2.add("C");
		hs2.add("A");
		hs2.add("D");
		hs2.add("C");
		System.out.println(hs2.toString());
		
		String[] obj= {"A","B","C","D","B","A"};
		HashSet<String>hs3=new HashSet<String>();
		for(int i=0;i<obj.length;i++) {
			hs3.add(obj[i]); //�ߺ��� �ɷ����� ����
		}System.out.println(hs3.toString());
		
		//Quiz
		//HashSet ��� 1~45���� 6���� ��������
		//Lotto
		HashSet<Integer> lotto=new HashSet<Integer>();
		for(int i=0;lotto.size()<6;i++) { //*lotto.size()<6
			int num=(int)(Math.random()*45 + 1);
			lotto.add(num);
		}System.out.println(lotto.toString());

		//Lotto2
		Set set2=new HashSet(); // Set�θ�Ÿ��
		int index=0;
		while(set2.size()<6) {
			int num=(int)(Math.random()*45 + 1);
			set2.add(num);
		}System.out.println(set2);
		
		HashSet<String> set3=new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());
		
		Iterator<String> i4=set3.iterator();
		while(i4.hasNext()) {
			System.out.println(i4.next());
		}
		
		
		
		
	}
}
