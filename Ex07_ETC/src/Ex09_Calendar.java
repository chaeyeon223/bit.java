import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
* GregorianCalendar
buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
�� �ν��Ͻ��� ��ȯ�Ѵ�
GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
�׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
API : ������ Protected Calendar() 
*/
public class Ex09_Calendar {

	public static void main(String[] args) {
		 //������
		Date dt=new Date();
		System.out.println(dt.toString());
		
		//�Ź���
		//Calendar(�߻�Ŭ����) : new ��ü ���� X
		//Calendar�� �����ϰ� �ִ� 
		Calendar cal=Calendar.getInstance(); //���ο��� new��ü �����ϰ� �ּ� ����
		System.out.println(cal.toString());
		//����� �ʿ��� ������ �����ؼ� ���� ����ض�
		System.out.println("�⵵ : "+cal.get(Calendar.YEAR));
		System.out.println("�� : "+(cal.get(Calendar.MONTH)+1)); // (0~11)���� ���� +1 �ؾ���
		System.out.println("�� : "+cal.get(Calendar.DATE));
		
		System.out.println("�̴��� ��°�� : "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�̹����� ��ĥ : "+cal.get(Calendar.DAY_OF_WEEK));
		
		//�� �� �� ���
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//��������
		System.out.println(cal.get(Calendar.AM_PM));
		
		//�л���� �ý���
		//������ ���� : 200page
		//150���������� ��¥ ����...
		//ex. 2020-10-11 �ϴܿ� ��� (150������ �ȿ� ���)
		//�䱸���� ���� >> ex. 2020�� 10�� 11�� >> 150�� ���� ?!?!
		//�ѹ��� �������� 150�� ������ ��¥ �����ϱ�
		//������ Ŭ������ ���� �޼ҵ� ����
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy��MM��dd��HH��mm��");
		System.out.println(cal.getTime()); //������ Date()
		System.out.println(dateFormat.format(cal.getTime()));
		
		

	}

}
