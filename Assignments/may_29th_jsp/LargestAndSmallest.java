import java.util.*;

class LargestAndSmallest 
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
			LargestAndSmallest(arr , arr.length);
		}
    }
    public static void LargestAndSmallest(int arr[]  ,int n){
        int largeest = arr[0];
        int min = arr[0];
        for(int i =1; i < n; i++){
            if(arr[i] > largeest) {
                largeest = arr[i];
            }
        if(arr[i] < min){
            min = arr[i];
        }
      }
      System.out.println("largest => " + largeest +  " MInimum => " + min);
    }
}
