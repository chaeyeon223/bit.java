import java.io.IOException;

import kr.or.bit.ExClass;

public class Ex04_Exception {

	public static void main(String[] args) {
		try {
			ExClass ex=new ExClass("Temp)");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
