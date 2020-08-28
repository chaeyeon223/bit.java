/*
 Today Point
 [��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� "������"
 [���]���迡��  [�ڽ�Ŭ����]�� [�θ�Ŭ����]�� �޼ҵ�(�Լ�)�� ������(����ٲٱ�)
 ������ : Ʋ�� ��ȭ�� ���� (�Լ��� �̸�, Ÿ��) �ϴ� ���� �ƴ϶� ���븸 { ���� }�ٲٱ�
 
 ����)
 1. �θ��Լ� �̸� ����
 2. �θ��Լ� parameter ����
 3. �θ��Լ� return type ���� ����
 4. �ᱹ, {������ ���� �ڵ常 ���� ���� }
 
 �����ε� : �ϳ��� �̸����� �������� ��� (parameter type�� ���� �޸�)
 �������̵� : ��Ӱ��迡�� ������
 
 
 */
class Point2{ //������ ������ Ŭ����
	int x=4;
	int y=5;
	
	String getPosition() {
		return this.x+"/"+this.y;
	}
}
class Point3D extends Point2{
	int z=6;
	//��� .. 
	
	//Annotation >> java code������ ������ �� ���� '�ΰ����� ����(����/Ȯ��)'�� �����Ϸ�, ���� tool���� ����
	//���� ������, Error ...
	//@Override >> ���� �� �Լ��� ���� �����ǵ� �� �´��� Ȯ���ض� ...
	@Override
	String getPosition() { //
		return this.x+"/"+this.y+"/"+this.z;
	}
}
public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p3=new Point3D();
		String aa=p3.getPosition(); //ȣ��Ǵ� �Լ��� �׻� '�����ǵ� �Լ�'�� ȣ��
		System.out.println(aa);

	}

}
