import java.util.*;

class  SmallestPrimeNumber
{
	public static void main(String[] args) 
	{
		int arr[] = ReadArray();
		int smaller = SmallestprimeNumberInArray(arr);
		System.out.println(smaller);
	}

	public static boolean isPrime(int a){
		if(a == 1) return false;
		for(int i =2; i < a; i++){
			if(a % i == 0) return false;
		}
		return true;
	}

	public static int SmallestprimeNumberInArray(int arr[]){
		int smaller = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(isPrime(arr[i])){
				if(arr[i] < smaller){
					smaller = arr[i];
				}
			}
		}
		return smaller == Integer.MAX_VALUE ?  -1 : smaller;
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
