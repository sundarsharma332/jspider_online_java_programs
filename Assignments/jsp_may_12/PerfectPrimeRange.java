import java.util.*;

class PerfectPrimeRange {
    static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) {
                sum += i;
            }
        }
        return sum == num ? true : false;

    }
    static boolean isPrime(int num){
        for(int i = 2; i < num ; i++){
            if(num % i == 0) return false;
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
                if(isPrime(j) && isPerfect(j)){
                    System.out.print(j + " ");
                 }
             }
        }
    }
}
inpput :
1
1 100

op : 
// no value present
