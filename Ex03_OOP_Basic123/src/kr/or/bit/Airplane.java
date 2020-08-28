package kr.or.bit;

/*우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 작성 하려고 합니다
<요구사항>
1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다
2.비행기가 생산되면 비행기의 이름과 번호 맞게 부여되었는 확인 하는 작업이 필요합니다 (출력정보 확인)
3.공장장은 현재까지 만들어진 비행기의 총대수 (누적)을 확인 할 수 있습니다

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();*/


public class Airplane {
	private int number;
	private  String name;
	private static int totalcount;
	
	//생성자함수
	public Airplane(String name, int number) {
		this.number=number;
		this.name=name;
		totalcount++;
		System.out.printf("비행기 이름 : %s \t 비행기 번호 : %d",this.name,this.number);
		System.out.println("\n총 대수 :"+totalcount);
	}
	
	/*
	public void makePlane(int number,String name) {
		this.number=number;
		this.name=name;
		//강제 
		totalcount++;
		System.out.printf("비행기 이름 : %s \t 비행기 번호 : %d",name,number);
		System.out.println("\n총 대수 :"+totalcount);
	}
	*/

	 
	 
}
