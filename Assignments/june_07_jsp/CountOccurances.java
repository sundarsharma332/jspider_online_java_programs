import java.util.*;

class  CountOccurances
{
	public static void main(String[] args) throws Exception 
	{
		try{
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			char c = sc.next().charAt(0);
			int occurances = CountOccurances(s1, c);
			System.out.println(occurances);
		}
		catch(Exception e){
			System.out.println("504 Server Error" + e);
		}
		
	}

	public static int CountOccurances(String s , char c){
		int ans = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c){
				ans++;
			}
		}

		return ans;
	}

}
