import java.util.*;

class FirstAndSecondSmallest 
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
			FirstAndSecondSmallest(arr , arr.length);
		}
    }

    // Time complexity is 0(Nlogn) and 0(1) space.
    public static void FirstAndSecondSmallest(int arr[]  ,int n){
        if(n < 2){
            System.out.println("invalid");
            return;
        } 
        Arrays.sort(arr);
        System.out.println("smallest => " + arr[0]);  // first element after sorting
        for(int i = 0; i < n; i++){
            if(arr[i] != arr[i + 1]){
                System.out.println("second smallest => "  + arr[i + 1]); // check for first duplucates.
                return;
            }
        }
        System.out.println("no second smallest element"); // if all the elements are same. 
    }
}


/*

input : 
3
4
1 1 2 4
5
1 2 3 4 5
5
5 4 3 2 1


output:
smallest => 1
second smallest => 2
smallest => 1
second smallest => 2
smallest => 1
second smallest => 2


*/