import java.util.*;

class  PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.println("Factors are: ");
		int sum = 0;
		for(int i = 1; i < number ; i++){
			if(number % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}

		}
		System.out.println();
		if(sum == number){
			System.out.println("The number is perfect Number");
		}else{
			System.out.println("The number is Not perfect Number");
		}
		

	}
}
