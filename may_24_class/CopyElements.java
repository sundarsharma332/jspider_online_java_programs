//Q. Write a program  to copy array elements into anotehr array.

/*
Algorithm
step 1 : create a new array with the samle length 
step 2: traversse through all the array elements of old and copy to new array.
step 3: return new Array.
*/


import java.util.*;

class  CopyElements
{
	public static void main(String[] args) 
	{
		int arr[] = ReadArray();
        int new_array[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            new_array[i] = arr[i];
        }
        for(int elem : new_array){
            System.out.print(elem + " ");
        }

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
