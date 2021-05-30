import java.util.*;

class MovePositiveLast 
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
			MovePositiveLast(arr, arr.length);
		}
    }

    public static void MovePositiveLast(int a[] , int n){
       for(int i = 0; i < n; i++){
           for(int j = i + 1; j < n; j++){
               if(a[i] >= 0 && a[j] < 0){
                   int temp = a[j];
                   a[j] = a[i];
                   a[i] = temp;
               }
           }
       }
       for(Integer test : a){
           System.out.print(test + " ");
       }
    }
}

