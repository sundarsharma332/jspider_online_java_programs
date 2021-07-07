import java.util.*;

class CheckEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number!");
		int number = sc.nextInt();
		check(number);
	
	}

	public static void check(int num){
		if(num % 2 == 0) {
			System.out.println("Even");
		}else{
			System.out.println("odd!");

	}
}
}
