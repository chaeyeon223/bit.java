import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Collection FrameWork
 
 Iterator �������̽� : ������ �ڿ��� ���� ���������� �����ؼ� ���� �����ϴ� ǥ��
 >> hasNext(), Next(), remove() �Լ� �߻�ȭ
 >> ArrayList >> Iterator�� �����ϵ��� ... 
 
 ArrayList�� iterator()�� ����
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
		//ǥ��ȭ�� ��¹���� ���� (������ �ڿ��� ���ؼ�)
		Iterator it=list.iterator(); //Iterator��� �������̽��� �����ϰ��ִ� ��ü�� �ּ� >> ��ü : hasNext(), ...
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
		//������ ��ȸ ǥ��ȭ
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		//������ ��ȸ for��
		for(int i=intlist.size()-1;i>=0;i--) {
			System.out.println(intlist.get(i));
		}
		
		System.out.println("------------------------------");
		
		//������ ��ȸ ǥ��ȭ >> (����) : ���������� �ѹ� ���� �;ߵ�
		ListIterator<Integer> it3=intlist.listIterator();
		//������
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		//������
		while(it3.hasPrevious()) { //�������� �ִ�??
			System.out.println(it3.previous());
		}
		
	}

}
