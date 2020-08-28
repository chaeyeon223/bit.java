package kr.or.bit;

public class Book {
	final String isbn;
	String title; //å����
	int price; //å����
	
	public Book(String isbn, String title, int price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public String ISBN() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", å����=" + title + ", ����=" + price + "]";
	}
}
