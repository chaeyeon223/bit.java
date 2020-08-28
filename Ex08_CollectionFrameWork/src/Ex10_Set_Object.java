import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	
	public Myclass() {
		
	}
	public Myclass(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayinfo() {
		System.out.println("학번 : "+this.id);
		System.out.println("이름 : "+this.name);
	}
	
	public static void display(Myclass c) {
		c.displayinfo();
	}
	@Override
	public String toString() {
		return "Myclass [학번=" + id + ", 이름=" + name + "]";
	}
}
public class Ex10_Set_Object {

	public static void main(String[] args) {
		HashSet<Myclass> hset=new HashSet<Myclass>();
		Myclass mc1=new Myclass(1,"ABC");
		Myclass mc2=new Myclass(2,"DEF");
		Myclass mc3=new Myclass(3,"GHI");
		
		hset.add(mc1);
		hset.add(mc2);
		hset.add(mc3);
		for(Myclass value:hset) {
			value.displayinfo();
		}
		
		//Iterator 출력
		Iterator<Myclass> it5=hset.iterator();
		while(it5.hasNext()) {
			System.out.println(it5.next().toString()); //next는 set에 들어있는 값의 주소를 반환 Myclass타입
		}

	}

}
