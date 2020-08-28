package kr.or.bit;

public class NoteBook {
	public String color;
	//public int year;
	private int year; 
	//캡슐화, 은닉화 : 직접 할당을 막고 간접 할당을 통해서 보호 (개발자가 원하는 값만 처리)
	//간접 할당
	//public int year >>음수값 입력 >>NoteBook notebook=new NoteBook();  -   notebook.year=-2000;
	
	//마우스를 가지고 있다
	//마우스 : 여러개의 속성과 기능 >> 별도의 class 필요
	public Mouse handle(Mouse m) { //Mouse 타입의 주소값
		m.x=100;
		m.y=200;
		return m;
	}
	//캡슐화 된 member field에 대해서 write / read (set / get)  할 수 있는 전용 함수
	//=> setter / getter 함수
	public void setYear(int y) {
		if (y<0) {

			this.year=1999;
		}else {
			year=y;
		}
	}
	public int getYear() {
		return year;
	}
}
