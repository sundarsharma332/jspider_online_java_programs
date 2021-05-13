import java.util.*;

class PerfectNumber {
    
    static boolean  PerfectNumber(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) sum += i;
        }
        return sum == num ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println("case #" + i + " " + PerfectNumber(num));
        }
    }
}
input : 

5
28
36
6
19
471

op : 
case #1 true
case #2 false
case #3 true
case #4 false
case #5 false