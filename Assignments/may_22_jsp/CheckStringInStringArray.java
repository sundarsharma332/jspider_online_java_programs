import java.util.*;

class  CheckStringInStringArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String data[] = new String[n];
		for(int i = 0;i < n; i++){
			data[i] = sc.next();
		}
		String key = sc.next();
		CheckStringPresentInStringArray(data, key);
	}

	public static void CheckStringPresentInStringArray(String data[] , String key){
		for(int i = 0; i < data.length; i++){
			if(key.equals(data[i])){
				System.out.println("The String is present at "+ (i + 1) + " th position");
				return;
			}
		}
		System.out.println("The given Key is Not found in String Array");
	}
}

/*
PS D:\may_22_assignments> javac CheckStringInStringArray.java
PS D:\may_22_assignments> java CheckStringInStringArray
8
do you believe in love at first sight
love
The String is present at 5 th position
PS D:\may_22_assignments>

*/