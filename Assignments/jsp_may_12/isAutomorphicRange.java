import java.util.*;
class isAutomorphicRange {
    // simple approach
    static boolean isAutomorphic(int num){
       int square = num * num;
       int x = 0, y = 0;
       while(square > 0 && num > 0){
           int a = square % 10; // 5
           int b = num % 10; // 5
           x = x * 10 + a;
           y = y * 10 + b;
           square /= 10;
           num /= 10;
       }
       if(x == y){
           return true;
       }
       return false;
       
    }
// optimized approcah
     static boolean isAutomorphic2(int num){
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
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println("Case #" + i + " " + isAutomorphic2(num));
          }
    }
}
/*
Q. In this section, we will learn automorphic numbers with examples and also create Java programs
 that check whether the number is automorphic or not.
What is an automorphic number?

A number is called an automorphic number if and only if the square of the 
given number ends with the same number itself. For example, 25, 76 are automorphic
numbers because their square is 625 and 5776, respectively and the last two digits
of the square represent the number itself. 
Some other automorphic numbers are 5, 6, 36, 890625, etc.
input : 
4  -> test cases
25
24
32
76
output : 
Case #1 true
Case #2 false
Case #3 false
Case #4 true
*/
