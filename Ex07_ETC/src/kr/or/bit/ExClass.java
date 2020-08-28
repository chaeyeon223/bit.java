package kr.or.bit;

import java.io.IOException;

/*
 설계도 (class) ... 문제 발생 ?!
 내 설계도를 사용하는 개발자가 예외를 강제로 처리 ... 안전 ...(미리 방지)
 
 생성자, 함수 만들때 강제로 예외 처리
 
 */



public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException {
		System.out.println(path);
	}
}
