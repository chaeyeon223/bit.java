class Person{
	String name;
	int age;
	
	void print() {
		System.out.println(this.name+"."+this.age);
	}
}


//Ŭ���� = ������Ÿ��

public class Ex05_Array_Object {

	public static void main(String[] args) {
		int [] intarr=new int[10]; //��Ÿ�� �迭
		boolean[] boarr=new boolean[5]; //��Ÿ�� �迭
		//��Ÿ�� �迭�� ������ �濡 �⺻���� ����ִ�. (default value)
		
		//����Ÿ�� �迭
		Person p=new Person();
		p.name="ȫ�浿";
		p.age=100;
		
		//����� 3�� ������
		Person[] personarr=new Person[3]; // 3���� ���� ��������µ�, ���� ����ִ�.
		System.out.println(personarr); //�迭�� �ּҰ�
		System.out.println(personarr[0]); //����Ÿ���� default : null
		
		personarr[0]=new Person();
		personarr[1]=new Person();
		System.out.println(personarr); //�迭�� �ּҰ�
		System.out.println(personarr[0]); //����Ÿ���� default : null
		personarr[0].age=100;

		//****** ��ü �迭�� ���� ����� �۾��� ���� ä��� �۾��� ���� ********\
		personarr[2]=personarr[0];
		personarr[0].name="������";
		personarr[1].name="�ƹ���";
		
		//��ü �迭  for
		for(int i=0;i<personarr.length;i++) {
			System.out.println(personarr[i].name);
		}
		
		//��ü �迭 3���� ������� �����
		//1. int[] arr=new int[5]
		Person[] personarr1=new Person[5];
		for(int i=0;i<personarr1.length;i++) {
			personarr1[i]=new Person(); //�迭�� �ּҸ� ���´�
			System.out.println(personarr1[i]);
		}
		//2. int[] arr=new int[]{10,20,30}
		Person[] peresonarr2=new Person[] {new Person(),new Person(),new Person()};
		//3. int[] arr={10,20,30}
		Person[] personarr3={new Person()	,new Person(),new Person()};
	}

}
