class  SumOfExtractedDigitsInAlphanumericString
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < args.length; i++){
			int number = SumOfExtractedDigitsInAlphanumericStrings(args[i]);
			System.out.print(number + " ");
		}
	}

	public static int SumOfExtractedDigitsInAlphanumericStrings(String s){
		int sum_of_digits = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(isDigit(ch)){
				sum_of_digits += ch - '0';
			}
		}
		if(sum_of_digits == 0){
			return -1; // if there is no digit found then return -1;
		}
		return sum_of_digits;
	}
	public static boolean isDigit(char ch){
		int x = ch -'0';
        if(x <= 9 && x >= 0){
             return true;
         }
         return false;
	}
}
