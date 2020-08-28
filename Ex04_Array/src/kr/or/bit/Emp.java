package kr.or.bit;

//사원정보 설계도
//데이터를 담을 수 있는 클래스 (DTO/VO)
public class Emp {
	private int empno;
	private String name;
	
	public Emp(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public Emp() { //default constructor
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//기능 (정보 출력)
	public void empInfoPrint() {
		System.out.println(this.empno+"/"+this.name);
	}
	
}
