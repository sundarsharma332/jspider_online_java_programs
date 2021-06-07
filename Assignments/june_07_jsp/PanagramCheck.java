import java.util.*;

class  PanagramCheck
{
	public static void main(String[] args) throws Exception 
	{
		try{
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			if(IsPanagramCheck(s1)){
				System.out.println("Panagram OK");
			}else{
				System.out.println("Not Panagram");
			}
		}
		catch(Exception e){
			System.out.println("504 Server Error" + e);
		}
		
	}

	public static boolean IsPanagramCheck(String s){
		String after_space = RemoveSpace(s);
		after_space.toLowerCase();
		int a[] = new int[26];
		for(int i = 0; i < after_space.length(); i++){
			a[after_space.charAt(i) - 'a']++;
		}
		for(Integer x : a){
			if(x == 0){
				return false;
			}
		}
		return true;
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
