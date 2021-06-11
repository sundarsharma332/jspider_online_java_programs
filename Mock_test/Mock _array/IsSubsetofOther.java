//Q. Write a program to print the to check the on earray is subset of another.
// 0(N * M) approach where N = length(a) , M = length(b);
// we can reduce the time complexity by sorting the elements in nlogn time and binary search which is nlogn * logn time.


import java.util.*;
public class IsSubsetofOther {
  public static boolean isSubset(int a[] , int b[]){
      int j;
      for(int i = 0; i < b.length; i++){
          for(j = 0; j < a.length; j++){
              if(b[i] == a[j]) break;
          }
          if(j == a.length) return false;
      }
      return true;
  }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        while(test_cases > 0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int a[] = new int[n1];
            int b[] = new int[n2];
            for(int i = 0; i < n1; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n2; i++){
                b[i] = sc.nextInt();
            }
            boolean status = isSubset(a , b); // 0(N * M) approach where N = length(a) , M = length(b);
            System.out.println(status);
            test_cases--;
            
        } 
    }
}

input: 
N test test_cases
length of array a, length of array b
araay a elements
array b elements

sample 1 : 
=============
2
5 4
1 2 3 4 5
8 2 3 4
4 2
9 8 7 3
9 7



output : 
false
true
