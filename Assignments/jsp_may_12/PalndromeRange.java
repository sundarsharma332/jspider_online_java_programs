import java.util.*;

class PalndromeRange {
    static boolean isPalindrome(int num){
       int rev = 0, temp = num;
       while(num > 0){
           int digit = num % 10;
           rev = rev * 10 + digit;
           num /= 10;
       }
        return rev == temp ? true : false;

    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            for(int j = lower; j <= upper; j++){
                if(isPalindrome(j)){
                    System.out.print(j + " ");
                 }
             }
             System.out.println();
        }
    }
}

Input : 
4
1 20
20 100
100 200
1000 1200

output :
1 2 3 4 5 6 7 8 9 11 
22 33 44 55 66 77 88 99 
101 111 121 131 141 151 161 171 181 191 
1001 1111 