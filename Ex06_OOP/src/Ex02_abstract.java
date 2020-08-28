//���� : unit(����)
//unit : ������ (�̵���ǥ, �̵�, �����) : �߻�ȭ, �Ϲ�ȭ
//unit : �̵������ �ٸ��� (�̵���� unit���� ������ ���� �ʿ� ... ������)
//abstract class �̸� { abstract �̵�(); }


abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	//�̵� (����)
	abstract void move(int x, int y); //�߻��ڿ�
}
//Tank
class Tank extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank �̵�"+this.x+","+this.y);
	}
	//Tank���� ��üȭ, Ư��ȭ�� ���
	void changeMode() {
		System.out.println("��ũ ��ȯ���");
	}
}

//���
class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Marine �̵�"+this.x+","+this.y);
	}
	//Marine���� ��üȭ, Ư��ȭ ���
	void stimpack() {
		System.out.println("������ ���");
	}
}

//���۱�
class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Dropship �̵� : "+this.x+","+this.y);
	}
	//Ư��ȭ, ��üȭ
	void load() {
		System.out.println("Unit Load...");
	}
	void unload() {
		System.out.println("Unit unload...");
	}
	
}
public class Ex02_abstract {
	public static void main(String[] args) {
		Tank t=new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m=new Marine();
		m.move(500, 200);
		m.stop();
		m.stimpack();
		
		//1. Tank 3�븦 �����, ���� ��ǥ�� �̵���Ű�� (555,444)
		Tank [] tankarr= {new Tank(), new Tank(), new Tank()};
		for(int i=0;i<tankarr.length;i++) {
			tankarr[i].move(555, 444);
		}
		//2. �������� Unit (Tank 1��, Marine 1����, Dropship 1��) ���� ��ǥ�� �̵���Ű�� (666,444)
		Unit[] uniarr=new Unit[] {new Tank(),new Marine(), new Dropship()};
		for(int i=0;i<uniarr.length;i++) {
			uniarr[i].move(666, 444);
			//for (Unit unit:uniarr){
			// unit.move(666,444);
			//}
		}
	}

}
