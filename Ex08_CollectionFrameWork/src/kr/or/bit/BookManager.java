package kr.or.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	Scanner sc=new Scanner(System.in);
	HashMap<String,Book> book_dic=new HashMap<String,Book>();
	
	public void Run() {
		int key= 0;
		while((key=selectMenu()) !=0){
		switch(key) {
		case 1:addBook();
		break;
		case 2:removeBook();
		break;
		case 3:searchBook();
		break;
		case 4:viewBook();
		break;
		case 5:viewISBN();
		break;
		default:System.out.println("잘못입력");
		break;
		}
	}
	System.out.println("시스템을 종료합니다");
	}
	//메뉴 선택
	int selectMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("1)추가  2)삭제  3)검색  4)도서목록  5)ISBN목  0)종료");
		System.out.println("------------------------------------------------");
		int key=Integer.parseInt(sc.nextLine());
		return key;
	}
	//1) 추가
	void addBook() {
		System.out.println("추가할 ISBN");
		String isbn=sc.nextLine();
		if(book_dic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN입니다");
			return; //함수 끝내기
		}
		System.out.println("추가할 책제목");
		String title=sc.nextLine();
		System.out.println("추가할 가격");
		int price=Integer.parseInt(sc.nextLine());
		Book book=new Book(isbn,title,price);  //사용자가 입력한 정보를 담은 book 생성
		book_dic.put(isbn, book);
		System.out.println("새로운 책이 추가되었습니다.");
		System.out.println(book);
	}
	//2) 삭제
	void removeBook() {
		System.out.println("삭제할 ISBN");
		String isbn=sc.nextLine();
		if(!book_dic.containsKey(isbn)) {
			System.out.println("책을 조회할 수 없습니다.");
			return; //함수 끝내기
		}
		book_dic.remove(isbn);
		System.out.println("책 삭제가 완료되었습니다.");
	}
	//3) 검색
	void searchBook() {
		System.out.println("ISBN을 검색해주세요");
		String isbn=sc.nextLine();
		if(book_dic.containsKey(isbn)) {
			Book book=book_dic.get(isbn);
			System.out.println(book);
		}else {
			System.out.println("'책을 조회할 수 없습니다.");
		}
	}
	//4) 도서목록
	void viewBook() {
		System.out.println("현재 도서 목록");
        for(Book book:book_dic.values()) {
        	System.out.println(book);
        }
}

	
	//5) ISBN
	void viewISBN() {
		System.out.println("ISBN 목록");
        for(int i=0;i<book_dic.size();i++) {
		Set bookkey=book_dic.keySet();
	    System.out.println(bookkey);
        }
	}
}
