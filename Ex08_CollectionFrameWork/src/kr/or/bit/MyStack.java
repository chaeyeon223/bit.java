package kr.or.bit;

//�ڷᱸ�� ����� (Stack)
//������� : Array : Object[] stackarr
//��ġ���� : ����Ǵ� ���� �ִ� ��ġ (index)
//��� : push, pop, empty, full

public class MyStack {
	private Object[] stackarr; //����� 
	private int maxsize; //�ִ�ũ��
	private int top; //�迭�� index �� (��ġ����)
	
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
