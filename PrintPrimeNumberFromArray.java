import java.util.*;

public class PrintPrimeNumberFromArray {
    // reading the array elements from user.
    static int[] ReadArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    } 
    // check weather the element is prime or not.
    static boolean checkPrime(int a){
        if(a == 1) return false;
        for(int i = 2; i <= a- 1; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
   // check array elements are prime or not
    static void PrintPrimeNumber(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(checkPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }
    // main method
    public static void main(String args[]) {
        int arr[] = ReadArray();
        PrintPrimeNumber(arr);
    }
}