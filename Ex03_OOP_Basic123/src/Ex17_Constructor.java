

class Car5{
	int window;
	String color;
	public Car5() {
		color="red";
		window=4;
	};
	public Car5(int c_window) {
		window=c_window;
		color="red";
	}
	public Car5(String c_color) {
		color=c_color;
		window=4;
	}
	public Car5(int c_window,String c_color) {
		window=c_window;
		color=c_color;
	}
	public void carInfo() {
		System.out.printf("구매하신 차량의 색상은 %s, 창문의 개수는 %d입니다.\n",color,window);
	}
}


public class Ex17_Constructor {

	public static void main(String[] args) {
		Car5 c5=new Car5();
		Car5 c6=new Car5("blue");
		Car5 c7=new Car5(3,"yellow");
		Car5 c8=new Car5(5);

		c5.carInfo();
		c6.carInfo();
		c7.carInfo();
		c8.carInfo();
		
	}

}
