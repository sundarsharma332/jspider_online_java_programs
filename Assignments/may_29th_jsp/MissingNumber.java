import java.util.*;

class MissingNumber 
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
			int missing = MissingNumber(arr, arr.length);
            System.out.println(missing);
		}
    }

    public static int MissingNumber(int arr[] , int n){
     int sum = 0;
     int maxi = arr[0];
     int mini= arr[0];
      for(Integer a: arr){
          sum += a;
      }
      for(int i = 1; i < n;i++){
          if(arr[i] > maxi){
              maxi = arr[i];
          }
          if(arr[i] < mini){
              mini  = arr[i];
          }
      }
	  int actual_sum = (maxi * (maxi + 1)) /2;
      return actual_sum - sum;
    }
}
