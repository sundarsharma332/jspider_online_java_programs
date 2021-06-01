import java.util.*;

class PrintMax{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] input_string_array = input_string.split(" ");
        int max = PrintMax1(input_string_array , input_string_array.length);
        System.out.println(max);
    }
    static int PrintMax1(String s[] , int n ){
        int max = Integer.parseInt(s[0]);
        for(int i = 1; i < n; i++){
            int x = Integer.parseInt(s[i]); 
            if(x > max){
                max = x;
            } 
        }
        return max;
    }

}