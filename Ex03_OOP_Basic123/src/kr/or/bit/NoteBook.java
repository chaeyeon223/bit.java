package kr.or.bit;

public class NoteBook {
	public String color;
	//public int year;
	private int year; 
	//ĸ��ȭ, ����ȭ : ���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� ��ȣ (�����ڰ� ���ϴ� ���� ó��)
	//���� �Ҵ�
	//public int year >>������ �Է� >>NoteBook notebook=new NoteBook();  -   notebook.year=-2000;
	
	//���콺�� ������ �ִ�
	//���콺 : �������� �Ӽ��� ��� >> ������ class �ʿ�
	public Mouse handle(Mouse m) { //Mouse Ÿ���� �ּҰ�
		m.x=100;
		m.y=200;
		return m;
	}
	//ĸ��ȭ �� member field�� ���ؼ� write / read (set / get)  �� �� �ִ� ���� �Լ�
	//=> setter / getter �Լ�
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
