import java.util.*;


public class StringRotationsCheck {


    public static boolean isStringRotation(String a , String b){
        if(a.length() != b.length()){
            return false;
        }
        String new_string = a + b; // after concatination the string b must be present in a as substring.
        if(new_string.contains(b)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_1 = sc.nextLine();
        String input_2 = sc.nextLine();
        if(isStringRotation(input_1, input_2)){
            System.out.println("String 1 is rotation of other");
        }
        else{
            System.out.println("No Rotation Found");
        }


    }
}
