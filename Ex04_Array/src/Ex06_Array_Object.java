import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1. 사원 3명을 만드세요 (단, 배열을 사용하세요)
		//1000 - 홍길동
		//2000 - 김유신
		//3000 - 유관순
		//만들고 각각의 사번과 이름을 출력하세요
		
		//1
		Emp[] emp=new Emp[3];
		emp[0]=new Emp();
		emp[1]=new Emp();
		emp[2]=new Emp();
		emp[0].setEmpno(1000);
		emp[1].setEmpno(2000);
		emp[2].setEmpno(3000);
		emp[0].setName("홍길동");
		emp[1].setName("김유신");
		emp[2].setName("유관순");
		for(int i=0;i<emp.length;i++) {
			emp[i].empInfoPrint();
		}
		//2
		Emp[] emp1=new Emp[] {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		for(int i=0;i<emp1.length;i++) {
			emp1[i].empInfoPrint();
		}
		//3
		Emp[] emp2={new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		for(Emp e:emp2) {
			e.empInfoPrint();
		}
	}

}
