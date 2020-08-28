import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 File ó�� (Disk) : �� Byte����  read. write
 ��Ƹ�Ƽ� �ѹ��� read,write �ϰ������ >> ���� �������� ������ �ѹ��� �¿��� ...
 ���� : Buffer
 1. I/O ���ɰ���
 2. Line���� (����) 
 
 BufferedInputStream ���� (��Ŭ���� ����)
 �����ڸ� ���ؼ� ���� ... 
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("data.txt"); //������ ������ �ڵ����� ���� ��������
			bos=new BufferedOutputStream(fos); 
			
			for(int i=0;i<10;i++) {
				bos.write('A'); //10���� A�� data.txt�� write
			}
			
			//JAVA Bufferũ�� : 8kbyte : 8192byte
			//1. buffer�ȿ� ������ ä������ ������ ���� �۾� : ����������  flush�۾�
			//2. buffer ������ ����  >> flush() ȣ��  or close()
			//3. bos.close() �ڿ����� >> close() >> ���������� flush()ȣ��
			//bos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
