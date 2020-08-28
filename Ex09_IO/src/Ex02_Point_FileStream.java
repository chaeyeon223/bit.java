import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 read, write 대상 >> File(믈리적인) : 1. txt, data.txt
 - FileInputStream
 - FileOutputStream
 
 */
public class Ex02_Point_FileStream {

	public static void main(String[] args) {
		FileInputStream fs=null;
		FileOutputStream fos=null;
		String path="C:\\Temp\\a.txt";

		try { //new 할때 >> 혹시모르니 예외처리 해주세요 !
			fs=new FileInputStream(path);
			fos=new FileOutputStream("C:\\Temp\\new.txt",true);
			//FileOutputStream
			//1. write하는 file이 존재하지 않으면 >> 내부적으로 file생성 기능
			//FileOutputStream("C:\\Temp\\new.txt",false); >> default : overwrite 덮어쓰기 
			//FileOutputStream("C:\\Temp\\new.txt",true); >> append 뒤에 실행횟수만큼 붙여쓰기
			
			int data=0;
			while((data=fs.read())!=-1) {
				System.out.println("정수 : "+data);
				System.out.println("문자값 : "+(char)data);
				fos.write(data);//data를 read해서 new.txt에 write하겠다 ~
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//정상적으로 수행됐든, 비정상적으로 수행됐든, 자원 해제를 해줘야함(내 작업이 끝났으면 다른사람이 쓸 수 있도록)
			//명시적 자원 해제 작업 필요 (file은 가비지 컬렉터가 관리하지 않음-메모리만 관리)
			//close() >> 소멸자 호출로 자원 해제
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
