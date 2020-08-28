
interface Irepairable{ //~�� �� �ִ� (������ �� �ִ�)
	
}

class Unit2{
	int hitpoint; //�⺻ ������
	final int MAX_HP; //�ִ� ������
	Unit2(int hp){
		this.MAX_HP=hp;
	}
	
}

//���� ����
class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}
//���� ����
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}
//�ǹ�
class CommandCenter implements Irepairable{
	
}
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank2";
	}
}
class Marine2 extends GroundUnit{
	Marine2() {
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
}
}
//Scv : ����ĳ��, ġ��, ������ �÷���
class Scv extends GroundUnit implements Irepairable{
	Scv() {
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}
	//Scv�� ��üȭ, Ư��ȭ ��� : repair
	void repair(Tank2 tank) {
		if(tank.hitpoint!=tank.MAX_HP) {
			this.hitpoint+=5;
		}
	}
	//�����ε�
	void repair(Scv scv) {
		if(scv.hitpoint!=scv.MAX_HP) {
			this.hitpoint+=5;
		}
	}
	//Scv repair �ؾ��ϴ� Unit�� �����ϸ� ... �Լ��� Unit ������ŭ �������� >> �ϳ��� �Լ��� ��� Unit�� ġ���� �� �ִٸ� ??? 
	//������...��Ӱ���, �θ�Ÿ��, �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ� ... ������ǰ ���� ...
	//�츮�� �������ִ� ��� Unit2�� repair�� ����� �ƴϴ� (Marine2)
	//Interface  (implements Irepairable) repair��� ��� >> ���� ������ ���� �ֵ��� ���� �θ� ���Ե�
	
	//Irepairable�� �����ϰ� �ִ� ��ü�� �ּ�: Irepairable�� �θ�Ÿ�� = �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�. (�ڽ� : Tank2, CommandCenter, Scv)
	//repair >> Tank2,Scv : hitpoint++ / CommandCenter : 
	//repairunit�� CommandCenter �̰ų�, �ƴϰų� ���� ó�� ...
	
	//Irepairable repairunit >> Tank2 
	//repairunit�� �� �� �ִ� ���� �ƹ��͵� ���� >> hitpoint�� MAX_HP �ʿ�
	//repairunit(�θ�Ÿ��) >> downcasting (����Ÿ���� ����Ÿ������) >> Tank2 tank=(Tank2)repairunit;
	//Scv scv=(Scv)repairunit;
	
	//�� �ڵ�� ������ ����, ��� ����??
	//Tank�� Scv�� ������ :�θ� GroundUnit >> �θ� Unit2
	
	//CommandCenter�� Unit2�� �ƴϴ� ...
	//1. parameter ���� �ּҰ� Unit2Ÿ���̳�/�ƴϳ� �����ϸ� ? >> ��������� �ΰ����� ������ ó�� ����
	//2. ������ (instanceof)
	//void repair(Irepairable repairunit) >> repair(new Tank2()) : Tank2�� �ּ� >>> if (repairunit instanceof Unit2) ... true
	//void repair(Irepairable repairunit) >> repair(new CommanCenter()) : CommanCenter�� �ּ� >>> if (repairunit instanceof Unit2) ... false
	void repair(Irepairable repairunit) {
		if(repairunit instanceof Unit2) { //repairunit�� �θ�Ÿ���̹Ƿ�, downcasting �ʿ�
			Unit2 unit=(Unit2)repairunit; //unit : Tank2 or Scv
			if(unit.hitpoint!=unit.MAX_HP) {
				unit.hitpoint=unit.MAX_HP;
			}
		}else { //�θ� Unit2�� �ƴϸ� ...
			System.out.println("�ٸ� ��������� �����մϴ�");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank=new Tank2();
		Marine2 marine=new Marine2();
		Scv scv=new Scv();
		
		//����
		tank.hitpoint-=20;
		System.out.println("��ũ : "+tank.hitpoint);
		System.out.println("Scv ������û");
		scv.repair(tank);;
		System.out.println("��ũ �����Ϸ� : "+tank.hitpoint);
		
		scv.hitpoint-=20;
		System.out.println("scv : "+scv.hitpoint);
		System.out.println("Scv ������û");
		scv.repair(scv);
		System.out.println("scv �����Ϸ� : "+scv.hitpoint);

		CommandCenter center=new CommandCenter();
		scv.repair(center);
	}
}
