import java.util.*;

public class RemoveAllDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-- > 0){
            int len_a = sc.nextInt();
            int a[] = new int[len_a];
            for(int i = 0; i < len_a; i++){
                a[i] = sc.nextInt();
            }
			RemoveDuplicates(a , len_a);
         }	
    }

// takes 0(nlogn) time 
// space complexity is 0(N) + 0(N);
	public static void RemoveDuplicates1(int a[] , int n){
		Arrays.sort(a);
		int temp[] = new int[n];
		int j = 0;
		for(int i = 0; i < n - 1; i++){
			if(a[i] != a[i + 1]){
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for(int i = 0; i < j; i++){
			System.out.print(temp[i] + " ");
		}
	}
// without using extra array || modify the original array
// takes 0(nlogn) time and 0(N) space complexity for merge sort.
	public static void RemoveDuplicates2(int a[] , int n){
		Arrays.sort(a);
		int j = 0;
		for(int i = 0; i < n - 1; i++){
			if(a[i] != a[i + 1]){
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		for(int i = 0; i < j; i++){
			System.out.print(a[i] + " ");
		}
	}
	// without using extra array || using HashMap
    // takes 0(N) time and 0(N) space complexity.
	public static void RemoveDuplicates3(int a[] , int n){
		HashMap<Integer , Integer> map = new HashMap<>();
		for(Integer x : a){
			if(map.containsKey(x)){
				map.put(x , map.get(x) + 1);
			}else{
				map.put(x , 1);
			}
		}
		for(Integer keys : map.keySet()){
			System.out.print(keys + " ");
		}
	}

	// without using extra array || using Set || set always store the unique elements
    // takes 0(N) time and 0(N) space complexity.
	public static void RemoveDuplicates(int a[] , int n){
		HashSet<Integer> set = new HashSet<>();
		for(Integer x : a) set.add(x);
		set.forEach(elem -> System.out.print(elem + " "));
	}

}
