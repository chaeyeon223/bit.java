class Pbase{
	int p=100;
	
}
class Cbase extends Pbase{
	int c=200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase c=new Cbase();
		System.out.println(c.toString());
		Pbase p=c; //������
		
		Dbase d=new Dbase();
		p=d; //������
		
		c=(Cbase)p; //down casting (�ڽ��� �� �۱� ����)
		
		
		
	}

}
