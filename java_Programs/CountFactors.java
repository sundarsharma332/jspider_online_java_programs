import java.util.*;

class  CountFactors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.println("Factors are: ");
		int sum = 0;
		int counter = 0;
		for(int i = 1; i <= number ; i++){
			if(number % i == 0) {
				System.out.print(i + " ");
				sum += i;
				counter++;
			}

		}
		System.out.println();
		System.out.println("THE NUMBER OF FACTORS OF " + number+ " are " + counter);
		
		

	}
}
