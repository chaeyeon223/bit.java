import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1. ��� 3���� ���弼�� (��, �迭�� ����ϼ���)
		//1000 - ȫ�浿
		//2000 - ������
		//3000 - ������
		//����� ������ ����� �̸��� ����ϼ���
		
		//1
		Emp[] emp=new Emp[3];
		emp[0]=new Emp();
		emp[1]=new Emp();
		emp[2]=new Emp();
		emp[0].setEmpno(1000);
		emp[1].setEmpno(2000);
		emp[2].setEmpno(3000);
		emp[0].setName("ȫ�浿");
		emp[1].setName("������");
		emp[2].setName("������");
		for(int i=0;i<emp.length;i++) {
			emp[i].empInfoPrint();
		}
		//2
		Emp[] emp1=new Emp[] {new Emp(1000,"ȫ�浿"),new Emp(2000,"������"),new Emp(3000,"������")};
		for(int i=0;i<emp1.length;i++) {
			emp1[i].empInfoPrint();
		}
		//3
		Emp[] emp2={new Emp(1000,"ȫ�浿"),new Emp(2000,"������"),new Emp(3000,"������")};
		for(Emp e:emp2) {
			e.empInfoPrint();
		}
	}

}
