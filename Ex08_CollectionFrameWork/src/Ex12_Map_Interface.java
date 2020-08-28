import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex12_Map_Interface {

	public static void main(String[] args) {
		//Map �������̽� ���� 
		//HashTable(������ >> ����ȭ O) , HashMap (�Ź��� >> ����ȭ ���� X ... ����ȭ �Ҽ��� ���Ҽ��� ...'���ɰ��')
		//Map : (Key,Value) ���� ������ ������ '�迭'
		//ex. ������ȣ (02,����) ...
		//(key,value) >> key���� �ߺ� ��� X / value���� �ߺ� ��� O
		//generic ����
		
		HashMap map=new HashMap();
		map.put("Tiger","1004");
		map.put("Scott","1004");
		map.put("Superman","1004");
		System.out.println(map.containsKey("Tiger"));//��ҹ��� ����
		System.out.println(map.containsValue("1004"));//�ϳ��� �־ true
		
		System.out.println(map.get("Tiger")); // key���� ���� value�� ����
		System.out.println(map.get("Hong")); //key���� ������ null����
		
		map.put("Tiger","1007");//����� 
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		Object value=map.remove("Superman");
		System.out.println(value);//removeŰ value
		System.out.println(map);
		
		//**����
		//����X, �ߺ�X �������� ���� (Set)
		Set set=map.keySet(); //keySet�Լ��� Set�� �����ϰ��ִ� ��ü�� �ּ� ����
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//�ߺ� O >> ArrayList
		Collection clist=map.values();
		System.out.println(clist.toString());
		

	}

}
