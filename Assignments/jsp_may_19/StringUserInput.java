import java.util.*;

class StringUserInput
{
	public static String[] ReadStringFromUser(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = sc.next();
		}
		return str;
	}
	public static void PrintString(String [] str){
		for(int i = 0; i < str.length; i++){
			System.out.print( str[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		String [] str = ReadStringFromUser();
		PrintString(str);
	}
}
