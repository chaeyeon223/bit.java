import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex12_Map_Interface {

	public static void main(String[] args) {
		//Map 인터페이스 구현 
		//HashTable(구버전 >> 동기화 O) , HashMap (신버전 >> 동기화 강제 X ... 동기화 할수도 안할수도 ...'성능고려')
		//Map : (Key,Value) 쌍의 구조를 가지는 '배열'
		//ex. 지역번호 (02,서울) ...
		//(key,value) >> key값은 중복 허용 X / value값은 중복 허용 O
		//generic 지원
		
		HashMap map=new HashMap();
		map.put("Tiger","1004");
		map.put("Scott","1004");
		map.put("Superman","1004");
		System.out.println(map.containsKey("Tiger"));//대소문자 구별
		System.out.println(map.containsValue("1004"));//하나만 있어도 true
		
		System.out.println(map.get("Tiger")); // key값에 따른 value값 리턴
		System.out.println(map.get("Hong")); //key값이 없으면 null리턴
		
		map.put("Tiger","1007");//덮어쓰기 
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		Object value=map.remove("Superman");
		System.out.println(value);//remove키 value
		System.out.println(map);
		
		//**응용
		//순서X, 중복X 데이터의 집합 (Set)
		Set set=map.keySet(); //keySet함수는 Set을 구현하고있는 객체의 주소 리턴
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//중복 O >> ArrayList
		Collection clist=map.values();
		System.out.println(clist.toString());
		

	}

}
