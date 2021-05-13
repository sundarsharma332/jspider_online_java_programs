import java.util.*;
import java.io.*;

class MuliplyTwoNumberWithoutUsingSign { 
    // using multipication sign. // 2
    static int MuliplyTwoNumber1(int a, int b)
    {
        int res = 0; 
        while (b > 0)
        {
             if (b % 2 != 0){
                 res = res + a;
             }
            a = a * 2;
            b = b / 2;
        }
        return res;
    }
    // using multipication sign // 1
    static int simpleApproach(int a , int b){
        return a * b;
    }
    // MuliplyTwoNumberWithoutUsingSign // same as 2 
    // instead a = a * 2 , the job is to multiply a by 2 times in every time, so we
    // can use right shift and left shift or bitwise operator in java.

    // a = a << 1;
     // example a = 2 -> binary of a = 0010 -> left shift by 1 -> 0100 -> 4  -> double the value
     // example b  = 2 -> bunary of b = 0010 -> right shift by 1 -> 0001 -> 1  --> halve the value
    static int MuliplyTwoNumberWithoutUsingSign(int a , int b){
        int res = 0; 
        while (b > 0)
        {
             if (b % 2 != 0){ // (b % 2 != 0) this can be replace with ((num & 1) != 0)
                 res = res + a;
             }
            a = a << 1;
            b = b >> 1;
        }
        return res;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int ans = MuliplyTwoNumberWithoutUsingSign(num1 , num2);
            System.out.println("case #" + i + " " + ans );
          }
    }
}
/*
input:
2
18 1
20 12
output : 
case #1 18
case #2 240
*/