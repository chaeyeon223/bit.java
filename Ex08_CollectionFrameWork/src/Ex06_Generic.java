import java.util.ArrayList;

/*
 Today Point
 Generic : jdk 1.5 (�ʼ����)
 
 Collection Ŭ���� >> ������ �⺻ ������� : Object
 1. Object Ÿ�� : ���� ���� ������, ���� �� ���� >> Ÿ�� ����(��ü ������ Ÿ�� ����) >>���ʸ�
 2. Ÿ���� ������ ����  >> Ÿ�� ����
 3. ���� ����ȯ(casting) X : ex. (Car)Object (X)

 */
//Ŭ���� ������ �� ���ʸ� ����
class MyGen<T>{ //type parameter
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age=100;
	
}
public class Ex06_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen=new MyGen<String>();
		mygen.add("���ڿ�");
		String str=mygen.get();
		System.out.println(str);
		
		ArrayList list=new ArrayList();
		//��������� Ÿ���� object[] elements
		list.add(10);
		list.add(new Person());
		list.add("ȫ�浿");
		
		//������ for������ ���
		for(Object value:list) {
			//��ü�� �Ͱ� �ƴ� �� �����ؾ��� (����Ÿ���� ��� �ּ� ���) >> ����!!!
			if(value instanceof Person) {
				Person p=(Person)value;
				System.out.println(p.age);
			}else {
			System.out.println(value);
			}
		}
		
		ArrayList<Person> plist=new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		plist.add(new Person());
		for(Person value:plist) {
			System.out.println(value.age);
		}
		
	}

}
