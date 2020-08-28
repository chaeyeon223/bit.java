import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.TV;

public class Ex01_ref_type {

	public static void main(String[] args) {
		//값 타입 (8가지 기본 타입)
		//참조 타입 (클래스, 배열 ...) >> 
		Person p3; //선언 : stack 이라는 영역에 공간만 확보 (공간의 크기는 주소를 담을 수 있는 4byte의 빈공간)
		p3=new Person(); //p3라는 변수에 Person객체의 주소 할당 >> heap영역에 메모리
		
		Person p4=null; //main 함수 안에 있는 local variable 이기 때문에 >> 초기화 필요
								// 참조변수의 초기화는 null : 값이 없다, 메모리를 가지고 있지 않다
		
		//**참조변수가 메모리를 가지는 방법
		//1. new 사용 (새로운 사람 정보 주기 ) >> p4=new Person();
		//2. 주소값 할당 (기존 사람의 정보 주기 ) >>p4=p3;
		p4=p3;
		
		Person p=new Person();
		p.name="홍길동";
		p.age=10;
		p.power=true;
		p.personPrint();
		
		Person p2=new Person();
		p2.personPrint();

		//주소값 비교
		System.out.println(p==p2); //변수가 갖고 있는 값 비교 (주소값 비교)
		System.out.println(p3==p4); //true
		
		//TV 생산
		TV tv=new TV();
		tv.brandname="비트";
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.tvInfo();
		
		//사원 1명 생성
		Emp emp=new Emp(); //stack 영역에 'emp' - heap 영역에 'Emp객체' >> xx주소 할당
		emp.empno=7788;
		emp.name="김유신";
		emp.job="IT";
		
		BodyInfo body=new BodyInfo(); //stack 영역에 'body' - heap 영역에 'BodyInfo객체' >> yy주소 할당
		body.height=190;
		body.weight=40;
		
		emp.bodyinfo=body; //emp.heap 영역에 bodyinfo에 body 주소 yy를 할당 => emp.bodyinfo.height
		//=>emp.bodyinfo=new BodyInfo(); >> stack 영역에 body 변수 따로 생성 x : heap 영역에만 BodyInfo 객체 생성 (객체 생성 시 항상 주소는 할당)
		
		System.out.println(emp.empno+"/"+emp.bodyinfo.height);
		System.out.println(emp.name+"/"+emp.bodyinfo.weight);
	}

}

