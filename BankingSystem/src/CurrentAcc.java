
public class CurrentAcc extends BankAccount{

	private double overdraftLimit;

	public CurrentAcc(String uName, String uEmail, String uPhnNo, int accNum, double balance, double overdraftLimit) {
		super(uName, uEmail, uPhnNo, accNum, balance);
		this.overdraftLimit = overdraftLimit;
	}
	public double withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
		return balance;
    }
	

}
