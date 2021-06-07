import java.util.*;

class  ReverseStringFromLast
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ReverseStringByLast(s);
	}

	public static String[] CustomSplitMethod(String s){
		
		String[] str = new String[getCount(s) + 1];
		String res = "";
		int j = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' '){
				res += s.charAt(i);
			}
			else{
				str[j] = res;
				j++;
				res = "";

			}
		}
		str[j++] = res;
		return str;
	}

	public static int getCount(String s) {
		int spaces = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				spaces++;
			}
		}
		return spaces;
	}
	public static void ReverseStringByLast(String s){
		String str[] = CustomSplitMethod(s);
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
