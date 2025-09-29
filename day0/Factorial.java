class Factorial{
	int factorial(int num){
		int i = 1;
		int fact = 1;
		while(i<=num){
			fact *= i;
			i++;
		}
		return fact;
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		Factorial obj = new Factorial();
		int fact = obj.factorial(n);
		System.out.println("Factorial of "+n+": "+fact);
	}
}