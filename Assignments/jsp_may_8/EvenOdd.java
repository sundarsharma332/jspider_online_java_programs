import java.util.*;

class EvenOdd {
    
    static boolean EvenOddUsingModulus(int num){
        return num % 2 == 0 ? true : false;
    }
    static boolean EvenOddUsingLogicalAnd(int num){
        return (num & 1) == 0 ? true : false;
    }
    
    static boolean EvenOddSimpleLogic(int num){
        return ((num / 2) * 2) == num ? true : false;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i =0; i < test_case; i++){
            int num = sc.nextInt();
            boolean ans = EvenOddUsingModulus(num);
            boolean ans1 = EvenOddUsingLogicalAnd(num);
            boolean ans2 = EvenOddSimpleLogic(num);
            System.out.println("case #" + i+ " :" + ans + " ");
            System.out.println("case #" + i+ " :" + ans1 + " ");
            System.out.println("case #" + i+ " :" + ans2 + " ");
        }
      }
}

/* input sample 

N number of test caseas
N number

eg.
3
1 2 3



op :  

case #0 :false 
case #0 :false 
case #0 :false 
case #1 :true 
case #1 :true 
case #1 :true 
case #2 :false 
case #2 :false 
case #2 :false

