import java.util.*;

class  CheckCharInCharArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char data[] = new char[n];
		for(int i = 0;i < n; i++){
			data[i] = sc.next().charAt(0);
		}
		char key = sc.next().charAt(0);
		CheckCharPresentInCharArray(data, key);
	}

	public static void CheckCharPresentInCharArray(char data[] , char key){
		for(int i = 0; i < data.length; i++){
			if(data[i] == key){
				System.out.println("The character is present at "+ (i + 1) + " th position");
				return;
			}
		}
		System.out.println("The given Key is Not found in Character Array");
	}
}

/*

PS D:\may_22_assignments> javac CheckCharInCharArray.java
PS D:\may_22_assignments> java CheckCharInCharArray
5
a b c d e
d
The character is present at 4 th position
PS D:\may_22_assignments>

*/