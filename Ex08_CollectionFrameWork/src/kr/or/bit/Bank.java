package kr.or.bit;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;//���� ����
	private int totalAccount; //�Ѱ��� ��

	//method
	public Bank(){
		this.accounts=new ArrayList<Account>();
		totalAccount=0;
	}
	
	public void addAccount(String accountNo, String name) { //���¸� �����Ѵ� 
		
		accounts.add(new Account(accountNo,name));
		System.out.println("���¸� �����Ͽ����ϴ�.");
		System.out.printf("[accontNo=%s, name=%s, balance=%d] \n",accountNo,name,accounts.get(totalAccount).getBalance());
		totalAccount++;
		//[accountNo=acc.getAccountNo(),name=acc.getName(), balance=acc.getBalance()];

	}
	public Account getAccount(String accountNo) { //���¸� ���¹�ȣ�� ã�´�
		Account result=null;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				result= accounts.get(i);
			}
		}return result;
	}
	public ArrayList<Account> findAccounts(String name) { //���¸� �����ڸ����� ã�´�
		ArrayList<Account> result=new ArrayList<Account>();
		for(int i=0;i<accounts.size();i++) {
			if((accounts.get(i).getName()).equals(name)) {
				result.add(accounts.get(i));
			}
		}
		return result;
	}
	public ArrayList<Account> getAccounts() { //���¸���� ����
		System.out.println("���� ���¸��");
		for(int i=0;i<accounts.size();i++) {
			System.out.println(accounts.get(i));
		}
		return accounts;
	}
	public int getTotalAccount() { //�Ѱ��¼��� ��ȯ�Ѵ�
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
