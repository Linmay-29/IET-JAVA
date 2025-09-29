import java.util.Scanner;
class CalTable{
	static void Table(int n){
		for(int i = 1;i<=10;i++){
			System.out.println(i +" * "+n+" = "+(i*n) + " ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Table(n);
	}
}