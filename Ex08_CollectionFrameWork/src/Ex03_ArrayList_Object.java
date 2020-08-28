import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		// 사원1명을 만드세요
		Emp emp=new Emp(100,"김유신","군인");
		System.out.println(emp.toString());

		//사원2명 만드세요
		Emp[] emplist= {new Emp(100,"김씨","일반"),new Emp(200,"박씨","학생")};
		for(Emp e:emplist) {
			System.out.println(e.toString());
		}
		
		//1명 추가입사 
		//arraylist
		ArrayList elist=new ArrayList();
		elist.add(new Emp(1,"강","IT"));
		elist.add(new Emp(2,"김","IT"));
		elist.add(new Emp(3,"이","IT"));
		System.out.println(elist.size());
		System.out.println(elist.get(0));
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		//toString을 사용하지말고 사원의 사번, 이름, 직종을 출력
		for(int i=0;i<elist.size();i++) {
			Object obj=elist.get(i); //Object는 Emp의 부모타입
			Emp e=(Emp)obj;
			System.out.println(e.getEmpno());
		}//좋지않은 코드..
		//Object 쓰지 않고도 객체 생성 했으면 ... >> 제너릭
		//제러닉 (객체 생성 타입 강제)
		ArrayList<Emp>list2=new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		for(Emp e : list2) {
			System.out.println(e.getEmpno());
		}
	}

}
