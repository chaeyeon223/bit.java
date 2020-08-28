import kr.or.bit.Car;

/*
������ ; modifier
public (����): package ���� ���� ����
private (����): Ŭ���� ���� ���� �ڿ�, �������� ���忡���� ���� �Ұ�(��� �Ұ�)

��ü���� Ư¡
1. ĸ��ȭ(����ȭ) 
> Ŭ���� ���� �ڿ� (member field , member method) ĸ��ȭ ����
ex. private int number : ���� �Ҵ��� ���� ���� �Ҵ��� ���� �ڿ� ��ȣ  >> ���� : �Լ���� (setter/getter)
ex. private void call() : Ŭ���� ���ο��� �ٸ� �Լ��� ���� ���� (���� �Լ�) >> �ܺο��� ���� �Ұ�

  setter/getter
  1. setter�� ����� (O) : ���� (class)������ ���ڴ� > ���� �������� ����
  2. getter�� ����� (X) : �б⸸ �ϰڴ� (���� �ٲ��� �ʴ´�)
  3. getter / setter ��� ����� : write / read (���� �Ѵ� ��������)

*/
public class Ex04_Modifier {
	public static void main(String[] args) {
		Car car=new Car();
		car.setSpeed(10);
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
	}

}
