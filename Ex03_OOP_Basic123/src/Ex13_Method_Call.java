class Data{
	int i;
	
}

public class Ex13_Method_Call {
	public static void main(String[] args) {
		Data d=new Data();
		d.i=100;
		System.out.println(d.i);
		
		scall(d); //d�� �ּҸ� �������� >> �ּҸ� �ѱ�
		System.out.println("after d.i: "+d.i);
		vcall(d.i);//111 > d.i�� 111�� ���� �������� >> 111 ���� �ѱ�
		System.out.println("d.i: "+d.i);//111
	}
	static void scall(Data sdata) {
		System.out.println("�Լ� : "+sdata.i);
		sdata.i=111;
	}
	static void vcall(int x) {
		System.out.println("before x: "+x);
		x=8888;
		System.out.println("after x: "+x);
	}

}
