// Q. Write a java program to find two array are disjoint are not? 

import java.util.*;
public class areDisjoint {
   public static boolean areDisjoint(int a[] , int b[]){
       for(int i = 0; i < a.length; i++){
           for(int j = 0; j < b.length; j++){
               if(a[i] == b[j]){
                   return false;
               }
           }
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
            boolean status = areDisjoint(a , b);
            System.out.println(status);
            test_cases--;
            
        } 
    }
}
/*
input : 
3
5 4
1 2 3 4 5
6 7 8 9
5 4
1 2 3 4 5
4 5 6 7
5 4
1 6 5 4 2
9 8 7 7

output: 
true
false
true
*/
/*
Algorithm: 
step 1 : Loop through the first array 
         loop through the second array
step 2 : if the array element are equal in both the sets
         then return false
step 3 : if all the elements in the array are checked
         then return true.

Time complexity of the soluton is 0(N * M)
where N = length(first_array);
      M = length(second_array);
Note: can optimize the runtime using sorting and binary search, hashing , map etc.
*/
