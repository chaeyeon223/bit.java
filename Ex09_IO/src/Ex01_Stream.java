import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 IO
 Stream(Byte)
 �߻�Ŭ����
  - InputStream
  - OutputStream
 �ΰ��� �߻�Ŭ������ �����ؼ� ����ض�
 
 (������)Ŭ���� 
 ���
 1. Memory : ByteArrayInputStream / ByteArrayOutputStream
 2. File : FileInputStream / FileOutputStream
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		// byte (-128~127) ���� ���� Ÿ��
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null; //���� �޸𸮸� �������� �ʴ� (�ʱ�ȭ X)
		
		//�����͸� read, write�ϴ� ����� memory�� �ϰ������ ... ByteArrayInputStream / ByteArrayOutputStream
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		input=new ByteArrayInputStream(inSrc); //inSrc�κ��� �����͸� read�ϰڴ� ~~~
		output=new ByteArrayOutputStream(); //write�� �� �ִ� stream ����
		
		System.out.println("outSrc before : "+Arrays.toString(outSrc));
		
		//���İ��� ����
		int data = 0;
		while((data=input.read())!=-1) { //���̻� read�� �����Ͱ� ������ -1 return
			System.out.println(data);
			//System.out.println("read"+input.read());
			//read()�Լ��� ���������� next() ���� >> data�� ��Ƴ��ƾ� ��
			output.write(data);//output stream�ȿ� �����͸� ��������
			//write�� ����� data�� �ƴϰ�  ByteArrayOutputStream �ڽ��� ��ο� data ��������
		}
		outSrc=output.toByteArray();//byte �迭�� �ּҰ� ����
		System.out.println("outSrc after : "+Arrays.toString(outSrc));
	}
}
