import java.util.*;

class VowelOrConsonants 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number!");
		String s = sc.nextLine();
		char ch = s.charAt(0);
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("The character is vowel");
		}
		else{
		System.out.println("The character is consonant");
	}
	}
}
