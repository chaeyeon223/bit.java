//�ΰ��� ���赵
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
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {} // �ǰ���
	void ff()  {} // ���� ����
}

//TV ���赵, Vcr ���赵
//Tv+Vcr ��ǰ �䱸
//���.����
//class TvVcr extends TV{Vcr v;} >> ������ ��ӹ޴� ���� ? : �ֱ��/���α�� ������ ���� Ŭ������ ����ϰ�, �������� ���Խ�Ű��
class TvVcr extends TV{ //��ü�� : Tv�� ���������, Vcr�� ���� ����
	Vcr vcr;
	TvVcr(){
		vcr=new Vcr(); //Tv�� ������ ��, ���� ���� (��ü��)
		
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
		
		//����
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
