import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(this.price/10.0);
	}
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		//1. Array�迭�� ����ؼ� cart�迭 ����� ��ǰ�� ��������
		Product[] cart=new Product[3];
		cart[0]=new KtTv();
		cart[1]=new Audio();
		cart[2]=new NoteBook();
		
		//2. ArrayList�� ����ؼ� cart ����� ��ǰ�� ��������
		ArrayList<Product> pcart=new ArrayList<Product>();
		pcart.add(new NoteBook()); //ProductŸ���� �ּ� ���
		pcart.add(new NoteBook());
		pcart.add(new Audio());
		for(Product value:pcart) {
			System.out.println(value);
		}

		//��� 3�� �����
		ArrayList<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(1000,"����","IT"));
		emp.add(new Emp(2000,"������","IT"));
		emp.add(new Emp(3000,"������","IT"));
		//����� ���� (������ for��)
		for(Emp value:emp) {
			System.out.println(value.getEmpno());
			System.out.println(value.getName());
			System.out.println(value.getJob());
		}
		//��� ���� (�Ϲ� for��)
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).getEmpno());
			System.out.println(emp.get(i).getName());
			System.out.println(emp.get(i).getJob());
		}
		
		ArrayList<CopyEmp> clist=new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100,"�达",1000));
		clist.add(new CopyEmp(200,"�̾�",2000));
		clist.add(new CopyEmp(300,"�ھ�",3000));
		
		//1. 200�� ����� �޿��� 5000���� �����ض� (�Ϲ� for�� ���)
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getEmpno()==200) {
				clist.get(i).setSal(5000);
			}
		}
		//2. 300�� ����� �̸��� "�ñ���"�� �����ؼ� ��� (���� for��)
		for(CopyEmp value:clist) {
			if(value.getEmpno()==300) {
				value.setName("�ñ���");
				System.out.println(value.getName());
			}
		}
		
	}
}
