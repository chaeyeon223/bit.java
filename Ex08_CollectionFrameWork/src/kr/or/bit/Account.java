package kr.or.bit;

import java.util.ArrayList;

public class Account {
	private String accountNo; //계좌번호
	private String name; //소유자명
	private long balance; //잔고
	private ArrayList<Transaction> transactions; //거래내역 저장
	private int count=0;
	
	
	
	//method
	public Account(){
		this("1111","유관순");
	}
	public Account(String accountNo,String name){
		this.accountNo=accountNo;
		this.name=name;
		this.balance=0;
		this.transactions=new ArrayList<Transaction>(); 
	}

	public void deposit(long amount) { //입금한다
		 this.balance+=amount;
		 transactions.add(new Transaction("입금",amount,this.balance));
		 System.out.println(transactions.get(count));
		 count++;
	}
	public void withdraw(long amount) { //출금한다
		 this.balance-=amount;
		 transactions.add(new Transaction("출금",amount,this.balance));
		 System.out.println(transactions.get(count));
		 count++;
	}
	public long getBalance() { //잔고를 확인한다
		return balance;
	}
	public ArrayList <Transaction> getTransaction() { //거래내역을 본다
		System.out.println("거래내역");
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
