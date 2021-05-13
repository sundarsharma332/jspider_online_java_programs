// Write a program to print all the Strong Number between the range.
import java.util.*;

class StrongNumberBetweenRange {

    static int fact(int num){
        int factorial = 1;
        for(int i = 1; i<= num; i++){
            factorial *= i;
        }
        return factorial;
    }
    static boolean isStorng(int num){
        int sum = 0, temp = num;
        while(num > 0){
            int digit = num % 10;
            sum += fact(digit);
            num /= 10;
        }
        return sum == temp ? true : false;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            for(int j = lower; j <= upper; j++){
                if(isStorng(j)){
                    System.out.print(j + " ");
                 }
             }
        }
    }
}
input : 
1
1 10000
output:
1 2 145