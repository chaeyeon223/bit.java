//게임 : unit(유닛)
//unit : 공통기능 (이동좌표, 이동, 멈춘다) : 추상화, 일반화
//unit : 이동방법은 다르다 (이동방법 unit마다 별도의 구현 필요 ... 강제성)
//abstract class 이름 { abstract 이동(); }


abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	//이동 (강제)
	abstract void move(int x, int y); //추상자원
}
//Tank
class Tank extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank 이동"+this.x+","+this.y);
	}
	//Tank만의 구체화, 특수화된 기능
	void changeMode() {
		System.out.println("탱크 변환모드");
	}
}

//사람
class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Marine 이동"+this.x+","+this.y);
	}
	//Marine만의 구체화, 특수화 기능
	void stimpack() {
		System.out.println("스팀팩 기능");
	}
}

//수송기
class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Dropship 이동 : "+this.x+","+this.y);
	}
	//특수화, 구체화
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
		
		//1. Tank 3대를 만들고, 같은 좌표로 이동시키기 (555,444)
		Tank [] tankarr= {new Tank(), new Tank(), new Tank()};
		for(int i=0;i<tankarr.length;i++) {
			tankarr[i].move(555, 444);
		}
		//2. 여러개의 Unit (Tank 1대, Marine 1마리, Dropship 1대) 같은 좌표로 이동시키기 (666,444)
		Unit[] uniarr=new Unit[] {new Tank(),new Marine(), new Dropship()};
		for(int i=0;i<uniarr.length;i++) {
			uniarr[i].move(666, 444);
			//for (Unit unit:uniarr){
			// unit.move(666,444);
			//}
		}
	}

}
