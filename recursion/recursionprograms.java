class fact 
{
// program to find the factorial of the given number
// using recursion
	static int fact(int n){
		return n == 1 ? 1 : n * fact(n - 1);
	}
  
  // sum of digits using recursion
	static int sumofdigits(int num){
		int sum = 0;
		if(num > 0){
			return num % 10 + sumofdigits(num / 10);
		}else{
			return 0;
		}
	}
 // linear search  search
 // using recursion
	static int search(int a[] , int key , int index){
		if(index >= a.length){
			return -1;
		}
		if(a[index] == key){
			return index;
		}else{
			return search(a, key, index + 1);
		}
	}
 // binary search using recursion
	static int binarysearch(int a[] , int low, int high , int  key){
		if(low < high){
			int mid = (low + high) / 2;
			if(a[mid] == key){
				return mid;
			}
			if(a[mid] > key){
				return binarysearch(a, low , mid - 1, key);
			}
			return binarysearch(a, mid + 1, high , key);
		}
		return -1;
	}
// string reverse using recursion
	static String reverse(String s, int index){
		String rev = "";
		if(index >= 0){
			return rev + s.charAt(index) + reverse(s, index - 1);
		}
		return rev;
	}


	



	public static void main(String[] args) 
	{
		int arr[] = {1 , 2, 5 , 9, 11};
		System.out.println("index " + binarysearch(arr, 0, arr.length, 5));
		String s = "yrahduahc tikina";
		System.out.println("reversed string is " + reverse(s , s.length() - 1));
		System.out.println("index " + search(arr, 5 , 0));
		System.out.println("factorial is " + fact(5));
		System.out.println("sum of digits "+ sumofdigits(123));
		
	}
}
