import java.util.Scanner;
class ArrayService1{
	
	public static void acceptArray(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void displayArray(int[] arr){
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void displayAllPrime(int[] arr){
		for(int i = 0; i<arr.length;i++){
			if(arr[i]<=1){
				
			}else{
				int j=2;
				for( j = 2;j<arr[i];j++){
					if(arr[i]%j==0){
						break;
					}
				}
				if(j == (arr[i])) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static int sumOfAllOdd(int arr[]) {
		int sum = 0;
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]%2!=0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	static int[] factorialLT7(int arr[]) {
		int temp[] = new int[arr.length];
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <=1) {
				temp[k]=-1;
				k++;
			}
			else if(arr[i]<=7) {
				int fact = 1;
				for(int j = 1; j<=arr[i];j++) {
					fact *= j;
				}
				temp[k] = fact;
				k++;
			}else {
				temp[k]=-1;
				k++;
			}
		}
		return temp;
	}
	private static int minPrime(int temp[],int target) {
		for(int i = 0; i < temp.length-1; i++) {
		    for(int j = 0; j < temp.length-i-1; j++) {
		        if(temp[j] != 0 && temp[j] < temp[j+1]) {
		            int t = temp[j];
		            temp[j] = temp[j+1];
		            temp[j+1] = t;
		        }
		    }
		    if((i+1)==target && temp[i]!=0) {
		    		return temp[i];
		    	}
		    }
		return -1;
	}
	static int nthMinPrime(int arr[],int target) {
		int k=0;
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				int j=2;
				for(j=2;j<arr[i];j++) {
					if(arr[i]%j==0) {
						break;
					}
				}
				if(j==arr[i]) {
					temp[k] = arr[i];
					k++;
				}
			}
		}
		return minPrime(temp,target);
	}
	
	private static int maxPrimeNumPos(int[] pArr,int target) {
		int max = pArr[0];
		int pos = target;
		for(int i=target;i<pArr.length;i++) {
			if(max<pArr[i]) {
				max = pArr[i];
				pos = i;
			}
		}
		return pos;
	}
	
	private static int maxPrime(int[] pArr,int target){
		
		for(int i = 0; i<pArr.length;i++) {
				int pos = maxPrimeNumPos(pArr,i);
				int temp = pArr[i];
				pArr[i] = pArr[pos];
				pArr[pos] = pArr[i];
		}
		return pArr[target-1];
	}
	static int nthMaxPrime(int arr[],int target) {
		int k=0;
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				int j=2;
				for(j=2;j<arr[i];j++) {
					if(arr[i]%j==0) {
						break;
					}
				}
				if(j==arr[i]) {
					temp[k] = arr[i];
					k++;
				}
			}
		}
		return maxPrime(temp,target);
	}
	
	static int nthPrime(int arr[],int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				int j=2;
				for(j=2;j<arr[i];j++) {
					if(arr[i]%j==0) {
						break;
					}
				}
				if(j==arr[i]) {
					count++;
				}
				if(count == target) {
					return arr[i];
				}
			}
		}
		return -1;
	}  
	
}