import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point
public class Ex02_ArrayList {

	public static void main(String[] args) {
		// List 인터페이스 구현 ... 순서 O / 중복 O 데이터의 집합
		
		ArrayList arraylist=new ArrayList();
		//Object 타입을 가지는 정적배열이 heap메모리에 생성된다
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println(arraylist.toString());
		System.out.println(arraylist.get(1));
		
		//add함수 : 순차적으로 데이터 넣기
		arraylist.add(0, 111); //***자리 이동***
		arraylist.add(4,444);
		System.out.println(arraylist); //toString 생략
		//**비순차적인 데이터를 추가, 삭제 >> ArrayList 적합하지 않아요 (순서를 좋아해요)
		//**순차적인 데이터의 추가, 삭제 시 유리하게 사용
		
		//remove함수 : 삭제
		//arraylist.remove(200); //index 문제 (array에러)
		
		//ArrayList 함수
		System.out.println(arraylist.contains(500)); //(값)이 arraylist안에 있니 ?
		System.out.println(arraylist.contains(444));
		
		arraylist.clear(); //데이터삭제 (공간은 남아있음)
		System.out.println(arraylist.size()); //0
		System.out.println(arraylist.isEmpty()); //비어있니 ?
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.isEmpty());
		System.out.println("삭제전 : "+arraylist.size());
		Object value=arraylist.remove(0); //0번째 방의 값을 삭제하는데, 그값을 리턴
		System.out.println("삭제된 데이터 : "+value);
		System.out.println("삭제 후 :"+arraylist.size());
		
		//POINT
		//개발자 쓰는 코드 ... 일상다반사 ... 
		//다형성 (확장성, 유연성)
		List li=new ArrayList();
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li2=li.subList(0, 3); //sublist가 만드는 데이터는 순서가 있는 데이터의 집합
		System.out.println(li2.toString());
		
		ArrayList alist=new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		Collections.sort(alist); //초보자는 절대 쓰지 말 것@! //내림차순
		System.out.println(alist.toString());
		Collections.reverse(alist); //오름차순 (내림차순 + reverse)
		
	}

}
