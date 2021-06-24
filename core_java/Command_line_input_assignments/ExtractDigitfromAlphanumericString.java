class ExtractDigitfromAlphanumericString 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < args.length; i++){
			int number = GetNumberFromAlphanumericString(args[i]);
			System.out.print(number + " ");
		}
	}

	public static int GetNumberFromAlphanumericString(String s){
		int number = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(isDigit(ch)){
				number = number * 10 + (ch - '0');
			}
		}
		if(number == 0){
			return -1; // if there is no digit present then return -1;
		}
		return number;
	}

	public static boolean isDigit(char ch){
		int x = ch -'0';
        if(x <= 9 && x >= 0){
             return true;
         }
         return false;
	}
}


input:
>> javac ExtractDigitfromAlphanumericString.java
>> java ExtractDigitfromAlphanumericString hello123 34sundar32 jspider234

output: 

123 3432 234