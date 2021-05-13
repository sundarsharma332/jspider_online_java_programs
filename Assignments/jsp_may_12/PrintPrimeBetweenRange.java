// write a java program to print the primt number between the range .

// the lower range is taken as lower & higer range is taken as upper.

import java.util.*;

class PrintPrimeBetweenRange {
    static boolean isPrime(int num){
        for(int i  = 2; i < num ; i++){
           if(num % i == 0){
               return false;
           }
       }
       return true;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            for(int j = lower; j <= upper; j++){
                if(isPrime(j)){
                    System.out.print(j + " ");
                 }
             }
             System.out.println();
        }
    }
}

input : 
2    // number of test cases
50   // lower bound
100  // upper bound
30   // lower bound
90    // upper bound 

output : 
53 59 61 67 71 73 79 83 89 97  //  op for 50 - 100
31 37 41 43 47 53 59 61 67 71 73 79 83 89  // op for 30 - 90