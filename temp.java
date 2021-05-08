import java.util.*;

public class java_assignments_may_8 {
    // program to check , to count the number of digits in the number
    static int solve(int a){
        int c = 0; // initilized the count to 0.
        if(a == 0) return 1; // base case , if num is zero then return 1
        if(a  < 0){  // if the number is less tthan 0 then, multiply it with -1 to make it positive and follow the same logic.
            int num = a * -1;
            while(num > 0){
                num = num / 10;//keep divide the number by 10 untill it gets less than 0
                c++; // increment the counter
            }
        }
        else{
            while (a > 0){ // for the positive number.
                a = a / 10; // keep divide the number by 10 untill it gets less than 0
                c++; // increment the count
            }
        }
        return c; // return the count of the number of digits
    }
    // program to check weather the given number is prime or not
    static boolean CheckPrime(int n){
      if(n == 1) return false; // if the num is 1 simply return false;
      for(int i = 2; i <= n - 1; i++){ // prime number have no factors between 2 to n-1 , if in case have they are not prime number.
          if(n % i == 0){ // check for factors.
              return false;
          }
      }
      return true; // if all clear till 2 - n-1 , then return true.
    }

	// java program to find the number is even or odd number 
	// here I have used the terenary opearator to use the code more shorter and
	// readable.

	// syntax for the terenary operator is :   condition ? block of code (condition gets true) : block of code (condition gets false)

	static boolean CheckEvenOdd(int num){
		return num % 2 == 0 ? true : false; // simple mod operation
		return (num & 1) == 1 ? true : false; // using logical and operation
		return (num /2 * 2) == num ? true : false; // using common logic
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // taking input for multiple test cases
        for(int i = 1; i  <= tc; i++){ // loop run for test cases
            int n = sc.nextInt(); // taking the n as input and store it within the variable n;
            boolean ans = CheckPrime(n); // method calling , returns the boolean value , so we need the boolean 
            // data type to sore the return value;
            System.out.println("case # " + i +  " : " + ans); // print the answer 
        }
    }
}

/*

sample input : 

5  -> number of test cases
10 - > actual num1
23 -> actual num2
77 -> actual num3
121 -> actual num4
9 -> actual num5

op : 
case # 1 : false -> not prime number
case # 2 : true -> prime number
case # 3 : false
case # 4 : false
case # 5 : true

*/
