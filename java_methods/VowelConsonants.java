import java.util.*;

class VowelConsonants 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		char a = ch.charAt(0);
		
	
	}


	public static void checkVowel(char ch){
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("The character is vowel");
		}
		else{
		System.out.println("The character is consonant");
	}

	}
}
