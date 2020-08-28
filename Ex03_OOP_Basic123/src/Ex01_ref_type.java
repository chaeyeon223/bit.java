import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.TV;

public class Ex01_ref_type {

	public static void main(String[] args) {
		//�� Ÿ�� (8���� �⺻ Ÿ��)
		//���� Ÿ�� (Ŭ����, �迭 ...) >> 
		Person p3; //���� : stack �̶�� ������ ������ Ȯ�� (������ ũ��� �ּҸ� ���� �� �ִ� 4byte�� �����)
		p3=new Person(); //p3��� ������ Person��ü�� �ּ� �Ҵ� >> heap������ �޸�
		
		Person p4=null; //main �Լ� �ȿ� �ִ� local variable �̱� ������ >> �ʱ�ȭ �ʿ�
								// ���������� �ʱ�ȭ�� null : ���� ����, �޸𸮸� ������ ���� �ʴ�
		
		//**���������� �޸𸮸� ������ ���
		//1. new ��� (���ο� ��� ���� �ֱ� ) >> p4=new Person();
		//2. �ּҰ� �Ҵ� (���� ����� ���� �ֱ� ) >>p4=p3;
		p4=p3;
		
		Person p=new Person();
		p.name="ȫ�浿";
		p.age=10;
		p.power=true;
		p.personPrint();
		
		Person p2=new Person();
		p2.personPrint();

		//�ּҰ� ��
		System.out.println(p==p2); //������ ���� �ִ� �� �� (�ּҰ� ��)
		System.out.println(p3==p4); //true
		
		//TV ����
		TV tv=new TV();
		tv.brandname="��Ʈ";
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.ch_Up();
		tv.tvInfo();
		
		//��� 1�� ����
		Emp emp=new Emp(); //stack ������ 'emp' - heap ������ 'Emp��ü' >> xx�ּ� �Ҵ�
		emp.empno=7788;
		emp.name="������";
		emp.job="IT";
		
		BodyInfo body=new BodyInfo(); //stack ������ 'body' - heap ������ 'BodyInfo��ü' >> yy�ּ� �Ҵ�
		body.height=190;
		body.weight=40;
		
		emp.bodyinfo=body; //emp.heap ������ bodyinfo�� body �ּ� yy�� �Ҵ� => emp.bodyinfo.height
		//=>emp.bodyinfo=new BodyInfo(); >> stack ������ body ���� ���� ���� x : heap �������� BodyInfo ��ü ���� (��ü ���� �� �׻� �ּҴ� �Ҵ�)
		
		System.out.println(emp.empno+"/"+emp.bodyinfo.height);
		System.out.println(emp.name+"/"+emp.bodyinfo.weight);
	}

}

