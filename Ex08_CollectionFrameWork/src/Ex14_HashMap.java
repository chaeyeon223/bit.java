import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 HashMap<K, V>
 
 - HashMap<String, String>
 - HashMap<Integer, String>
 *HashMap<String, Student>* >> put("kim", new Student());
 *HashMap<String, ArrayList>*
 
 */
class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}	
}

class ArrayTest{
	ArrayList<String[]>al=new ArrayList<String[]>();
}
public class Ex14_HashMap {

	public static void main(String[] args) {
		HashMap<String, Student>std=new HashMap<String, Student>();
		std.put("hong",new Student(100,99,88,"홍길동"));
		std.put("kim",new Student(50,40,60,"김유신"));

		Student sts=std.get("hong");
		System.out.println(sts.kor);
		System.out.println(sts.math);
		
		//Tip
		//Map안에 key,value >> key+"="+value >> 
		Set set=std.entrySet(); //entrySet()을 Set으로 받음
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//분리된 key,value를 얻으려면??
		//class Entry{Object key, Object value}
		//Map {Entry[] elements} >> [{key,value}] >> Map.Entry 인터페이스
		for(Map.Entry m:std.entrySet()) { //entrySet()을 Interface으로 받음
			System.out.println(m.getKey()+"/"+((Student)m.getValue()).name);
		}
		
		
		
		
		//Tip
		ArrayTest at=new ArrayTest();
		at.al.add(new String[] {"1","2","3","4"});
		at.al.add(new String[] {"5","6","7","8"});
		System.out.println(at.al.get(0)); //주소값
		
		
		
	}

}
