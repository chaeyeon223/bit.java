package kr.or.bit;

/*TV ���赵 �䱸���� ����
- ä�� ������ ������ �ִ� (1~200��)
- �귣�� �̸��� ������ �ִ� (�Ｚ / ���� ��)
- ä�� ��ȯ ����� ������ �ִ� (�� ä�ξ� �̵� ����) - ������� / ���ұ��*/

public class TV {
	public int ch; //default : 0
	public String brandname; //default : null
	
	public void ch_Up() {
		ch++;
	}
	public void ch_Down() {
		ch--;
	}
	//ä�� ����, �귣�� �̸� ��� ���
	public void tvInfo() {
		System.out.printf("TV �̸��� [%s], ���� ä���� [%d]\n",brandname,ch);
	}
}
