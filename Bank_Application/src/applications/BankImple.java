package applications;

public class BankImple implements Bank{

	@Override
	public void deposit(Account account, double amount) {
		if(amount > DEPOSIT_LIMIT) {
			System.out.println("deposit is not posiible for this account" +account.getBal());
		}
		else
		{
			account.setBal(account.getBal()+amount);
			System.out.println("deposit is not possible for this account now the balance is:" +account.getBal());
		}
		
	}

	
	@Override
	public void withdrawl(Account account, double amount) {
		if((account.getBal()-amount) > MIN_BAL)
		{
			System.out.println("The transaction is successgful");
		}
		else
		{
			System.out.println("The transaction is failed");
		}
		
	}

}