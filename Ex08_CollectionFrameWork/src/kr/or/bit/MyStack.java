package kr.or.bit;

//자료구조 만들기 (Stack)
//저장공간 : Array : Object[] stackarr
//위치정보 : 저장되는 값이 있는 위치 (index)
//기능 : push, pop, empty, full

public class MyStack {
	private Object[] stackarr; //저장소 
	private int maxsize; //최대크기
	private int top; //배열의 index 값 (위치정보)
	
	public MyStack(int maxxize) {
		this.maxsize=maxsize;
		stackarr=new Object[maxsize];
		top=-1;
	}
	public boolean isEmpty() {
		return (top==-1); //true,false
	}
	public boolean full() {
		return(top==maxsize-1); //true,false
	}
	public void push(Object i) {
		if(full()) {
			System.out.println("stack full ...");
		}else {
			stackarr[++top]=i;
		}
	}
	public Object pop() {
		Object value=null;
		if(isEmpty()) {
			System.out.println("stack empty....");
		}else {
			value=stackarr[top];
			top--;
		}
		return value;
	}
}
