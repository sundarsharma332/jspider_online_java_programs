import java.util.*;

class PositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number!");
		int number = sc.nextInt();
		check(number);
	
	}

	public static void check(int num){
		if(num > 0) {
			System.out.println("Positive");
		}else{
			System.out.println("Negative!");

	}
}
}
