package kr.or.bit;

public class Book {
	final String isbn;
	String title; //책제목
	int price; //책가격
	
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
		return "Book [ISBN=" + isbn + ", 책제목=" + title + ", 가격=" + price + "]";
	}
}
