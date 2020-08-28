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
		Pbase p=c; //다형성
		
		Dbase d=new Dbase();
		p=d; //다형성
		
		c=(Cbase)p; //down casting (자식이 더 작기 때문)
		
		
		
	}

}
