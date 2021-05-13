import java.util.*;
class SwapNumbersTechniques {
   // with using temp variable.
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    // without using third variable
    static void swap(int a , int b){
        a = a + b; // 30
        b = a - b; // 10
        a = a - b; // 20
        System.out.println("After swapping " + a + " " + b + " ");
    }
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("before swapping " + num1 + " " + num2 + " ");
            swap(num1 , num2);
            
          }
    }
}
/*
Q. SWap two numbers without using third variable.
4
1 2
34 89
121 344
1234 7789
output : 
before swapping 1 2 
After swapping 2 1 
before swapping 34 89 
After swapping 89 34 
before swapping 121 344 
After swapping 344 121 
before swapping 1234 7789 
After swapping 7789 1234
*/
