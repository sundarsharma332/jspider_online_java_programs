import java.util.*;

class RemoveSpeceficPosArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 1; i <= tc; i++){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int x = 0; x < arr.length; x++){
				arr[x] = sc.nextInt();
			}
			int pos = sc.nextInt();
			int new_arr[] = RemoveSpeceficElement(arr , pos);
			System.out.print("case #" + i + "  ");
			for(Integer a : new_arr){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static int[] RemoveSpeceficElement(int arr[] , int pos){
		int temp[] = new int[arr.length - 1];
		int i = 0;
		int j = 0;
		while( i < arr.length){
			if(i != pos){
				temp[j++] = arr[i++];
			}
			else{
				i++;
			}
		}
		return temp;
	}
}
