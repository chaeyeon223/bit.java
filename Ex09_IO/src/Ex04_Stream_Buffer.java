import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 File 처리 (Disk) : 한 Byte단위  read. write
 모아모아서 한번에 read,write 하고싶으면 >> 각자 가지말고 버스에 한번에 태워서 ...
 버스 : Buffer
 1. I/O 성능개선
 2. Line단위 (엔터) 
 
 BufferedInputStream 보조 (주클래스 의존)
 생성자를 통해서 강제 ... 
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("data.txt"); //파일이 없으면 자동으로 파일 생성해줌
			bos=new BufferedOutputStream(fos); 
			
			for(int i=0;i<10;i++) {
				bos.write('A'); //10개의 A를 data.txt에 write
			}
			
			//JAVA Buffer크기 : 8kbyte : 8192byte
			//1. buffer안에 내용이 채워지면 스스로 비우는 작업 : 내부적으로  flush작업
			//2. buffer 강제로 비우기  >> flush() 호출  or close()
			//3. bos.close() 자원해제 >> close() >> 내부적으로 flush()호출
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
