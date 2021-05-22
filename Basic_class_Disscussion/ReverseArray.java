import java.util.*;

public class ReverseArray {

    static void PirntArray(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
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
    // this will take 0(n) time 
    static void ReverseArray(int arr[]){
        for(int i  = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    static void ReverseArray1(int arr[]){
        for(int  i = 0; i  < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        PirntArray(arr);
    }
    // main method
    public static void main(String args[]) {
        int arr[] = ReadArray();
        ReverseArray1(arr);
    }
}