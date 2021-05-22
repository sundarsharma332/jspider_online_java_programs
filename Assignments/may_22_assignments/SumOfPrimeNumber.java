import java.util.*;

class  SumOfPrimeNumber
{
	public static void main(String[] args) 
	{
		int arr[] = ReadArray();
		int sum = SumOfPrimeNumbersInArray(arr);
		System.out.println(sum);
	}
    public static boolean isNumberPrime(int num) {
		if(num == 1) return false;
		for(int i = 2; i < num; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
	public static int SumOfPrimeNumbersInArray(int arr[]){
		int sum = 0;
		for(int i = 0; i < arr.length ; i++){
			if(isNumberPrime(arr[i])){
				sum += arr[i];
			}
		}
		return sum;
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
