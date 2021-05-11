import java.util.*;

class SumOfDigit {

    static int SumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println(SumOfDigit(num) + " ");
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
10 
2 
1 
7 

*/


