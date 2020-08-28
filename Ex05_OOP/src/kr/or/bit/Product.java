package kr.or.bit;

public class Product {
		public int price;
		public String name;
		Product(String name, int price){
			this.name=name;
			this.price=price;
		}
}


class Keyboard extends Product {
	Keyboard(){
	super("Keyboard",100);
	}
	@Override
	public String toString() {
		return "Keyboard";
	}
}

class Monitor extends Product {
	Monitor(){
	super("Monitor",200);
	}
	@Override
	public String toString() {
		return "Monitor";
	}
}

class Mouse extends Product{
	Mouse(){
	super("Mouse",300);
	}
	@Override
	public String toString() {
		return "Mouse";
	}
}

class Mainbody extends Product{
	Mainbody(){
	super("Mainbody",400);
	}
	@Override
	public String toString() {
		return "Mainbody";
	}
}

class Speaker extends Product{
	Speaker(){
	super("Speaker",500);
	}
	@Override
	public String toString() {
		return "Speaker";
	}
}