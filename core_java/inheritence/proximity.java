import java.util.*; 

public class test {
    public static void main(String args[]) {
        String a = "";
        String b = "";
        System.out.println(solve(a , b));
    }
    static int solve(String a , String b){
        int res = 0; 
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        while(index < a.length() && index < b.length()){
            if(a.charAt(index) == b.charAt(index)){
                set.add(index);
                res += 2;
            }
            index++;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length();i++){
            char ch = a.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch , 1);
            }
        }

        for(int i = 0; i  < b.length(); i++){
            char ch = b.charAt(i);
            System.out.println(map.get(ch));
            if(map.get(ch) != null){
                if(set.contains(i)){
                    res += map.get(ch) - 1;
                }else{
                    res +=  map.get(ch);
                }
            }
        }
        System.out.println(map);
        System.out.println(set);
        return res;
    }
}