package kr.or.bit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
public class Transaction {
	private String transactionDate; //거래일
	private String transactionTime; //거래시간
	private String kind; //구분(입금/출금)
	private long amount;//거래금액
	private long balance;//잔고
	
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat timeformat=new SimpleDateFormat("HH:mm:ss");
	
	public Transaction(String kind,long amount,long balance){
		this.transactionDate=dateformat.format(cal.getTime());
		this.transactionTime=timeformat.format(cal.getTime());
		this.kind=kind;
		this.amount=amount;
		this.balance=balance;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}





	//get,set
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
