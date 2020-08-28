import kr.or.bit.Book;

public class Book_ex {

	public static void main(String[] args) {
		Book b=new Book("자바의 정석",50000);
	//	System.out.println(b.getName());
	//	System.out.println(b.getPrice());
		b.output();
		Book b2=new Book("이것이 자바다", 30000);
		b2.output();
		
	}
}
