class MethodExample1 
{



	static void sample1(){
		System.out.println("sample1 Starts");
		System.out.println("sample1 Ends");

	}
	static void sample2(){
		System.out.println("sample2 Starts");
		System.out.println("sample2 Ends");
	}
	static void sample3(){
		System.out.println("sample3 Starts");
		System.out.println("sample3 Ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		sample1();
		sample2();
		sample3();
		sample1();
		System.out.println("Main Ends");
	}
}
