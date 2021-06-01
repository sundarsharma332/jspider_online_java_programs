import java.util.*;

class TwoConsceEven{
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        String input_string = xc.nextLine();
        String [] s = input_string.split(" ");
        CheckTwoConsecutiveEvenOdd(s);
    }

    public static void CheckTwoConsecutiveEvenOdd(String s[]){
       for(int i = 0; i< s.length - 1; i++){
           int x = Integer.parseInt(s[i]);
           int y = Integer.parseInt(s[i + 1]);
           if(isEvenOdd(x , y)){
               System.out.print("true" + " ");
           }
           else{
               System.out.print("false" + " ");
           }
       }
    }

    public static boolean isEvenOdd(int x , int y){
        if(x % 2 == 0 &&  y % 2 ==0){
            return true;
        }
        else if(x % 2 != 0 && y % 2 != 0) {
            return true;
        }
        else{
            return false;
        }
    }

}