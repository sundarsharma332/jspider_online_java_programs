import java.util.*;

class GreatestOfTwoNumber 
{


	public static void findGreatest(int a , int b){
		if(a > b){
			System.out.println("num1 is greater");
		}else{
			System.out.println("num2 is greater");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		findGreatest(num1, num2);

	}
}
