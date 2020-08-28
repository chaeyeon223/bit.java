import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/springbit?iframe_url=/MyCafeIntro.nhn%3Fclubid=30182179
public class Ex10_Format_Date {

	public static void main(String[] args) {
		Date curdate=new Date();
		Calendar cal=Calendar.getInstance();
		System.out.println("date : "+curdate); //날짜 형식
		System.out.println("cal : "+cal); //문자열 결합 
		System.out.println("cal getTime()함수 사용하기 !!! "+cal.getTime()); //getTime >> format
		

		
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		//사이트정보 입력
		//문자열을 날짜형식으로 변환
		String Stringdate="202008261212";
		try {
			Date stringdate=dateformat.parse(Stringdate);
			System.out.println("stringdate : "+stringdate);		
			
			long datelong=stringdate.getTime(); //
			System.out.println(datelong);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
