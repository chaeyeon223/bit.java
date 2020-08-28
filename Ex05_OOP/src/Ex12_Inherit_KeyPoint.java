/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
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

class Buyer1{ //구매자
	int money=1000;
	int bonuspoint;
	
	//구매 행위 : 1. 잔액 -- 2. 보너스 ++
	//**구매자는 매장에 있는 모든 물건을 구매할 수 있다
	
	
	/*
	//1차 코드 >> 물건3개 = 구매할 수 있는 함수 3개
	void KttvBuy(KtTv n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void AudioBuy(Audio n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void NoteBookBuy(NoteBook n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
}
*/
/*	
	//2차 개선 (리팩토링)
	//하나의 이름으로 여러가지 기능 = 오버로딩 parameter다르게;
	void Buy(KtTv n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void Buy(Audio n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
	void Buy(NoteBook n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
	}
}
 */
	//3차 개선
	//제품이 추가 되더라도 구매행위 계속...
	//하나의 이름 사용, 중복코드 제거...
	//모든 제품이 Product 상속 (부모)
	//Product p;
	//Audio audio;
	//p=audio;
	void Buy(Product n) { //함수가 제품 객체의 주소를 parameter로 받아서 가격, 포인트 확인
		if (this.money<n.price) {
			System.out.println("잔액이 부족합니다."+this.money);
			return ; //함수 탈출.종료 >> 구매행위 종료
		}
		this.money-=n.price;
		this.bonuspoint+=n.bonuspoint;
		System.out.println("구매한 물건은 : "+n.toString());
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
