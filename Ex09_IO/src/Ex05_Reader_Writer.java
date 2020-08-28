import java.io.FileReader;
import java.io.FileWriter;

/*
 문자기반의 데이터 처리 (char[])
 String 클래스 : String str="ABC"; >> 내부적으로 char[] [A][B][C]
 
 한글1자, 영문1자, 특수문자, 공백 >> 2byte >> Stream의 크기 커짐
 
 Reader, Writer 추상 클래스
 대상
 파일 : filereader / filewriter
 
 
 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("Ex01_Stream.java"); //read
			fw=new FileWriter("copy_stream.txt"); //파일생성 ... 같은 내용 write(copy)
			
			int data=0;
			while((data=fr.read())!=-1) {
				//System.out.println(data);

				if(data!='\n'&&data!='\r'&&data!='\t'&&data!=' ') {
					fw.write(data);
					//배포버전 (엔터,공백 제거) >> 압축버전 >> 크기 줄일 수 있다
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
