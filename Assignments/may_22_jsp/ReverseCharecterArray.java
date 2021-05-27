import java.util.*;

class  ReverseCharecterArray
{
	public static void main(String[] args) 
	{
		char[] data = ReadChar();
		System.out.println("Before Reversing");
		PrintChar(data);
		System.out.println("After Reversing");
		ReverseCharOptimal(data);
	}
    // simple approach which takes 0(n) time.
	public static void ReverseChar(char[] data){
		for(int i = data.length - 1; i >=0; i--){
			System.out.print(data[i] + " ");
		}
	}
    // optimized approach which takes 0(n/2) time.
	public static void ReverseCharOptimal(char[] data){
		int i = 0;
		int j = data.length - 1;
		char temp;
		while(i < j){
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		for(char ch : data){
			System.out.print(ch + " ");
		}
	}


	public static char[] ReadChar(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] data = new char[n];
		for(int i =0 ; i < n; i++){
			data[i] = sc.next().charAt(0);
		}
		return data;

	}

	public static void PrintChar(char[] data){
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}

}
