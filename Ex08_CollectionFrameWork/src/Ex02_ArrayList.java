import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point
public class Ex02_ArrayList {

	public static void main(String[] args) {
		// List �������̽� ���� ... ���� O / �ߺ� O �������� ����
		
		ArrayList arraylist=new ArrayList();
		//Object Ÿ���� ������ �����迭�� heap�޸𸮿� �����ȴ�
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println(arraylist.toString());
		System.out.println(arraylist.get(1));
		
		//add�Լ� : ���������� ������ �ֱ�
		arraylist.add(0, 111); //***�ڸ� �̵�***
		arraylist.add(4,444);
		System.out.println(arraylist); //toString ����
		//**��������� �����͸� �߰�, ���� >> ArrayList �������� �ʾƿ� (������ �����ؿ�)
		//**�������� �������� �߰�, ���� �� �����ϰ� ���
		
		//remove�Լ� : ����
		//arraylist.remove(200); //index ���� (array����)
		
		//ArrayList �Լ�
		System.out.println(arraylist.contains(500)); //(��)�� arraylist�ȿ� �ִ� ?
		System.out.println(arraylist.contains(444));
		
		arraylist.clear(); //�����ͻ��� (������ ��������)
		System.out.println(arraylist.size()); //0
		System.out.println(arraylist.isEmpty()); //����ִ� ?
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.isEmpty());
		System.out.println("������ : "+arraylist.size());
		Object value=arraylist.remove(0); //0��° ���� ���� �����ϴµ�, �װ��� ����
		System.out.println("������ ������ : "+value);
		System.out.println("���� �� :"+arraylist.size());
		
		//POINT
		//������ ���� �ڵ� ... �ϻ�ٹݻ� ... 
		//������ (Ȯ�强, ������)
		List li=new ArrayList();
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		List li2=li.subList(0, 3); //sublist�� ����� �����ʹ� ������ �ִ� �������� ����
		System.out.println(li2.toString());
		
		ArrayList alist=new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		Collections.sort(alist); //�ʺ��ڴ� ���� ���� �� ��@! //��������
		System.out.println(alist.toString());
		Collections.reverse(alist); //�������� (�������� + reverse)
		
	}

}
