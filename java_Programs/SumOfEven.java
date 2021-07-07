import java.util.*;

class  SumOfEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower number");
		int lower = sc.nextInt();
		System.out.println("Enter the Upper number");
		int upper = sc.nextInt();
		int sum = 0;
		for(int i = lower; i <= upper ; i++){
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of the even number from " + lower +  " to " + upper + " is " + sum);
	}
}
