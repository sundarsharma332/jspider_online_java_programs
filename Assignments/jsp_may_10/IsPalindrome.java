import java.util.*;

class IsPalindrome {
    static boolean IsPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return temp == rev ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println(IsPalindrome(num) + " ");
        }
    }
}

/*
input : 

3
1011
323
443211

output : 

false 
true 
false 

*/


