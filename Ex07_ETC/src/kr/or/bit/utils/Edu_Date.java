package kr.or.bit.utils;
//설계도
//편하게, 많이 사용하는 기능 ... (static) >> 객체 만들지 않고도 사용 가능
//함수 여러개 (하나의 이름으로 )

import java.util.Calendar;

public class Edu_Date {
	
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
	}
	
	public static String DateString(Calendar date,String opr) {
		return date.get(Calendar.YEAR)+opr+(date.get(Calendar.MONTH)+1)+opr+date.get(Calendar.DATE);
	}
	
	public static String monthFormat_DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH)+1)<10) {
				month = "0"+(date.get(Calendar.MONTH)+1);
		}else {
				month= String.valueOf((date.get(Calendar.MONTH)+1));
		}
		return month;
	}
	//요구사항
	//2020-08-26
	//1월~9월 >> 01,02,03...09
	//10~12월 >> 10,11,12
	
	
}
