import kr.or.bit.Pclass;

/*
 public, private, default, '상속관계'에서 protected
 protected: 양면성 (박쥐) >> default / public 
 1.  상속이 없는 클래스 안에서 protected : default의 기능
 2.  상속관계에서만 의미를 가진다.
 */

class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k; //=default >>일반 클래스에서는 protected사용할 이유가 없음
}
class Child2 extends Pclass{
	void method() {
		this.j=10;
		this.k=1000; //상속관계에서 자식은 부모의 protected 자원에 접근 가능 (public처럼 사용 가능)
		System.out.println(this.k);
		
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p=new Pclass();
		p.j=500;
		System.out.println(p.j); // (다른패키지) p클래스의 public 변수만 접근 가능
		
		Child2 ch=new Child2();
		ch.method();
	}

}
