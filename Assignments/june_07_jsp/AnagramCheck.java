import java.util.*;

class  AnagramCheck
{
	public static void main(String[] args) throws Exception 
	{
		try{
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			if(IsAnagramCheck(s1, s2)){
				System.out.println("200 OK");
			}else{
				System.out.println("500 BAD REQUEST");
			}
		}
		catch(Exception e){
			System.out.println("504 Server Error" + e);
		}
		
	}

	public static boolean IsAnagramCheck(String a , String b){
		String a_revovespace = RemoveSpace(a);
		String b_revovespace = RemoveSpace(b);

		char []str1 = a_revovespace.toLowerCase().toCharArray();
		char []str2 = b_revovespace.toLowerCase().toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		return Arrays.equals(str1, str2);

	}

	public static String RemoveSpace(String x){
		String nospace = "";
		for(int i = 0; i < x.length(); i++){
			if(x.charAt(i) != ' '){
				nospace += x.charAt(i);
			}
		}
		return nospace;
	}

}
