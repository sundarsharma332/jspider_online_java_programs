import java.util.*;

class  ReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ReverseStringByWords(s);
	}


	public static void ReverseStringByWords(String s){
		String str[] = s.split(" ");
		for(int i = 0;i < str.length; i++){
			str[i] = ReverseString(str[i]);
			System.out.print(str[i] + " ");
		}
	}

	public static String ReverseString(String s){
		String res = "";
		for(int i =s.length() - 1; i >= 0; i--){
			res += s.charAt(i);
		}
		return res;
	}
}
