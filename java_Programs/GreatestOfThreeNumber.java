import java.util.*;

class GreatestOfThreeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		System.out.println("Enter C");
		int c = sc.nextInt();

		if(a > b && a > c){
			System.out.println("a is greater");
		}else if(b > c && b > c){
				System.out.println("b is greater");
			}else{
				System.out.println("c is greater");
			}
	}
}
