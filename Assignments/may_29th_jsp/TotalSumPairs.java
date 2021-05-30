import java.util.*;

class TotalSumPairs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0) {
			int n = sc.nextInt();
            int sum = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			int pairs = TotalSumPairs(arr , arr.length , sum);
            System.out.println(pairs);
		}
    }

    public static int TotalSumPairs(int a[] , int n , int  sum){
        int pair = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0;j < n; j++){
                if((i != j) && (a[i] + a[j] == sum)){
                    pair++;
                }
            }
        }
        return pair/2;
    }
}
sample test case : 
input : 
4   -> test cases
4 6  -> length of array , sum 
1 5 7 -1 -> array
5 6   
1 5 7 -1 5
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1
4 2
1 1 1 1


op : 
2
3
9
6