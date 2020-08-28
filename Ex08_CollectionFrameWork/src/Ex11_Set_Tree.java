import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

	public static void main(String[] args) {
		//Set : ����X, �ߺ�X
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("B");
		hs.add("A");
		hs.add("D");
		System.out.println(hs);
		
		//TreeSet : ����X, �ߺ�X, **���� O
		//������ �˻� �� ���� �ʿ���ϴ� ������ ���տ� ���� (Ex. Lotto)
		//1. ����Ʈ�� ����
		//2. **�����Ͱ� ����� �� ���ĵȴ�
		Set<Integer> lotto=new TreeSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}System.out.println(lotto);
		
		//String
		//������ ��
		//ABC ��
		Set<String> str=new TreeSet<String>();
		str.add("�ȳ��ϼ���");
		str.add("��ä��");
		str.add("�Դϴ�");
		System.out.println(str);
		
		
		
		
	}

}
