package kr.or.bit;

/*사원은 사번을 가지고 있고 사번은 숫자 데이터로 관리
사원은 이름을 가지고 있고 이름은 문자열 데이터로 관리
사원은 직종을 가지고 있고 직종은 (IT, SALES), 등의 데이터로 관리
사원은 급여를 받고 급여는 숫자 데이터로 관리
사원은 신체 정보를 가지고 있고 신체정보는 키와 몸무게 데이터로 관리 >> 부품 정보*/
//신체 정보 = 하나의 타입 = 사용자(개발자)가 생성 = 클래스 생성

public class Emp {
	//고유,상태,부품 정보
	 public int empno; //default : 0
	 public String name; //default : null
	 public String job; //default : null
	 public int sal; //default : 0
	 public BodyInfo bodyinfo; //신체 정보를 담는 타입 (부품 정보)  >> default : null
}
