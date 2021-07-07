import java.util.*;

class Factorial

{

	static int FactRecursion(int n){
		if(n == 0 || n == 1) return 1;
		return n * FactRecursion(n-1);
	}
	public static void main(String[] args) 
	{
		int fact = 1;
		int num = 5;
		int temp = num;
		while(num > 0){
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
		int ans = FactRecursion(temp);
		System.out.println(ans);

	}
}
