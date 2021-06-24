


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

/*

input : 
PS D:\Jspider_java_programming\core_java\Assignments> javac CheckPalindromeFromCommandPrompt.java
PS D:\Jspider_java_programming\core_java\Assignments> java CheckPalindromeFromCommandPrompt madam refer malayalam sundar jspider

output: 
madam refer malayalam

*/