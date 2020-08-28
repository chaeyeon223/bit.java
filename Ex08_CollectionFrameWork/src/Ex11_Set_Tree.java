import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

	public static void main(String[] args) {
		//Set : 순서X, 중복X
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
		
		//TreeSet : 순서X, 중복X, **정렬 O
		//데이터 검색 및 정렬 필요로하는 데이터 집합에 유리 (Ex. Lotto)
		//1. 이진트리 구조
		//2. **데이터가 저장될 때 정렬된다
		Set<Integer> lotto=new TreeSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}System.out.println(lotto);
		
		//String
		//ㄱㄴㄷ 순
		//ABC 순
		Set<String> str=new TreeSet<String>();
		str.add("안녕하세요");
		str.add("박채연");
		str.add("입니다");
		System.out.println(str);
		
		
		
		
	}

}
