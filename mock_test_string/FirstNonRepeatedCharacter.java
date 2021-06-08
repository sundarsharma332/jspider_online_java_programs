import java.util.*;

public class FirstNonRepeatedCharacter {

    
    public static char PrintFirstNonRepeatedCharacter(String s , int len){
        for(int i = 0; i < len - 1; i++){
            int j ;
            for(j = i + 1; j < len; j++){
                if(s.charAt(i) == s.charAt(j)){
                    break;
                }
            }
            if(j == len){
                return s.charAt(i);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c  = PrintFirstNonRepeatedCharacter(input , input.length());
        System.out.println(c);
    }
}

// time complexity is 0(n * n) -> can reduce to 0(n) using hashmap or other data structure.
// space complexity if 0(1)