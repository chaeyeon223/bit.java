package kr.or.bit;

/*TV 설계도 요구사항 정의
- 채널 정보를 가지고 있다 (1~200값)
- 브랜드 이름을 가지고 있다 (삼성 / 엘지 등)
- 채널 전환 기능을 가지고 있다 (한 채널씩 이동 가능) - 증가기능 / 감소기능*/

public class TV {
	public int ch; //default : 0
	public String brandname; //default : null
	
	public void ch_Up() {
		ch++;
	}
	public void ch_Down() {
		ch--;
	}
	//채널 정보, 브랜드 이름 출력 기능
	public void tvInfo() {
		System.out.printf("TV 이름은 [%s], 현재 채널은 [%d]\n",brandname,ch);
	}
}
