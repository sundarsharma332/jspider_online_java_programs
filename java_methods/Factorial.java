import java.util.*;

class Factorial

{
	static int factorial(int num){
		if(num == 0) {
			return 1;
		}
		return num * fact(n - 1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
	}
}
