/*
실무(개발환경)
1개의 클래스로 개발 불가 = 설계도 1개로 개발 불가 (업무가 복잡하기 때문)
Ex.쇼핑몰 : 주문관리, 회원관리, 배송, 상품 ,,, >>각각의 업무 설계도 제작

*** 기준 ***
여러개의 설계도의 관계 맺어주는 것
1. 상속 (is ~a : 상속) = ~은 ~이다 (부모를 뒤에)
2. 포함 (has ~a : 포함) = ~은 ~을 가지고 있다
ex. 원은 도형이다 >> 원  extends 도형
ex. 경찰은 권총을 가지고 있다 >> class 경찰 { 권총 }
ex. 원은 점을 가지고 있다 >> class 원 { 점 }
ex. 원, 삼각형, 사각형 만들기 설계도

	원은 도형이다
	삼각형은 도형이다
	사각형은 도형이다
	
	도형 : 추상화, 일반화(그리다, 색상) >> 공통자원 만들기
	원 : 구체화, 특수화 (반지름, 한 점) >> 본인만이 가지는 특징
	
	점 : 좌표값 (x,y)
	원은 점을 가지고 있다
	삼각형은 점을 가지고 있다
	사각형은 점을 가지고 있다
	
	class Shape{ 그리다, 색상 } >> 상속관계 (부모)
	class Point{ 좌표값 } >> 포함관계(부품)
	
	구체화, 특수화 : circle, triangle
 */

//추상화, 일반화, 공통
class Shape{
	String color="gold"; //공통속성
	void draw() {
		System.out.println("도형을 그리다");
	}
}
//공통 (점)
class Point{
	int x;
	int y;
	
	Point(){
		//this.x=1;
		//this.y=1;
		this(1,1);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

//원을 만드세요 (원의 정의 : 원은 한점과 반지름을 가지고 있다)
//1. 원은 도형이다 (is~a) : 도형(shape)
//2. 원은 점을 갖고있다 (has~a) : 점(point)
//3. 원은 반지름을 갖고있다 (특수성) : r
//원의 반지름은 초기값 : 10
//점의 좌표는 초기값 : (10,15)
//기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다 (원이 만들어질 때)
class Circle extends Shape{ //상속
	Point point; //포함
	int r; //특수성
	
	Circle(){
		this(10,new Point(10,15));
	}
	Circle(int r, Point point){
		this.r=r;
		this.point=point;
	}
}
//Quiz. 삼각형 만들기
class Triangle extends Shape{
	Point [] pointarr;
	
	Triangle(){
		this(new Point[]{new Point(1,1),new Point(2,2),new Point(3,3)});
	}
	Triangle(Point[] pointarr){
		this.pointarr=pointarr;
	}
	void trianglePoint() {
		for(Point point:this.pointarr) {
			System.out.printf("point : (%d,%d)\t\n",point.x,point.y);
		}
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println("도형 색상:"+circle.color);
		System.out.println("도형 반지름:"+circle.r);
		System.out.println("도형 x좌표:"+circle.point.x);
		System.out.println("도형 y좌표:"+circle.point.y);
		circle.draw();
		System.out.println("***********");
		Circle circle2=new Circle(20,new Point(10,20));
		System.out.println("도형 색상:"+circle2.color);
		System.out.println("도형 반지름:"+circle2.r);
		System.out.println("도형 x좌표:"+circle2.point.x);
		System.out.println("도형 y좌표:"+circle2.point.y);
		circle2.draw();
		/*
		System.out.println("***********");
		Triangle triangle=new Triangle(new Point(10,20),new Point(30,40),new Point(50,60));
		triangle.draw();
		System.out.println("삼각형의 색상 : "+triangle.color);
		System.out.printf("삼각형의 점1의 좌표값 : (%d,%d)\n",triangle.point1.x,triangle.point1.y);
		System.out.printf("삼각형의 점2의 좌표값 : (%d,%d)\n",triangle.point2.x,triangle.point2.y);
		System.out.printf("삼각형의 점3의 좌표값 : (%d,%d)\n",triangle.point3.x,triangle.point3.y);
		
		System.out.println("***********");
		Triangle defaulttriangle=new Triangle();
		triangle.draw();
		System.out.println("삼각형의 색상 : "+defaulttriangle.color);
		System.out.printf("삼각형의 점1의 좌표값 : (%d,%d)\n",defaulttriangle.point1.x,defaulttriangle.point1.y);
		System.out.printf("삼각형의 점2의 좌표값 : (%d,%d)\n",defaulttriangle.point2.x,defaulttriangle.point2.y);
		System.out.printf("삼각형의 점3의 좌표값 : (%d,%d)\n",defaulttriangle.point3.x,defaulttriangle.point3.y);
			*/
		System.out.println("***************");
		Triangle triangle=new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("***************");
		Point[] pointarray= {new Point(10,20),new Point(20,30),new Point(40,50)};
		Triangle triangle2=new Triangle(pointarray);
		triangle2.trianglePoint();
		triangle2.draw();
	}

}
