import kr.or.bit.Account;
import kr.or.bit.Bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank=new Bank();
		Account account=new Account("5555","����");

		bank.addAccount("1111", "��ä��");
		bank.addAccount("2222", "ȫ�浿");
		bank.addAccount("3333", "���̾�");
		bank.addAccount("4444", "����ġ");
		bank.addAccount("5555", "����");
		//���� ã��(���¹�ȣ)
		System.out.println(bank.getAccount("2222"));
		//���� ã��(�̸�)
		System.out.println(bank.findAccounts("���̾�"));
		System.out.println(bank.findAccounts("����ġ"));
		
		//���¸��
		bank.getAccounts();
		//�Ѱ��¼�
		System.out.println(bank.getTotalAccount());
		
		//�Ա�
		account.deposit(50000);
		account.deposit(30000);
		
		//�ܾ�Ȯ��
		System.out.println(account.getBalance());
		//�ŷ����� Ȯ��
		account.getTransaction();

		
		
		
	}

}
