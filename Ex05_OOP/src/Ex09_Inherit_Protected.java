import kr.or.bit.Bird;

//Bird ��ӹ޾Ƽ� ����
//protected : ��Ӱ��迡�� �ʿ信 ���� '������' ������ ���ھ� 
//��Ӱ��� >> protected ������
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
