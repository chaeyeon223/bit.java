package kr.or.bit;

import java.util.ArrayList;

public class Account {
	private String accountNo; //���¹�ȣ
	private String name; //�����ڸ�
	private long balance; //�ܰ�
	private ArrayList<Transaction> transactions; //�ŷ����� ����
	private int count=0;
	
	
	
	//method
	public Account(){
		this("1111","������");
	}
	public Account(String accountNo,String name){
		this.accountNo=accountNo;
		this.name=name;
		this.balance=0;
		this.transactions=new ArrayList<Transaction>(); 
	}

	public void deposit(long amount) { //�Ա��Ѵ�
		 this.balance+=amount;
		 transactions.add(new Transaction("�Ա�",amount,this.balance));
		 System.out.println(transactions.get(count));
		 count++;
	}
	public void withdraw(long amount) { //����Ѵ�
		 this.balance-=amount;
		 transactions.add(new Transaction("���",amount,this.balance));
		 System.out.println(transactions.get(count));
		 count++;
	}
	public long getBalance() { //�ܰ� Ȯ���Ѵ�
		return balance;
	}
	public ArrayList <Transaction> getTransaction() { //�ŷ������� ����
		System.out.println("�ŷ�����");
		for(int i=0;i<transactions.size();i++) {
			System.out.println(transactions.get(i));
		}return transactions;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ transactions + "]";
	}
	//get,set
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Transaction[] getTransactions() {
		return null;
	}
	public void setTransactions(Transaction[] transactions) {
		
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
