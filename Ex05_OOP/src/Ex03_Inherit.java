//두개의 설계도
class TV{
	boolean power;
	int ch;
	
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class Vcr{
	boolean power;
	
	void power() {
		this.power=!this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {} // 되감기
	void ff()  {} // 빨리 감기
}

//TV 설계도, Vcr 설계도
//Tv+Vcr 제품 요구
//상속.포함
//class TvVcr extends TV{Vcr v;} >> 누구를 상속받는 기준 ? : 주기능/메인기능 비중이 높은 클래스를 상속하고, 나머지는 포함시키기
class TvVcr extends TV{ //일체형 : Tv가 만들어지면, Vcr도 같이 생성
	Vcr vcr;
	TvVcr(){
		vcr=new Vcr(); //Tv가 생성될 때, 같이 생성 (일체형)
		
	}
}


public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t=new TvVcr();
		t.power();
		t.power();
		t.chUp();
		System.out.println(t.power);
		System.out.println(t.ch);
		
		//비디오
		t.vcr.power();
		System.out.println(t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println(t.power);
		System.out.println(t.vcr.power);

	}

}
