import java.util.*;

class CountPrime {

   static boolean CheckPrime(int num){
       for(int i = 2; i < num; i++){ // if a number has factors between 2 & n-1 then it is not prime number 
           if(num % i == 0){
               return false; // reutrn to the caller.
           }
       }
       return true; // If Everything went well then return True to the caller
   }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt(); // test case input
        for(int i =1; i <= test_case; i++){ // go through all the test case and take input
            int num = sc.nextInt(); // taking number input
            boolean ans = CheckPrime(num); // method calling 
            System.out.println("test_case "  + i+  "# " + ans + " "); // printing output along with test case Details
        }
      }
}

/*
input : 
5
12
13
144
1
4566


op : 
test_case 1# false 
test_case 2# true 
test_case 3# false 
test_case 4# true 
test_case 5# false




*/

