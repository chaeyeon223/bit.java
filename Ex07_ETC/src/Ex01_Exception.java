/*
 컴파일 에러 / 런타임 에러
런타임 에러 : 에러 (처리할 수 없는 심각한 오류) / 예외 (처리할 수 있는 다소 미약한 오류)
>> 프로그램의 비정상 종류를 막고, 정상적인 실행상태를 유지하는 것 : 혹시나 발생할 수 있는 문제에 대해 방지할 뿐, 오류를 고치는 것은 아님 (고쳐야 될 코드)

 오류
	1. 에러(error) : 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결 불가
	2. 예외(exception) : 개발자의 코드 실수에 의해 발생 >> 최종 : 코드 수정 필요  >> 일단 방어책
	>> 예외가 발생하면 ... 프로그램은 강제 종료됨
	3. 예외처리 : 문제가 생길 수 있는 코드에 안전장치 마련하는 것 >> 문제가 발생하더라도, 강제 종료 X >> 일단 진행
	>> 비정상적인 종료를 막는 것
	4. try{
			>>문제가 발생할 수 있는 코드 (의심되는 코드)
	}catch(Exception e) {
			>>문제가 생기면 catch로 잡고, 잡은 문제를 파악
				1. 관리자에게 email
				2. 로그파일에 문제 기록
				3. 강제 종료는 일단 막는다
				> 최종적으로 개발자가 해결해야함 (코드 고쳐야 됨)
	{finally{
			>> 문제가 발생하든, 발생하지 않든 강제로 수행되어야 할 코드
			>> ex) DB 연결 해제하기 ...
	}
*/
public class Ex01_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0); //연산 문제 >> 문제가 발생하더라도 프로그램이 강제 종료되지 않았으면 ...>> '예외 처리'
			//문제가 발생하면 >> 그 문제를 담을 수 있는 객체가 자동 생성 >> 컴파일러가 문제에 맞는 객체를 new로 생성 (java.lang.ArithmeticException)
			//발생한 문제의 정보를 ArithmeticException에 전달 ...
			
		}catch(Exception e) { //예외에 대한 수습 하는 곳 >> 고치는 것이 아닌, 문제에 대한 정보를 알려주는 곳
			//무슨 문제가 발생했고, 원인은 무엇인지 확인
			e.printStackTrace();
			System.out.println("catch : "+e.getMessage());
		}
		System.out.println("main end");

	}

}
