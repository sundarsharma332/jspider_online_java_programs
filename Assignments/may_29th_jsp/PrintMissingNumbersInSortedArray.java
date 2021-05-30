import java.util.*;

class PrintMissingNumbersInSortedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			PrintMissingNumbersInSortedArray(arr, arr.length);
		}
    }

    public static void PrintMissingNumbersInSortedArray(int arr[] , int n){
        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer a : arr){
            set.add(a);
        }
        for(int i = arr[0]; i <= arr[n - 1]; i++){
            if(!set.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}

test casae : 

1
5
3 5 7 10 15

op :

4 6 8 9 11 12 13 14 


    