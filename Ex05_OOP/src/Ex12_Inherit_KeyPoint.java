/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/
class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(this.price/10.0);
	}
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer1{ //������
	int money=1000;
	int bonuspoint;
	
	//���� ���� : 1. �ܾ� -- 2. ���ʽ� ++
	//**�����ڴ� ���忡 �ִ� ��� ������ ������ �� �ִ�
	
	
	/*
	//1�� �ڵ� >> ����3�� = ������ �� �ִ� �Լ� 3��
	void KttvBuy(KtTv n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
	void AudioBuy(Audio n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
	void NoteBookBuy(NoteBook n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
}
*/
/*	
	//2�� ���� (�����丵)
	//�ϳ��� �̸����� �������� ��� = �����ε� parameter�ٸ���;
	void Buy(KtTv n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
	void Buy(Audio n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
	void Buy(NoteBook n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
}
 */
	//3�� ����
	//��ǰ�� �߰� �Ǵ��� �������� ���...
	//�ϳ��� �̸� ���, �ߺ��ڵ� ����...
	//��� ��ǰ�� Product ��� (�θ�)
	//Product p;
	//Audio audio;
	//p=audio;
	void Buy(Product n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾Ƽ� ����, ����Ʈ Ȯ��
		if (this.money<n.price) {
			System.out.println("�ܾ��� �����մϴ�."+this.money);
			return ; //�Լ� Ż��.���� >> �������� ����
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("������ ������ : "+n.toString());
	}
}
public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv tv=new KtTv();
		Audio audio =new Audio();
		NoteBook notebook=new NoteBook();
		

		Buyer1 buyer = new Buyer1();
		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
	}

}
