
public class TestArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		Array2DService.accept2DArray(arr);
		Array2DService.display2DArray(arr);
		System.out.println("Rowwise Addition");
		int[] rowSum = Array2DService.rowwiseAddition(arr);
		for(int val:rowSum) {
			System.out.print(val+"\t");
		}
		System.out.println();
		
		System.out.println("Columnwise Addition");
		int[] colSum = Array2DService.colwiseAddition(arr);
		for(int val:colSum) {
			System.out.print(val+"\t");
		}
		System.out.println();
	}

}
