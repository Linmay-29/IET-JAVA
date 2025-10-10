
public class SavingsAcc extends BankAccount {
	private double interestRate;
	
	public SavingsAcc(String uName, String uEmail, String uPhnNo, int accNum, double balance, double interestRate) {
		super(uName, uEmail, uPhnNo, accNum, balance);
		this.interestRate = interestRate;
	}

	public double addInterest() {
		balance += (interestRate*balance);
		return balance;
	}
}
