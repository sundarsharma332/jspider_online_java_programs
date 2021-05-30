import java.util.*;

class FirstAndSecondLargest 
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
			FirstAndSecondLargest(arr , arr.length);
		}
    }

    // Time complexity is 0(Nlogn) and 0(1) space.
    public static void FirstAndSecondLargest(int arr[]  ,int n){
        if(n < 2){
            System.out.println("invalid");
            return;
        } 
        Arrays.sort(arr);
        System.out.println("largest => " + arr[n -1]);  // last element after sorting
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != arr[n - 1]){
                System.out.println("second largest => "  + arr[i]); // check forlast duplucates.
                return;
            }
        }
        System.out.println("no second largest element"); // if all the elements are same. 
    }
}
