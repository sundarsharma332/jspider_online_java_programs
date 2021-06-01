import java.util.*;
import java.math.*;

class PriceDiscount{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] input_string_array = input_string.split(" ");
        solve(input_string_array);
    }
    static void solve(String s[]){
        for(int i = 0; i < s.length;i++){
            int a = Integer.parseInt(s[i]);
            if(a <= 1000){
                System.out.print(a + " ");
            }
            else if(a >= 1000 && a < 1500){
                int y = a - ((a * 10)/100);
                System.out.print(y+ " ");

            }
            else{
                int y = a - ((a * 20)/100);
                System.out.print(y + " ");
            }
            
        }
    }

}