import java.util.*;

public class PrintAllUniqueElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            PrintFirstUniqueElementFromArrayOptimal(arr , n);
         }
        
    }

    // Brute force Approach 
    // TC -> 0(N^2) // SC -> 0(1)
    static void PrintFirstUniqueElementFromArray(int arr[] , int n){
        for(int i = 0; i < n ; i++){
            int j;
            for(j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    break;
                }
            }
            if(j == n){
                System.out.print(arr[j] + " ");
            }
        }
    }
// Optimal Approach uses the 0(N) time and 0(N) space.
// use Hashmap to store the frequency of each array ele
    static void PrintFirstUniqueElementFromArrayOptimal(int arr[] , int n){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}