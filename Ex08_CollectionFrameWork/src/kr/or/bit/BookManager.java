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
		default:System.out.println("�߸��Է�");
		break;
		}
	}
	System.out.println("�ý����� �����մϴ�");
	}
	//�޴� ����
	int selectMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("1)�߰�  2)����  3)�˻�  4)�������  5)ISBN��  0)����");
		System.out.println("------------------------------------------------");
		int key=Integer.parseInt(sc.nextLine());
		return key;
	}
	//1) �߰�
	void addBook() {
		System.out.println("�߰��� ISBN");
		String isbn=sc.nextLine();
		if(book_dic.containsKey(isbn)) {
			System.out.println("�̹� �����ϴ� ISBN�Դϴ�");
			return; //�Լ� ������
		}
		System.out.println("�߰��� å����");
		String title=sc.nextLine();
		System.out.println("�߰��� ����");
		int price=Integer.parseInt(sc.nextLine());
		Book book=new Book(isbn,title,price);  //����ڰ� �Է��� ������ ���� book ����
		book_dic.put(isbn, book);
		System.out.println("���ο� å�� �߰��Ǿ����ϴ�.");
		System.out.println(book);
	}
	//2) ����
	void removeBook() {
		System.out.println("������ ISBN");
		String isbn=sc.nextLine();
		if(!book_dic.containsKey(isbn)) {
			System.out.println("å�� ��ȸ�� �� �����ϴ�.");
			return; //�Լ� ������
		}
		book_dic.remove(isbn);
		System.out.println("å ������ �Ϸ�Ǿ����ϴ�.");
	}
	//3) �˻�
	void searchBook() {
		System.out.println("ISBN�� �˻����ּ���");
		String isbn=sc.nextLine();
		if(book_dic.containsKey(isbn)) {
			Book book=book_dic.get(isbn);
			System.out.println(book);
		}else {
			System.out.println("'å�� ��ȸ�� �� �����ϴ�.");
		}
	}
	//4) �������
	void viewBook() {
		System.out.println("���� ���� ���");
        for(Book book:book_dic.values()) {
        	System.out.println(book);
        }
}

	
	//5) ISBN
	void viewISBN() {
		System.out.println("ISBN ���");
        for(int i=0;i<book_dic.size();i++) {
		Set bookkey=book_dic.keySet();
	    System.out.println(bookkey);
        }
	}
}
