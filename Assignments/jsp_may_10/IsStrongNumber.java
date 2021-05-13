import java.util.*;

class IsStrongNumber {

    static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n -1);
    }

    static boolean IsStrongNumber(int num){
        // sum of the factorial of the al digit is equal to the original number is called as the strong number.
       int temp = num;
       int sum = 0;
       while(num > 0){
           int digit = num % 10;
           sum += fact(digit);
           num /= 10;
       }
       if(sum == temp) return true;
       return false;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println(IsStrongNumber(num) + " ");
        }
    }
}

/*
input : 

4
145
2
1
3

output : 

true 
true 
true 
false 

*/


