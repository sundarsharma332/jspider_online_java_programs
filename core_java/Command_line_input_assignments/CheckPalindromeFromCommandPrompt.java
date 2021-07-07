


class  CheckPalindromeFromCommandPrompt
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < args.length; i++){
			if(isPalindrome(args[i])){
				System.out.print(args[i] + " ");
			}
		}
	}

	public static boolean isPalindrome(String s){
		int low = 0, high = s.length() - 1;
		while(low < high){
			if(s.charAt(low) != s.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
}