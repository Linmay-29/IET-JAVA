import java.util.Scanner;

public class Array2DService {
	static void accept2DArray(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+ (i+1) + "th row size");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter elemnt at "+(i+1)+"th row & "+(j+1)+"th colums");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	static void display2DArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static int[] rowwiseAddition(int[][] arr){
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i] += arr[i][j];
			}
		}
		return temp;
	}
	private static int columnLength(int[][] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length > max) {
				max = arr[i].length;
			}
		}
		return max;
	}
	static int[] colwiseAddition(int[][] arr) {
		int maxColumn = columnLength(arr);
		int[] temp = new int[maxColumn];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[j] += arr[i][j]; 
			}
		}
		return temp;
	}
}



















