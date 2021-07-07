class FiboNacciNumber 
{

	static int FibonacciRecursion(int num ) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
	}

	public static void main(String[] args) 
	{
		int num = 9;
		int f1 = 0; 
		int f2 = 1;
		if(num == 1){
			System.out.println(f1);
		}
		else if(num == 2){
			System.out.print(f1 + " ");
			System.out.print(f2);
		}
		else{
			System.out.print(f1 + " ");
			System.out.print(f2 + " ");
			for(int i = 3; i <= num; i++){
				int f3 = f1 + f2;
				System.out.print(f3 + " ");
				f1 = f2;
				f2 = f3;
			}
		
		}
		
	}
}


