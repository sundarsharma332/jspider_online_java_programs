// Q. Write a program to compare two arrays.

import java.util.*;

class  CopyElements
{
	public static void main(String[] args) 
	{
		int a[] = ReadArray();
        int b[] = ReadArray();
        if(Arrays.equals(a,b)){   // from array class. 
            // accessing with className // works for char array , string array also.
            System.out.println("Equal");
        }
        else{
            System.out.print("mot equal");
        }


	}
    //
    // using the own logic.
    public static boolean isEqualUsingCustomLogic(int a[], int b[]){
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }


	public static int[] ReadArray(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n ; i++){
			array[i] = sc.nextInt();
		}
		return array;
	}
}