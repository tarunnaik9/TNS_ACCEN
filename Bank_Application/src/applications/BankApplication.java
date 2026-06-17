package applications;

public class BankApplication {


	public static void main(String[] args) {
		Bank bank = new BankImple();
		
		Account account = new Account(12345, "Nikitha", 30000, bank);
		
		bank.deposit(account,  3000);
		System.out.println(account);
		
		
	}

}