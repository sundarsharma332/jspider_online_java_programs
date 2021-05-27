import java.util.*;

public class PrintFirstDuplicateStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-- > 0){
            int n = sc.nextInt();
            String str[] = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = sc.next();
            }
            PrintAllDuplicateStringsFromStringArrayOptimal(str , n);
         }
    
		
    }
	// Brute Force Approach. // 0(N^2)// 0(1)
    static void PrintAllDuplicateStringsFromStringArray(String str[] , int n){
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(str[i].equals(str[j])){
					System.out.print(str[i] + " ");
					break;
				}
			}
		}
    }

	// optimized approach 0(N) && 0(1) sc.
	 static void PrintAllDuplicateStringsFromStringArrayOptimal(String arr[] , int n){
		HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                System.out.print(arr[i] + " ");
				break;
            }else{
                map.put(arr[i] , 1);
            }
        }

    }

}