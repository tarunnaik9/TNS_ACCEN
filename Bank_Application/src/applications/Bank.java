package applications;

public interface Bank {

	//variables - they are constants they cannot be changed
	// assume account should consist of minimum balance of 1000
	int MIN_BAL = 1000;
	// u cannot deposit ore than 25000 at once
	int DEPOSIT_LIMIT = 25000;
	
	//these methods are by default - public abstract
	void deposit(Account account, double amount);
	void withdrawl(Account account, double amount);
	
}
