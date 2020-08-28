import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스를 구현하고있는 클래스
//Set : 원 안에 들어가세요 (순서 X, 중복 X) >> 순서가 없고 중복을 허락하지 않는 데이터의 집합
//HashSet, TreeSet

public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo2=hs.add(55);
		System.out.println(bo2); //정상적으로 들어감 true
		
		bo2=hs.add(1);
		System.out.println(bo2); //정상적으로 들어가지 않음 (중복데이터) false
		
		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); // 순서가 없음 : 출력순서 보장 X (index가 없기 때문)
		
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
			hs3.add(obj[i]); //중복값 걸러내기 가능
		}System.out.println(hs3.toString());
		
		//Quiz
		//HashSet 사용 1~45난수 6개를 넣으세요
		//Lotto
		HashSet<Integer> lotto=new HashSet<Integer>();
		for(int i=0;lotto.size()<6;i++) { //*lotto.size()<6
			int num=(int)(Math.random()*45 + 1);
			lotto.add(num);
		}System.out.println(lotto.toString());

		//Lotto2
		Set set2=new HashSet(); // Set부모타입
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
