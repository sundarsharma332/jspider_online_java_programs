import java.util.*;

class  OccuranceOfGivenKey
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n; i++){
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int occurance = CountOccuranceInArray(arr, key);
		System.out.println(occurance);
	}

	public static int CountOccuranceInArray(int arr[] , int key){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key) {
				count++;
			}
		}
		return count;
	}
}


/*

test case sample : 

input : 
4  -> length of the array.
2 2 2 4  -> array elements
2  -> key

output: 
3

in above test case 2 appears 3 times.

*/