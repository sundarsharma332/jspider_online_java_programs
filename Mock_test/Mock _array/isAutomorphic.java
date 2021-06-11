// Q. Write a java program to find the given number is automorphic or not?
// square(25) => 625 -> the suffix of 625 contains the 25 on it.

import java.util.*;
public class isAutomorphic {

    public static boolean isAutomorphic(int num){
        int square = num * num;
        while(num > 0){
            if(num % 10 != square % 10){
                return false;
            }
            num /= 10;
            square /= 10;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        while(test_cases > 0){
           int num = sc.nextInt();
           boolean status = isAutomorphic(num);
           System.out.println(status);
           test_cases--;
      }
    } 
}

/*
input : 

5 -> test cases
24
25
5
21
625

output : 
false
true
true
false
true
*/
