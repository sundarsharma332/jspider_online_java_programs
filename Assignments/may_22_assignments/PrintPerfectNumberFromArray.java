import java.util.*;

class  PrintPerfectNumberFromArray
{
	public static void main(String[] args) 
	{
		int arr[] = ReadArray();
		PrintPerfectNumber(arr);
	}
    public static boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		return sum == num;
	}

	public static void PrintPerfectNumber(int arr[]){
		for(int i = 0; i < arr.length; i++){
			if(isPerfectNumber(arr[i])){
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static int[] ReadArray(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
}
