import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 IO
 Stream(Byte)
 추상클래스
  - InputStream
  - OutputStream
 두개의 추상클래스를 구현해서 사용해라
 
 (재정의)클래스 
 대상
 1. Memory : ByteArrayInputStream / ByteArrayOutputStream
 2. File : FileInputStream / FileOutputStream
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		// byte (-128~127) 정수 저장 타입
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null; //현재 메모리를 갖고있지 않다 (초기화 X)
		
		//데이터를 read, write하는 대상을 memory로 하고싶으면 ... ByteArrayInputStream / ByteArrayOutputStream
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		input=new ByteArrayInputStream(inSrc); //inSrc로부터 데이터를 read하겠다 ~~~
		output=new ByteArrayOutputStream(); //write할 수 있는 stream 생성
		
		System.out.println("outSrc before : "+Arrays.toString(outSrc));
		
		//공식같은 로직
		int data = 0;
		while((data=input.read())!=-1) { //더이상 read할 데이터가 없으면 -1 return
			System.out.println(data);
			//System.out.println("read"+input.read());
			//read()함수는 내부적으로 next() 포함 >> data에 담아놓아야 됨
			output.write(data);//output stream안에 데이터를 갖고있음
			//write의 대상은 data가 아니고  ByteArrayOutputStream 자신의 통로에 data 갖고있음
		}
		outSrc=output.toByteArray();//byte 배열의 주소값 리턴
		System.out.println("outSrc after : "+Arrays.toString(outSrc));
	}
}
