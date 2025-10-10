import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uname = null;
		String uemail = null;
		String phnNo = null;
		System.out.println("Enter Name: ");
		uname = sc.nextLine();
		System.out.println("Enter Email: ");
		uemail = sc.nextLine();
		System.out.println("Enter Phn Number: ");
		phnNo = sc.nextLine();
		UserData u1 = new UserData(uname,uemail,phnNo);
		System.out.println(u1);
		int accNum;
		double balance;
		System.out.println("Enter Account Number: ");
		accNum = sc.nextInt();
		System.out.println("Set the balance :");
		balance = sc.nextDouble();
		BankAccount b1 = new BankAccount(u1,accNum,balance);
		b1.displayBalance();
		
		
	}

}
