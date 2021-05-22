import java.util.*;

class  largestPrimeNumber
{
	public static void main(String[] args) 
	{
		int arr[] = ReadArray();
		int larger = LargestprimeNumberInArray(arr);
		System.out.println(larger);
	}

	public static boolean isPrime(int a){
		if(a == 1) return false;
		for(int i =2; i < a; i++){
			if(a % i == 0) return false;
		}
		return true;
	}

	public static int LargestprimeNumberInArray(int arr[]){
		int larger = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(isPrime(arr[i])){
				if(arr[i] > larger){
					larger = arr[i];
				}
			}
		}
		return larger;
	}

	public static int[] ReadArray(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n ; i++){
			array[i] = sc.nextInt();
		}
		return array;
	}
}
