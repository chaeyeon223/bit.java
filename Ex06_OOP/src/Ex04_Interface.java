
interface Irepairable{ //~할 수 있는 (수리할 수 있는)
	
}

class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP; //최대 에너지
	Unit2(int hp){
		this.MAX_HP=hp;
	}
	
}

//지상 유닛
class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}
//공중 유닛
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}
//건물
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
//Scv : 광물캐기, 치료, 에너지 올려줌
class Scv extends GroundUnit implements Irepairable{
	Scv() {
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}
	//Scv의 구체화, 특수화 기능 : repair
	void repair(Tank2 tank) {
		if(tank.hitpoint!=tank.MAX_HP) {
			this.hitpoint+=5;
		}
	}
	//오버로딩
	void repair(Scv scv) {
		if(scv.hitpoint!=scv.MAX_HP) {
			this.hitpoint+=5;
		}
	}
	//Scv repair 해야하는 Unit이 증가하면 ... 함수를 Unit 개수만큼 만들어야함 >> 하나의 함수가 모든 Unit을 치료할 수 있다면 ??? 
	//다형성...상속관계, 부모타입, 부모는 자식객체의 주소를 가질 수 있다 ... 전자제품 매장 ...
	//우리가 가지고있는 모든 Unit2은 repair의 대상은 아니다 (Marine2)
	//Interface  (implements Irepairable) repair대상만 사용 >> 서로 연관성 없는 애들이 같은 부모를 갖게됨
	
	//Irepairable을 구현하고 있는 객체의 주소: Irepairable는 부모타입 = 자식타입의 주소를 가질 수 있다. (자식 : Tank2, CommandCenter, Scv)
	//repair >> Tank2,Scv : hitpoint++ / CommandCenter : 
	//repairunit을 CommandCenter 이거나, 아니거나 구분 처리 ...
	
	//Irepairable repairunit >> Tank2 
	//repairunit이 볼 수 있는 것은 아무것도 없음 >> hitpoint와 MAX_HP 필요
	//repairunit(부모타입) >> downcasting (상위타입을 하위타입으로) >> Tank2 tank=(Tank2)repairunit;
	//Scv scv=(Scv)repairunit;
	
	//위 코드는 무엇이 올지, 어떻게 알지??
	//Tank와 Scv의 공통점 :부모가 GroundUnit >> 부모가 Unit2
	
	//CommandCenter은 Unit2가 아니다 ...
	//1. parameter 들어온 주소가 Unit2타입이냐/아니냐 구분하면 ? >> 충전방법을 두가지로 나눠서 처리 가능
	//2. 연산자 (instanceof)
	//void repair(Irepairable repairunit) >> repair(new Tank2()) : Tank2의 주소 >>> if (repairunit instanceof Unit2) ... true
	//void repair(Irepairable repairunit) >> repair(new CommanCenter()) : CommanCenter의 주소 >>> if (repairunit instanceof Unit2) ... false
	void repair(Irepairable repairunit) {
		if(repairunit instanceof Unit2) { //repairunit은 부모타입이므로, downcasting 필요
			Unit2 unit=(Unit2)repairunit; //unit : Tank2 or Scv
			if(unit.hitpoint!=unit.MAX_HP) {
				unit.hitpoint=unit.MAX_HP;
			}
		}else { //부모가 Unit2가 아니면 ...
			System.out.println("다른 충전방식을 제공합니다");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank=new Tank2();
		Marine2 marine=new Marine2();
		Scv scv=new Scv();
		
		//전투
		tank.hitpoint-=20;
		System.out.println("탱크 : "+tank.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(tank);;
		System.out.println("탱크 수리완료 : "+tank.hitpoint);
		
		scv.hitpoint-=20;
		System.out.println("scv : "+scv.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(scv);
		System.out.println("scv 수리완료 : "+scv.hitpoint);

		CommandCenter center=new CommandCenter();
		scv.repair(center);
	}
}
