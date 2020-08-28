
public class Ex02_Exception {

	public static void main(String[] args) {

		int num=100;
		int result=0;
		System.out.println("main start");
		
		try {
			for (int i=0;i<10;i++) {
				result=num/(int)(Math.random()+10); //0~9
				System.out.println("result : "+result+" , i : "+i);	}		
		} catch(ArithmeticException e) { //문제가 발생되면 ... 문제에 맞는 객체가 자동으로 생성되고, 주소값을 catch에게 전달
			System.out.println("문제가 발생, 관리자에게 메일 발송");
			System.out.println("원인 "+e.getMessage());
			//catch(Exception e) >> 가독성이 떨어짐
			// catch(ArithmeticException e) >> 어떤 문제가 발생할지 적어줌 >> 가독성 좋음
		} catch(NullPointerException e) {
			//NullPointerException 은 내가 처리 ...
		} catch(Exception e) {  //여러개의 catch를 사용할 경우 >> 작은 것 먼저(ArithmeticException e) >> 큰 것 (Exception)
			//연산 예외, NullPointerException를 제외한 나머지를 처리하겠다 ...
		}

		
		System.out.println("main end");
	}

}
