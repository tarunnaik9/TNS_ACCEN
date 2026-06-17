package applications;

public class Account {

	private int accNO;
	private String name;
	private double bal;
	// reference variable of Bank interface
	private Bank bank;
	
	// open source - Generate constructor using fields - Generate
	public Account(int accNO, String name, double bal, Bank bank) {
		super();
		this.accNO = accNO;
		this.name = name;
		this.bal = bal;
		this.bank = bank;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", name=" + name + ", bal=" + bal + ", bank=" + bank + "]";
	}
	
	// to create getter and setter methods
	
	

}
