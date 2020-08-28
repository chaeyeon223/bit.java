import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Collection FrameWork
 
 Iterator 인터페이스 : 나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준
 >> hasNext(), Next(), remove() 함수 추상화
 >> ArrayList >> Iterator를 구현하도록 ... 
 
 ArrayList가 iterator()를 구현
 Ex.///
 public Iterator iterator(){
 	return new A implements Iterator
 }
 */
public class Ex08_Collection_Iterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//표준화된 출력방식을 원해 (나열된 자원에 대해서)
		Iterator it=list.iterator(); //Iterator라는 인터페이스를 구현하고있는 객체의 주소 >> 객체 : hasNext(), ...
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//it.hasNext(); //true,false return
		//it.next();
		//it.remove();
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		Iterator<Integer> it2=intlist.iterator();
		//순방향 조회 표준화
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		//역방향 조회 for문
		for(int i=intlist.size()-1;i>=0;i--) {
			System.out.println(intlist.get(i));
		}
		
		System.out.println("------------------------------");
		
		//역방향 조회 표준화 >> (조건) : 순방향으로 한번 갔다 와야됨
		ListIterator<Integer> it3=intlist.listIterator();
		//순방향
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		//역방향
		while(it3.hasPrevious()) { //이전값이 있니??
			System.out.println(it3.previous());
		}
		
	}

}
