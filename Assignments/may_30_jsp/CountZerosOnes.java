import java.util.*;
import java.math.*;

class CountZerosOnes{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] a = input_string.split(" ");
        solve(a);
    }
    static void solve(String s[]){
        for(int i = 0; i < s.length; i++){
            int x = Integer.parseInt(s[i]);
            System.out.println("number -> " + x);
            int zero = 0;
            int one = 0;
            while(x > 0){
                int mod = x % 10;
                if(mod == 1) one++;
                if(mod == 0) zero++;
                x /= 10;
            }
            System.out.println("1 -> " + one);
            System.out.println("0 -> " + zero);
            System.out.println("--------------");

        }
    }

}