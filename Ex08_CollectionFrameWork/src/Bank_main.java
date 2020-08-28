import kr.or.bit.Account;
import kr.or.bit.Bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank=new Bank();
		Account account=new Account("5555","브라운");

		bank.addAccount("1111", "박채연");
		bank.addAccount("2222", "홍길동");
		bank.addAccount("3333", "라이언");
		bank.addAccount("4444", "어피치");
		bank.addAccount("5555", "브라운");
		//계좌 찾기(계좌번호)
		System.out.println(bank.getAccount("2222"));
		//계좌 찾기(이름)
		System.out.println(bank.findAccounts("라이언"));
		System.out.println(bank.findAccounts("어피치"));
		
		//계좌목록
		bank.getAccounts();
		//총계좌수
		System.out.println(bank.getTotalAccount());
		
		//입금
		account.deposit(50000);
		account.deposit(30000);
		
		//잔액확인
		System.out.println(account.getBalance());
		//거래내역 확인
		account.getTransaction();

		
		
		
	}

}
