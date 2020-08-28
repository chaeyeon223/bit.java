package kr.or.bit;

//데이터를 담을 수 있는 클래스 = DTO/VO/DOMAIN
public class Emp { //extends Object 생략
	private int empno;
	private String ename;
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	

}
