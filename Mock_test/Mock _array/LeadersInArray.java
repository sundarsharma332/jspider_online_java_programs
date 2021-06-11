/Q. Write a program to print the leaders in the given array of length N ? 


import java.util.*;
public class LeadersInArray {
    // TC -> 0(N * N);
    // SC -> 0(1)
    public static void getLeaders(int arr[], int n ){
        int k = 0;
        for(int i = 0; i < n; i++){
            int j = 0;
            for(j = i + 1; j < n; j++){
                if(arr[j] > arr[i]){
                    break;
                }
            }
            if(j == n){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    // This approach takes the 0(N) + 0(k), whrere N is the length of the array and K is the numbers of leaders in the array.
    public static void getLeadersOptimal(int a[] , int n){
        int k = 0;
        int temp[] = new int[n];
        int max_right = a[n - 1];  // we know the last element is always a leader.
        temp[k++] = max_right;
        for(int i = n - 2; i >= 0; i--){
            if(max_right < a[i]){
                max_right = a[i];
                temp[k++] = max_right;
            }
        }
        for(int i = k - 1; i >=0; i--){  // if we do not use this we might loose the order of the leaders.
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        while(test_cases > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            getLeaders(a , n);
            getLeadersOptimal(a, n);
            test_cases--;
            
        } 
    }
}

/*
input: 
4        -> number of test cases

6        -> number of array elements
16 17 4 3 5 2   -> array elements
4             (same as above.)
1 2 3 4
4
4 3 2 1
8
3 2 5 1 8 9 5  4


output: 
17 5 2    // brute force
17 5 2    // optimal
4 
4 
4 3 2 1 
4 3 2 1 
9 5 4 
9 5 4

*/