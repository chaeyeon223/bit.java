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
		System.out.printf("å�̸� : %s \nå���� : %d\n",name,price);
	}
	
}
