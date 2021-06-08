import java.util.*;

public class PrintDuplicateCharecterFromString {

    public static void PrintDuplicateCharecterFromString1(String s , int len){
       int freq[] = new int[256];
       for(int i =0; i < s.length(); i++){
           freq[s.charAt(i)]++;
       }
       for(int i = 0; i < s.length(); i++){
           if(freq[s.charAt(i)] > 1){
               System.out.print(s.charAt(i) + " ");
               freq[s.charAt(i)] = -1; // to avoid duplicates
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        PrintDuplicateCharecterFromString1(input, input.length());
    }
}
