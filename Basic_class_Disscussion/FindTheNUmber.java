import java.util.*;

public class FindTheNUmber {

      static int[] ReadArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
      }
    // linear search techniques.
    static void FindTheNUmber(int arr[] , int key){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == key){
                System.out.print("key found at " + (i + 1)  + " th position");
                return;
            }
        }
        System.out.println("key is not found");
    }

    public static void main(String args[]) {
        int arr[] = ReadArray();
        int key = 43;
        FindTheNUmber(arr, key);
    }
}


/*
Algorithm for the Linear Search 
===================================
step 1 : create and initilize an array
step 2 : Take a key element.
step 3 : for(i = 0) till length:
         if(key == ar[i]):
             key found
             break;
          end if
       end for
    key is not found.

*/
