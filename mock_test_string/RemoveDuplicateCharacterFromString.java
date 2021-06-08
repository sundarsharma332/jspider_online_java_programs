import java.util.*;

public class RemoveDuplicateCharacterFromString {

    public static String RemoveDuplicateCharacterFromString1(String s , int len){
        String res = "";
        int freq[] = new int[256];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < len; i++){
            if(freq[s.charAt(i)] == 1){
                res += s.charAt(i);
            }
            else if(freq[s.charAt(i)] > 1){
                res += s.charAt(i);
                freq[s.charAt(i)] = -1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String new_string = RemoveDuplicateCharacterFromString1(input, input.length());
        System.out.println(new_string);
    }
}
// time complexity is 0(N) + 0(N)
// space complexity is : 0(1) 0r 0(256)
