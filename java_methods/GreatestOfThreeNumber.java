import java.util.*;

class GreatestOfThreeNumber 
{


	public static void findGreatest(int a , int b , int c){
		if(a > b && a > c){
			System.out.println("num1 is greater");
		}else if(b > a && b > c){
			System.out.println("num2 is greater");
		}else{
			System.out.println("num3 is greater");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		findGreatest(num1, num2, num3);

	}
}
