
import java.util.*;

public class RemoveCharacterFromGivenString {


    public static String RemoveCharacterFromGivenString1(String s, char ch){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ch){
                res += s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);
        String Final_stirng = RemoveCharacterFromGivenString1(input, ch);
        System.out.println(Final_stirng);
    }
}

// time complexity is 0(N) 
// No space required