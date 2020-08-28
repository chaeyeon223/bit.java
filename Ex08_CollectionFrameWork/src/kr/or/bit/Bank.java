package kr.or.bit;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;//계좌 저장
	private int totalAccount; //총계좌 수

	//method
	public Bank(){
		this.accounts=new ArrayList<Account>();
		totalAccount=0;
	}
	
	public void addAccount(String accountNo, String name) { //계좌를 생성한다 
		
		accounts.add(new Account(accountNo,name));
		System.out.println("계좌를 생성하였습니다.");
		System.out.printf("[accontNo=%s, name=%s, balance=%d] \n",accountNo,name,accounts.get(totalAccount).getBalance());
		totalAccount++;
		//[accountNo=acc.getAccountNo(),name=acc.getName(), balance=acc.getBalance()];

	}
	public Account getAccount(String accountNo) { //계좌를 계좌번호로 찾는다
		Account result=null;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				result= accounts.get(i);
			}
		}return result;
	}
	public ArrayList<Account> findAccounts(String name) { //계좌를 소유자명으로 찾는다
		ArrayList<Account> result=new ArrayList<Account>();
		for(int i=0;i<accounts.size();i++) {
			if((accounts.get(i).getName()).equals(name)) {
				result.add(accounts.get(i));
			}
		}
		return result;
	}
	public ArrayList<Account> getAccounts() { //계좌목록을 본다
		System.out.println("현재 계좌목록");
		for(int i=0;i<accounts.size();i++) {
			System.out.println(accounts.get(i));
		}
		return accounts;
	}
	public int getTotalAccount() { //총계좌수를 반환한다
		return totalAccount;
	}
	
	
	
	//get,set
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public void setTotalAccount(int totalAccount) {
		this.totalAccount = totalAccount;
	}
}
