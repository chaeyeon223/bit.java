import kr.or.bit.Bird;

//Bird 상속받아서 구현
//protected : 상속관계에서 필요에 따라 '재정의' 했으면 좋겠어 
//상속관계 >> protected 재정의
class Bi extends Bird{

	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
}


class Ostrich extends Bird{
	
	void run() {
		System.out.println("run !");
	}
	@Override
	protected void moveFast() {
		run();
	}
	
}
public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi=new Bi();
		bi.fly();
		bi.moveFast();

		Ostrich os=new Ostrich();
		os.run();
		os.moveFast();
	}

}
