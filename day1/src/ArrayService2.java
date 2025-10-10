import java.util.Scanner;
class ArrayService2{
	
	public static void acceptArray(int[][] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void displayArray(int[][] arr){
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void copy2DArray(int arr[][],int temp[][]){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[i][j] = arr[i][j];
			}
		}
	}
	public static int[][] nthColRotate(int[][] arr,int target) {
		int temp[][]= new int[arr.length][arr[0].length];
		copy2DArray(arr, temp);
		for(int k=1;k<=target;k++) {
			for(int i=0;i<arr[0].length-1;i++) {
				for(int j=0;j<arr.length;j++) {
					int swap = temp[j][i];
					temp[j][i] = temp[j][i+1];
					temp[j][i+1] = swap;
				}
			}
		}
		return temp;
	}
	public static int[][] nthRowRotate(int[][] arr,int target) {
		int temp[][] = new int[arr.length][arr[0].length];
		copy2DArray(arr,temp);
		for(int k=1;k<=target;k++) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr[0].length;j++) {
					int swap = temp[i][j];
					temp[i][j] = temp[i+1][j];
					temp[i+1][j] = swap;
				}
			}
		}
		return temp;
	}
//	public static int[][] nthRowRotate(int[][] arr,int target) {
//		int temp[][] = new int[arr.length][arr[0].length];
//		copy2DArray(arr,temp);
//		for(int k=1;k<=target;k++) {
//			int temp1[] = temp[0];
//			for(int i = 0 ; i < arr.length-1;i++) {
//				temp[i] = temp[i+1];
//			}
//			temp[temp.length-1]=temp1;
//		}
//		return temp;
//	}
	public static int max2DArray(int[][] arr) {
		int max = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	static int max1DArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		int i;
		for(i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return i;
	}
	static int maxFromRowwise(int arr[][]) {
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i] += arr[i][j];
			}
		}
		return max1DArray(temp);
	}
	static int maxFromColwise(int arr[][]) {
		int temp[] = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i]+=arr[j][i];
			}
		}
		return max1DArray(temp);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}