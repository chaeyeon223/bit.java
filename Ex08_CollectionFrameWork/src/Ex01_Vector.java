import java.util.Vector;

/*
 Collection Framework
 '�ټ��� ������'�� �ٷ�� 'ǥ��ȭ�� �������̽�'�� '�����ϰ� �ִ� Ŭ��������'
 
 Collection �������̽� 
 1. List (���) - ArrayList (����)  
 2. Set (���) - HashSet, TreeSet (����)
 3. Map (Key,Value) - HashMap (����)
 
 1. List (����� ����) : ���� O / �ߺ� O >> ���������� ������(�ڷ�,��ü)���� '�迭�� ����' >> [ȫ�浿][ȫ�浿][ȫ�浿] ���� ����
 	1.1 Vector (������) - ����ȭ ���� (��Ƽ ������ ȯ�濡��) >> Lock ��ġ�� ���� ������ ��ȣ >> ���� ������ / ������ ���� ex. �Ѱ� ȭ���
 	1.2 ArrayList (�Ź���) - ����ȭ ���� (��Ƽ ������ ȯ��) >> Lock ��ġ (X) - �ʿ信 ���� ���� ���� ���� >> ���� ����(�켱) ex. �����
 	- ����, �������� ���� Ÿ�� ������ ���� : Array (����/���� �迭) >> ���� ���� ���� X
 	<Array>
 		1. �迭�� ũ�Ⱑ ���� : Car[] cars={new Car[],new Car[]}; //�� 2��
 		2. ���� ��� (index ÷��) ���ȣ ���� : cars[0],,, : 0���� ~ n���� >> ������ ���� ��ȣ(index)�� length-1
 		3. �ʱ� ���� ���� �Ұ� 		
 	<Vector / ArrayList>
 		1. �迭�� ũ�⸦ �������� Ȯ��(���) ���� >> ����� �迭�� ���Ҵ� �̿� 
 		2. ���� ����(�迭 ���), �ߺ� ���
 		3. �������� ���� �������� Array ��� 
 2. Set (




 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println("�ʱ� default �뷮 : "+v.capacity());//default ũ�� : 10��
		System.out.println("size : "+v.size()); //=array.length 
		v.add("AA");
		v.add("AA");
		v.add(100);
		System.out.println("size : "+v.size()); 
		System.out.println(v.toString()); //toString ������
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i)); //get(index) : �� ���� = arr[index]
		}
		for(Object obj:v) {
			System.out.println(obj);
		}

		
		Vector v3=new Vector();
		System.out.println(v3.capacity()); //10��
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");//11��° >> �� �ø��� >> 2��� �� �ø���
		System.out.println(v3.capacity()); //�����͸� ���� �� �ִ� ũ��
		System.out.println(v3.size()); //�����Ͱ� ����ִ� ũ��
	}

}
