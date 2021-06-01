import java.util.*;
import java.math.*;

class PrintNegative{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] input_string_array = input_string.split(" ");
        solve(input_string_array);
    }
    static void solve(String s[]){
        for(String a : s){
            int x = Integer.parseInt(a);
            if(x < 0){
                System.out.print(x+ " ");
            }
        }
    }

}