import java.io.IOException;

/*
>>CD 한장 게임 설치 ... 
	1. 설치 파일 >> C:Temp >> 복사
	2. 복사한 파일 >> 프로그램 설치
	 정상 설치 : C:Temp >> 복사한 파일 삭제
	 비정상 설치  : 강제 종료 >> 복사한 파일 삭제 ... 

 */



public class Ex03_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	public static void main(String[] args) {
		//copyFiles();
		//startInstall();
		//실제로는 예외가 아니지만, 강제로 예외 발생시키기 >> 개발자가 임의로 문제를 발생시켜서 강제로 예외를 처리하는 방법
		//코드 : 예외 객체를 직접 생산 >> new 객체를 만들어서 예외 알려주기 >> throw
		//throw new IOException();
		//fileDelete();
		
		try {
			copyFiles();
			startInstall();
			throw new IOException("Install 중에 문제가 발생함"); //개발자가 임의로 예외 발생시킴
		}catch(Exception e) {
				System.out.println("예외 메시지 출력 : "+e.getMessage());
				//fileDelete(); //예외가 발생하지 않으면 실행되지 않는 함수
			}finally { //강제 실행 블럭 : 예외가 발생해도, 발생하지 않아도 실행되는 블럭
				fileDelete();
		}
		System.out.println("main end");
		//**************************************************
		//함수의 강제종료 : return이 있다 하더라도, finally 블럭은 강제로 실행됨 
	}

}
