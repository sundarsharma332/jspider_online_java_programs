import java.util.*;

public class MergeArrayZigZag {
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
            for(int i = 0; i < len_b; i++){
                b[i] = sc.nextInt();
            }
			ZigZag(a , b);
         }	
    }
// sort the array and swap the first and last elements.
// 0(Nlogn) + 0(N/2) 
// 0(N) for sc
    public static void MergeArrayZigZagWay(int a[] , int b[]){
        int na[] = new int[a.length + b.length];
		int k = 0;
		for(int i = 0; i  < a.length; i++){
			na[k++] = a[i];
		}
		for(int i = 0; i  < b.length; i++){
			na[k++] = b[i];
		}
		Arrays.sort(na);
		int j = na.length - 1;
		int i = 0;
		while(i < j){
			int temp = na[i];
			na[i] = na[j];
			na[j] = temp;
			i++;
			j--;
		}
		for(Integer x : na) {
			System.out.print(x + " ");
		}
        
    }
// reduced to 0(N) and 0(N) 
	public static void ZigZag(int x[] , int y[]){
        int a[] = new int[x.length + y.length];
		int k = 0;
		for(int i = 0; i  < x.length; i++){
			a[k++] = x[i];
		}
		for(int i = 0; i  < y.length; i++){
			a[k++] = y[i];
		}
		boolean flag = true;
		for(int i= 0; i <= a.length - 2; i++){
			if(flag){
				if(a[i] > a[i + 1]){
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}else{
				if(a[i] < a[i + 1]){
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
			flag = !flag;
		}

		for(Integer xc : a) System.out.print(xc + " ");
	}
}

