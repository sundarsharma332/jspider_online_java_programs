import java.util.*;

class ConsecutiveZeroAndOne {


    public static String ReadString(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;

    }

    static void ConsecutiveOneAndTwo(String s){
        for(int i = 0; i < s.length(); i+=2){
            if(s.charAt(i) == s.charAt(i + 1)){
                System.out.print("true" + " ");
            }else{
                System.out.print("false" + " ");
            }
        }
    }
    public static void main(String args[]) {
        String s = ReadString();
        ConsecutiveOneAndTwo(s);
    }
}