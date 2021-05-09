import java.util.*;

class Main {
    
   static int CountDigits(int num){
       int count = 0;
       while(num > 0){
           num/=10;
           count++;
       }
       return count;
   }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i =1; i <= test_case; i++){
            int num = sc.nextInt();
            int ans = CountDigits(num);
            System.out.println("test_case "  + i+  "# " + ans + " ");
        }
      }
}

