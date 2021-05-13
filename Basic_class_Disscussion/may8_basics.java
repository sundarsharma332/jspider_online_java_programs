// java program to check the Count the number of Digits in the number.
import java.util.*;

public class Main {
    static int solve(int a){
        int c = 0;
        if(a == 0) return 1;
        if(a  < 0){
            int num = a * -1;
            while(num > 0){
                num = num / 10;
                c++;
            }
        }
        else{
            while (a > 0){
                a = a / 10;
                c++;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i  <= tc; i++){
            int n = sc.nextInt();
            int ans = solve(n);
            System.out.println("case # " + i +  " : " + ans);
        }
        
    }
}
