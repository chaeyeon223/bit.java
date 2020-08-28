package kr.or.bit;
//���������� (��������) >> new >> 
//��ü �ϳ��� ����� ���� ... 
//�ǵ� : �ϳ��� ��ü�� �����ϴ� ���� ���� = �ϳ��� ��ü�� ����ڴ�. 
//Ȱ�� : ���������� (1��� ��ΰ� ����), DB �����۾�
public class Singleton {
	private static Singleton p;
		private Singleton() {
			//���� ��ü�� ���� �Ұ� ... new(x) ...heap��ü ���� �Ұ�...
		}
		public static Singleton getInstance() {
			if(p==null) {
				p=new Singleton(); //heap �޸𸮿� Singleton��ü�� �ö� >> ��ü�� �ּҸ� p�� ����
			}
			return p;
		}
}
