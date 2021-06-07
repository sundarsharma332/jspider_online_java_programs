import java.util.*;

class  SwapStrings
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ReverseStringByWords(s);
	}


	public static void ReverseStringByWords(String s){
		String str[] = s.split(" ");
		int high = str.length - 1;
		int low = 0;
		while(low < high) {
			String temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
		for(String xx: str){
			System.out.print(xx + " ");
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
