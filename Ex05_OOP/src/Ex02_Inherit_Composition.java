/*
�ǹ�(����ȯ��)
1���� Ŭ������ ���� �Ұ� = ���赵 1���� ���� �Ұ� (������ �����ϱ� ����)
Ex.���θ� : �ֹ�����, ȸ������, ���, ��ǰ ,,, >>������ ���� ���赵 ����

*** ���� ***
�������� ���赵�� ���� �ξ��ִ� ��
1. ��� (is ~a : ���) = ~�� ~�̴� (�θ� �ڿ�)
2. ���� (has ~a : ����) = ~�� ~�� ������ �ִ�
ex. ���� �����̴� >> ��  extends ����
ex. ������ ������ ������ �ִ� >> class ���� { ���� }
ex. ���� ���� ������ �ִ� >> class �� { �� }
ex. ��, �ﰢ��, �簢�� ����� ���赵

	���� �����̴�
	�ﰢ���� �����̴�
	�簢���� �����̴�
	
	���� : �߻�ȭ, �Ϲ�ȭ(�׸���, ����) >> �����ڿ� �����
	�� : ��üȭ, Ư��ȭ (������, �� ��) >> ���θ��� ������ Ư¡
	
	�� : ��ǥ�� (x,y)
	���� ���� ������ �ִ�
	�ﰢ���� ���� ������ �ִ�
	�簢���� ���� ������ �ִ�
	
	class Shape{ �׸���, ���� } >> ��Ӱ��� (�θ�)
	class Point{ ��ǥ�� } >> ���԰���(��ǰ)
	
	��üȭ, Ư��ȭ : circle, triangle
 */

//�߻�ȭ, �Ϲ�ȭ, ����
class Shape{
	String color="gold"; //����Ӽ�
	void draw() {
		System.out.println("������ �׸���");
	}
}
//���� (��)
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

//���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�)
//1. ���� �����̴� (is~a) : ����(shape)
//2. ���� ���� �����ִ� (has~a) : ��(point)
//3. ���� �������� �����ִ� (Ư����) : r
//���� �������� �ʱⰪ : 10
//���� ��ǥ�� �ʱⰪ : (10,15)
//�⺻(�ʱⰪ)�� �������� ������ �������� ���� ���� �Է¹��� �� �ִ� (���� ������� ��)
class Circle extends Shape{ //���
	Point point; //����
	int r; //Ư����
	
	Circle(){
		this(10,new Point(10,15));
	}
	Circle(int r, Point point){
		this.r=r;
		this.point=point;
	}
}
//Quiz. �ﰢ�� �����
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
		System.out.println("���� ����:"+circle.color);
		System.out.println("���� ������:"+circle.r);
		System.out.println("���� x��ǥ:"+circle.point.x);
		System.out.println("���� y��ǥ:"+circle.point.y);
		circle.draw();
		System.out.println("***********");
		Circle circle2=new Circle(20,new Point(10,20));
		System.out.println("���� ����:"+circle2.color);
		System.out.println("���� ������:"+circle2.r);
		System.out.println("���� x��ǥ:"+circle2.point.x);
		System.out.println("���� y��ǥ:"+circle2.point.y);
		circle2.draw();
		/*
		System.out.println("***********");
		Triangle triangle=new Triangle(new Point(10,20),new Point(30,40),new Point(50,60));
		triangle.draw();
		System.out.println("�ﰢ���� ���� : "+triangle.color);
		System.out.printf("�ﰢ���� ��1�� ��ǥ�� : (%d,%d)\n",triangle.point1.x,triangle.point1.y);
		System.out.printf("�ﰢ���� ��2�� ��ǥ�� : (%d,%d)\n",triangle.point2.x,triangle.point2.y);
		System.out.printf("�ﰢ���� ��3�� ��ǥ�� : (%d,%d)\n",triangle.point3.x,triangle.point3.y);
		
		System.out.println("***********");
		Triangle defaulttriangle=new Triangle();
		triangle.draw();
		System.out.println("�ﰢ���� ���� : "+defaulttriangle.color);
		System.out.printf("�ﰢ���� ��1�� ��ǥ�� : (%d,%d)\n",defaulttriangle.point1.x,defaulttriangle.point1.y);
		System.out.printf("�ﰢ���� ��2�� ��ǥ�� : (%d,%d)\n",defaulttriangle.point2.x,defaulttriangle.point2.y);
		System.out.printf("�ﰢ���� ��3�� ��ǥ�� : (%d,%d)\n",defaulttriangle.point3.x,defaulttriangle.point3.y);
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
