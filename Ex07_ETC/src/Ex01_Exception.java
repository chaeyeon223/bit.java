/*
 ������ ���� / ��Ÿ�� ����
��Ÿ�� ���� : ���� (ó���� �� ���� �ɰ��� ����) / ���� (ó���� �� �ִ� �ټ� �̾��� ����)
>> ���α׷��� ������ ������ ����, �������� ������¸� �����ϴ� �� : Ȥ�ó� �߻��� �� �ִ� ������ ���� ������ ��, ������ ��ġ�� ���� �ƴ� (���ľ� �� �ڵ�)

 ����
	1. ����(error) : ��Ʈ��ũ ���, �޸�, �ϵ���� >> �����ڰ� �ڵ������� �ذ� �Ұ�
	2. ����(exception) : �������� �ڵ� �Ǽ��� ���� �߻� >> ���� : �ڵ� ���� �ʿ�  >> �ϴ� ���å
	>> ���ܰ� �߻��ϸ� ... ���α׷��� ���� �����
	3. ����ó�� : ������ ���� �� �ִ� �ڵ忡 ������ġ �����ϴ� �� >> ������ �߻��ϴ���, ���� ���� X >> �ϴ� ����
	>> ���������� ���Ḧ ���� ��
	4. try{
			>>������ �߻��� �� �ִ� �ڵ� (�ǽɵǴ� �ڵ�)
	}catch(Exception e) {
			>>������ ����� catch�� ���, ���� ������ �ľ�
				1. �����ڿ��� email
				2. �α����Ͽ� ���� ���
				3. ���� ����� �ϴ� ���´�
				> ���������� �����ڰ� �ذ��ؾ��� (�ڵ� ���ľ� ��)
	{finally{
			>> ������ �߻��ϵ�, �߻����� �ʵ� ������ ����Ǿ�� �� �ڵ�
			>> ex) DB ���� �����ϱ� ...
	}
*/
public class Ex01_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0); //���� ���� >> ������ �߻��ϴ��� ���α׷��� ���� ������� �ʾ����� ...>> '���� ó��'
			//������ �߻��ϸ� >> �� ������ ���� �� �ִ� ��ü�� �ڵ� ���� >> �����Ϸ��� ������ �´� ��ü�� new�� ���� (java.lang.ArithmeticException)
			//�߻��� ������ ������ ArithmeticException�� ���� ...
			
		}catch(Exception e) { //���ܿ� ���� ���� �ϴ� �� >> ��ġ�� ���� �ƴ�, ������ ���� ������ �˷��ִ� ��
			//���� ������ �߻��߰�, ������ �������� Ȯ��
			e.printStackTrace();
			System.out.println("catch : "+e.getMessage());
		}
		System.out.println("main end");

	}

}