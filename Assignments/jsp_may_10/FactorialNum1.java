import java.util.*;

class FactorialNum {
    // recursion
    static int FactorialNum1(int num){
        if(num == 0) return 1;
        if(num == 1) return 1;
        return num * FactorialNum1(num - 1);
    }
    // basic mathematics
    static int FactorialNum2(int num){
        int ans = 1;
        while(num != 0){
            ans *= num;
            num = num - 1;
        }
        return ans;
    }

    // basic mathematics takes 0(n) time and no space
    static int FactorialNum3(int num){
        int ans = 1;
        for(int i = 1; i <= num; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println(FactorialNum1(num) + " ");
            System.out.println(FactorialNum2(num) + " ");
            System.out.println(FactorialNum3(num) + " ");
        }
    }
}

/*
input : 

3
11 12 14

output : 
39916800 
479001600 
1278945280

*/


