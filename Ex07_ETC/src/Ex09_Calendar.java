import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
* GregorianCalendar
buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
의 인스턴스를 반환한다
GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
API : 생성자 Protected Calendar() 
*/
public class Ex09_Calendar {

	public static void main(String[] args) {
		 //구버전
		Date dt=new Date();
		System.out.println(dt.toString());
		
		//신버전
		//Calendar(추상클래스) : new 객체 생성 X
		//Calendar를 구현하고 있는 
		Calendar cal=Calendar.getInstance(); //내부에서 new객체 생성하고 주소 리턴
		System.out.println(cal.toString());
		//당신이 필요한 형식을 추출해서 조합 사용해라
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); // (0~11)월로 설정 +1 해야함
		System.out.println("일 : "+cal.get(Calendar.DATE));
		
		System.out.println("이달의 몇째주 : "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번주의 며칠 : "+cal.get(Calendar.DAY_OF_WEEK));
		
		//시 분 초 출력
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//오전오후
		System.out.println(cal.get(Calendar.AM_PM));
		
		//학사관리 시스템
		//페이지 본수 : 200page
		//150페이지에는 날짜 정보...
		//ex. 2020-10-11 하단에 출력 (150페이지 안에 모두)
		//요구사항 변경 >> ex. 2020월 10월 11일 >> 150번 수정 ?!?!
		//한번의 수정으로 150개 페이지 날짜 변경하기
		//별도의 클래스로 빼서 메소드 생성
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
		System.out.println(cal.getTime()); //구버전 Date()
		System.out.println(dateFormat.format(cal.getTime()));
		
		

	}

}
