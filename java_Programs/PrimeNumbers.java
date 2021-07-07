import java.util.*;

class  PrimeNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int counter = 0;
		for(int i = 1; i <= number ; i++){
			if(number % i == 0) {
				System.out.print(i + " ");
				counter++;
			}

		}
		System.out.println(" ");
		if(counter == 2){
			System.out.println("PRIME NUMBER");
		}else{
			System.out.println("NOT A PRIME NUMBER");

		}
		System.out.println("NOTE :  A PRIME NUMBER HAS ONLY TWO FACTORS");
		
		

	}
}
