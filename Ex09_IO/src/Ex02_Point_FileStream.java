import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 read, write ��� >> File(�ɸ�����) : 1. txt, data.txt
 - FileInputStream
 - FileOutputStream
 
 */
public class Ex02_Point_FileStream {

	public static void main(String[] args) {
		FileInputStream fs=null;
		FileOutputStream fos=null;
		String path="C:\\Temp\\a.txt";

		try { //new �Ҷ� >> Ȥ�ø𸣴� ����ó�� ���ּ��� !
			fs=new FileInputStream(path);
			fos=new FileOutputStream("C:\\Temp\\new.txt",true);
			//FileOutputStream
			//1. write�ϴ� file�� �������� ������ >> ���������� file���� ���
			//FileOutputStream("C:\\Temp\\new.txt",false); >> default : overwrite ����� 
			//FileOutputStream("C:\\Temp\\new.txt",true); >> append �ڿ� ����Ƚ����ŭ �ٿ�����
			
			int data=0;
			while((data=fs.read())!=-1) {
				System.out.println("���� : "+data);
				System.out.println("���ڰ� : "+(char)data);
				fos.write(data);//data�� read�ؼ� new.txt�� write�ϰڴ� ~
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//���������� ����Ƶ�, ������������ ����Ƶ�, �ڿ� ������ �������(�� �۾��� �������� �ٸ������ �� �� �ֵ���)
			//����� �ڿ� ���� �۾� �ʿ� (file�� ������ �÷��Ͱ� �������� ����-�޸𸮸� ����)
			//close() >> �Ҹ��� ȣ��� �ڿ� ����
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
