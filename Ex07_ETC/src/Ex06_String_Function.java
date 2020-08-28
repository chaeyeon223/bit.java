import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str="hello";
		String concatstr=str.concat(" world"); //기존 문자열 + 새로운 문자열 = 문자열 리턴
		System.out.println(concatstr);
		
		boolean bo=str.contains("oell"); //입력값이 문자열에 있는지 (순서대로) 확인 = boolean 리턴
		System.out.println(bo);
		
		String str2="a b c d"; //[a][ ][b][ ][c][ ][d]
		System.out.println(str2.length()); //빈문자도 문자
		
		String filename="hello java world";//[h][e][l][l][o][ ][j][a][v][a] ...
		System.out.println(filename.indexOf("h")); //index위치 출력
		System.out.println(filename.indexOf("java"));//단어의 시작 위치
		System.out.println(filename.indexOf("폭망"));// '-1' : 배열 방이 없다는 뜻 **
		//원하는 문자열이 포함되어 있는지 확인 조건 ... 0보다 크다면, 무조건  1개는 포함
		if (filename.indexOf("wo")>0) { //= filename.indexOf("kim")!= -1 
			System.out.println("wo을 하나라도 가지고 있네요");
		}
		
		System.out.println(filename.lastIndexOf("a")); //끝에서 처음만나는 a를 찾아라 **뒤에서부터 0부터 시작 X !! 무조건 앞에서부터 세기
		 
		//length(), indexOf(), substring(), replace(), split() ...
		String result="superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(5));
		System.out.println(result.substring(0,5)); //beginindex : 포함 / endindex : 미포함 (endindex -1)
		System.out.println(result.substring(5,6)); //자기 자신
		System.out.println(result.substring(0,0)); // = (0,-1) 안나옴
		
		//Quiz.
		String filename2="aaaa.zip"; //또는 hong.png 또는 h.jpeg 
		//여기서 파일명과 확장자를 분리해서 출력하기
		//1. 파일명 >> aaaa
		//2. 확장자 >> zip
		int indexnum=filename2.indexOf(".");
		System.out.println("파일명 : "+filename2.substring(0,indexnum));
		System.out.println("확장자 : "+filename2.substring(indexnum+1));
		
		//replace (치환.변환)
		String str3="ABCDADDDDD";
		String result3=str3.replace("DDDDD","오늘은 목요일");
		System.out.println(result3);
		result3=str3.replace("D","d");
		System.out.println(result3);
		
		//split
		//String str4="슈퍼맨,팬티,노랑색,우하하,우하하";
		//String[] namearray=str4.split(",");
		String str4="슈퍼맨.팬티.노랑색.우하하.우하하";
		String[] namearray=str4.split("\\."); 	// "." : 정규표현식 문자  >> 문자 그대로 \. >> 이것도 정규표현식 문자 >> \\.라고 표현해야함
		for(String s:namearray) {
			System.out.println(s);
		}
		/*
		 정규표현식 표준 (java, c# , javascript, oracle) 공통적인 규칙
		 어떠한 문자를 만들때, 규칙을 부여 >> 유효한 판단의 근거
		 Ex.주민등록번호 (숫자6자리  + '-' + 숫자7자리)
		 
		 조별과제 : 사이트에서 찾되, 조건 해석 !! 5개
		 (위키피아)
		*/
		
		//Quiz. split사용해서 파일명과 확장자 분리
		String filename3="bit.hwp";
		String[] file=filename3.split("\\.");
		System.out.println("파일명 : "+file[0]);
		System.out.println("확장자 : "+file[1]);
		
		//?????
		String str5="a/b,c-d.f";
		StringTokenizer sto=new StringTokenizer(str5,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//ETC
		System.out.println(str3.charAt(5)); //입력값(숫자)에 따른 char값 한글자
		System.out.println(str3.endsWith("DDDA")); //접미사 비교 true/false
		System.out.println(str3.endsWith("DDD"));
		System.out.println(str3.equalsIgnoreCase("abcdADDddd")); //대소문자 구별 true/false
		
		//넌센스
		String str6="홍      길    동";
		//저장시 : 공백 제거하고 싶으면 ...
		System.out.println(str6);
		System.out.println(str6.replace(" ", ""));
		
		String str7="              홍길동                ";
		System.out.println(">"+str7+"<");
		System.out.println(">"+str7.trim()+"<"); //trim() : 앞뒤 공백 제거 함수 
		
		String str8="            홍      길    동           ";
		//***여러개의 함수 적용 (method chain 기법)***
		System.out.println(str8.trim().replace(" ", ""));
		
		
		
		//Quiz-2
		   String jumin="123456-1234567";
		   //위 주민번호의 합을 구하세요_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum2+= Integer.parseInt(numstr);
		   } 
		   System.out.println("주민번호 합:" + sum2);
		   
		 //위 주민번호의 합을 구하세요_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("주민번호 합2:" + sum3);
		   
		 //위 주민번호의 합을 구하세요_3
		   String jumin4 = jumin.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("주민번호 합4:" + sum4);

	}

}
