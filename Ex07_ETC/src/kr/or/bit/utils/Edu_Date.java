package kr.or.bit.utils;
//���赵
//���ϰ�, ���� ����ϴ� ��� ... (static) >> ��ü ������ �ʰ� ��� ����
//�Լ� ������ (�ϳ��� �̸����� )

import java.util.Calendar;

public class Edu_Date {
	
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"+date.get(Calendar.DATE)+"��";
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
	//�䱸����
	//2020-08-26
	//1��~9�� >> 01,02,03...09
	//10~12�� >> 10,11,12
	
	
}
