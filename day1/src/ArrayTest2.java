
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows :");
		int row = sc.nextInt();
		System.out.println("Enter colms :");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		ArrayService2.acceptArray(arr);
		ArrayService2.displayArray(arr);
//		System.out.println("Enter how many rotations you want");
//		int target = sc.nextInt();
		//ArrayService2.displayArray(ArrayService2.nthColRotate(arr,target));
		//ArrayService2.displayArray(ArrayService2.nthRowRotate(arr,target));
		//System.out.println("Max of array is :"+ ArrayService2.max2DArray(arr));
//		System.out.println("Max found at "+ArrayService2.maxFromRowwise(arr)+"th row");
		System.out.println("Max found at "+ArrayService2.maxFromColwise(arr)+"th col");
		sc.close();
	}
}
