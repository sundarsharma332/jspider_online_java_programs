class FibRec 
{

	static int FibonacciRecursion(int n ) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
	}

	public static void main(String[] args) 
	{
		int num = 10;
		int ans = FibonacciRecursion(num);
		System.out.println(ans);

		
	}
}


