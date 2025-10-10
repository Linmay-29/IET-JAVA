import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add test \n2.Display all test \n3.Start test \n4.Show result \n5.exit \nchoose :");
			choice = sc.nextInt();
			switch(choice) {
				case 1:{
					boolean status = TestService.acceptQue();
					if(status) {
						System.out.println("Test added successfully");
					}else {
						System.out.println("Error");
					}
				}break;
				case 2:{
					TestService.displayAll();
				}break;
				case 3:{
					System.out.println("Enter Test id to start test");
					int tid = sc.nextInt();
					boolean status = TestService.userTest(tid);
					if(status) {
						System.out.println("Test submitted");
					}else {
						System.out.println("Error");
					}
				}break;
				case 4:{
					System.out.println("Enter Test id to check result");
					int tid = sc.nextInt();
					TestService.displayTestResult(tid);
				}break;
				case 5:{
					System.out.println("Thank you for using services");
				}break;
				default:
					System.out.println("Wrong input");
			}
		}while(choice != 5);
		
	}
}
