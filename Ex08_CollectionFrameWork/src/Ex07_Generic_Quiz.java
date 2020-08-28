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
		//1. Array배열을 사용해서 cart배열 만들고 제품을 담으세요
		Product[] cart=new Product[3];
		cart[0]=new KtTv();
		cart[1]=new Audio();
		cart[2]=new NoteBook();
		
		//2. ArrayList를 사용해서 cart 만들고 제품을 담으세요
		ArrayList<Product> pcart=new ArrayList<Product>();
		pcart.add(new NoteBook()); //Product타입의 주소 담기
		pcart.add(new NoteBook());
		pcart.add(new Audio());
		for(Product value:pcart) {
			System.out.println(value);
		}

		//사원 3명 만들기
		ArrayList<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(1000,"김김김","IT"));
		emp.add(new Emp(2000,"이이이","IT"));
		emp.add(new Emp(3000,"장장장","IT"));
		//사원의 정보 (개선된 for문)
		for(Emp value:emp) {
			System.out.println(value.getEmpno());
			System.out.println(value.getName());
			System.out.println(value.getJob());
		}
		//사원 정보 (일반 for문)
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).getEmpno());
			System.out.println(emp.get(i).getName());
			System.out.println(emp.get(i).getJob());
		}
		
		ArrayList<CopyEmp> clist=new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100,"김씨",1000));
		clist.add(new CopyEmp(200,"이씨",2000));
		clist.add(new CopyEmp(300,"박씨",3000));
		
		//1. 200번 사원의 급여를 5000으로 수정해라 (일반 for문 사용)
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getEmpno()==200) {
				clist.get(i).setSal(5000);
			}
		}
		//2. 300번 사원의 이름을 "궁금해"로 수정해서 출력 (개선 for문)
		for(CopyEmp value:clist) {
			if(value.getEmpno()==300) {
				value.setName("궁금해");
				System.out.println(value.getName());
			}
		}
		
	}
}
