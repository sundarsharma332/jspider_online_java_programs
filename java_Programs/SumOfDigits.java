import java.util.*;

class  SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 1000");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num ; i++){
			sum += i;
		}
		System.out.println("The sum of the number from 1 to " + num + " is " + sum);
	}
}
