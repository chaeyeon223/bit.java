import java.util.Properties;

/*
 Map �������̽��� ������ Ŭ����
 Ư���� ���� : <string, string> (key,value) >> Ÿ�� ����
 <��� ����>
 - APP ��ü�� ���Ǵ� �ڿ� ����
 ex. ȯ�溯��, ���α׷� ����, ���� ���, ���뺯�� ... 
 */
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.setProperty("admin", "bit@bit.or.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//������ ���� ���������� 
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));
	}

}
