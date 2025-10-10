import java.util.Scanner;
public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		ArrayService1.acceptArray(arr);
		//ArrayService.displayArray(arr);
		//ArrayService.displayAllPrime(arr);
		//System.out.println("Sum of odd: "+ArrayService.sumOfAllOdd(arr));
//		System.out.print("Array of factorials less than equal to 7 = ");
//		ArrayService.displayArray(ArrayService.factorialLT7(arr));
//		System.out.println("Enter nth prime to find in Array");
//		int target = sc.nextInt();
//		int nPrime = ArrayService.nthPrime(arr,target);
//		if(nPrime!=-1) {
//			System.out.println(target+"th prime is = "+nPrime);
//		}else {
//			System.out.println(target+"th prime not found in Array");
//		}
//		System.out.println("Enter nth min prime to find in Array");
//		int target = sc.nextInt();
//		int nPrime = ArrayService.nthMinPrime(arr,target);
//		if(nPrime!=-1) {
//			System.out.println(target+"th prime is = "+nPrime);
//		}else {
//			System.out.println(target+"th prime not found in Array");
//		}
		System.out.println("Enter nth max prime to find in array");
		int target = sc.nextInt();
		System.out.println(target+"th max prime: " + ArrayService1.nthMaxPrime(arr, target));
		
	}
}
