package kr.or.bit;

public class CopyEmp {
	private int empno;
	private String name;
	private int sal;
	
	public CopyEmp(int empno, String name,  int sal) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal=sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal( int sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}
}
