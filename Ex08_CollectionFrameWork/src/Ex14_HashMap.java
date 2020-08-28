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
		std.put("hong",new Student(100,99,88,"ȫ�浿"));
		std.put("kim",new Student(50,40,60,"������"));

		Student sts=std.get("hong");
		System.out.println(sts.kor);
		System.out.println(sts.math);
		
		//Tip
		//Map�ȿ� key,value >> key+"="+value >> 
		Set set=std.entrySet(); //entrySet()�� Set���� ����
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//�и��� key,value�� ��������??
		//class Entry{Object key, Object value}
		//Map {Entry[] elements} >> [{key,value}] >> Map.Entry �������̽�
		for(Map.Entry m:std.entrySet()) { //entrySet()�� Interface���� ����
			System.out.println(m.getKey()+"/"+((Student)m.getValue()).name);
		}
		
		
		
		
		//Tip
		ArrayTest at=new ArrayTest();
		at.al.add(new String[] {"1","2","3","4"});
		at.al.add(new String[] {"5","6","7","8"});
		System.out.println(at.al.get(0)); //�ּҰ�
		
		
		
	}

}
