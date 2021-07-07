class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 12321;
		int temp = num;
		int rev = 0;
		while(num > 0 ){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(rev == temp){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
