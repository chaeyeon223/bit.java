import java.util.Vector;

/*
 Collection Framework
 '다수의 데이터'를 다루는 '표준화된 인터페이스'를 '구현하고 있는 클래스집합'
 
 Collection 인터페이스 
 1. List (상속) - ArrayList (구현)  
 2. Set (상속) - HashSet, TreeSet (구현)
 3. Map (Key,Value) - HashMap (구현)
 
 1. List (대기줄 서기) : 순서 O / 중복 O >> 내부적으로 데이터(자료,객체)들을 '배열로 관리' >> [홍길동][홍길동][홍길동] 구분 가능
 	1.1 Vector (구버전) - 동기화 보장 (멀티 스레드 환경에서) >> Lock 장치를 통한 데이터 보호 >> 성능 떨어짐 / 안정성 보장 ex. 한강 화장실
 	1.2 ArrayList (신버전) - 동기화 보장 (멀티 스레드 환경) >> Lock 장치 (X) - 필요에 따라 만들 수는 있음 >> 성능 보장(우선) ex. 비빔밥
 	- 기존, 여러개의 같은 타입 데이터 관리 : Array (정적/고정 배열) >> 방의 개수 변경 X
 	<Array>
 		1. 배열의 크기가 고정 : Car[] cars={new Car[],new Car[]}; //방 2개
 		2. 접근 방법 (index 첨자) 방번호 접근 : cars[0],,, : 0부터 ~ n번방 >> 마지막 방의 번호(index)는 length-1
 		3. 초기 설정 변경 불가 		
 	<Vector / ArrayList>
 		1. 배열의 크기를 동적으로 확장(축소) 가능 >> 사실은 배열의 재할당 이용 
 		2. 순서 유지(배열 사용), 중복 허용
 		3. 데이터의 저장 공간으로 Array 사용 
 2. Set (




 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println("초기 default 용량 : "+v.capacity());//default 크기 : 10개
		System.out.println("size : "+v.size()); //=array.length 
		v.add("AA");
		v.add("AA");
		v.add(100);
		System.out.println("size : "+v.size()); 
		System.out.println(v.toString()); //toString 재정의
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i)); //get(index) : 값 리턴 = arr[index]
		}
		for(Object obj:v) {
			System.out.println(obj);
		}

		
		Vector v3=new Vector();
		System.out.println(v3.capacity()); //10개
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");//11번째 >> 방 늘리기 >> 2배로 방 늘린다
		System.out.println(v3.capacity()); //데이터를 담을 수 있는 크기
		System.out.println(v3.size()); //데이터가 들어있는 크기
	}

}
