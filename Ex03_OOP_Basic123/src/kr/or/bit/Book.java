package kr.or.bit;

public class Book {
	private String name;
	private int price;
	public Book(String a, int b) {
		name=a;
		price=b;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void output() {
		System.out.printf("책이름 : %s \n책가격 : %d\n",name,price);
	}
	
}
