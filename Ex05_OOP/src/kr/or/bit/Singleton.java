package kr.or.bit;
//디자인패턴 (생성패턴) >> new >> 
//객체 하나를 만들어 공유 ... 
//의도 : 하나의 객체를 공유하는 것을 보장 = 하나의 객체만 만들겠다. 
//활용 : 공유프린터 (1대로 모두가 공유), DB 연결작업
public class Singleton {
	private static Singleton p;
		private Singleton() {
			//직접 객체를 생성 불가 ... new(x) ...heap객체 생성 불가...
		}
		public static Singleton getInstance() {
			if(p==null) {
				p=new Singleton(); //heap 메모리에 Singleton객체가 올라감 >> 객체의 주소를 p가 참조
			}
			return p;
		}
}
