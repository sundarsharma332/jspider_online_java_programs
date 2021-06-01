import java.util.*;

class PrintPrime{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] input_string_array = input_string.split(" ");
        PrintPrime(input_string_array , input_string_array.length);
    }

    static void PrintPrime(String s[] , int n ){
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(s[i]);
            if(isPirme(x)){
                System.out.print(x + " ");
            }
        }
    }

    static boolean isPirme(int n ){
        if(n == 1) return false;
        for(int u = 2; u < n; u++){
            if(n % u == 0) return false;
        }
        return true;
    }
}