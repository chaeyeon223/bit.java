import kr.or.bit.Book;

public class Book_ex {

	public static void main(String[] args) {
		Book b=new Book("�ڹ��� ����",50000);
	//	System.out.println(b.getName());
	//	System.out.println(b.getPrice());
		b.output();
		Book b2=new Book("�̰��� �ڹٴ�", 30000);
		b2.output();
		
	}
}
