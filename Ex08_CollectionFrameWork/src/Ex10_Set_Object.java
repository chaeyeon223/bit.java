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
		System.out.println("�й� : "+this.id);
		System.out.println("�̸� : "+this.name);
	}
	
	public static void display(Myclass c) {
		c.displayinfo();
	}
	@Override
	public String toString() {
		return "Myclass [�й�=" + id + ", �̸�=" + name + "]";
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
		
		//Iterator ���
		Iterator<Myclass> it5=hset.iterator();
		while(it5.hasNext()) {
			System.out.println(it5.next().toString()); //next�� set�� ����ִ� ���� �ּҸ� ��ȯ MyclassŸ��
		}

	}

}
