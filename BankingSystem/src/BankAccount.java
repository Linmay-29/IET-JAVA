
public class BankAccount extends UserData {
		private int accNum;
		protected double balance;
		
		public BankAccount(String uName, String uEmail, String uPhnNo, int accNum, double balance) {
			super(uName, uEmail, uPhnNo);
			this.accNum = accNum;
			this.balance = balance;
		}
		public BankAccount(UserData u, int accNum, double balance) {
//			super(uName, uEmail, uPhnNo);
			this.accNum = accNum;
			this.balance = balance;
		}
		public double deposit(double amount) {
			balance += amount; 
			return balance;
		}
		public double withdraw(double amount) {
			if(amount>balance) {
				System.out.println("Insufficient Balance");
				return balance;
			}
			balance -= amount;
			return balance;
		}
		public void displayBalance () {
			System.out.println("Acc Holder: " + getuName());
			System.out.println("Acc Number: " + accNum);
			System.out.println("Account Balance : "+balance);
		}
}
