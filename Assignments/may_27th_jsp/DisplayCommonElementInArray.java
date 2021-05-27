import java.util.*;

public class DisplayCommonElementInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-- > 0){
            int len_a = sc.nextInt();
			int len_b = sc.nextInt();
            int a[] = new int[len_a];
			int b[] = new int[len_b];
            for(int i = 0; i < len_a; i++){
                a[i] = sc.nextInt();
            }
			for(int i = 0; i < len_b;i++){
				b[i] = sc.nextInt();
			}
            DisplayCommonElementInArrayOptimal(a, b);
         }	
    }
    // 0(N62) and 0(1)
	public static void DisplayCommonElementInArray(int a[] , int b[]){
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < a.length; j++){
				if(b[j] == a[i]) {
					System.out.print(b[j] + " ");
				}
			}
		}
	}
	
	//0(N) and 0(1)
	public static void DisplayCommonElementInArrayOptimal(int a[] , int b[]){

		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer x : a){
			set.add(x);
		}
		for(Integer y : b){
			if(set.contains(y)){
				System.out.print(y + " ");
			}
		}
	}
	

 }
 // HashSet<Integer> set = new HashSet<Integer>();