import java.util.*;

class IsPerfectNUmber {

    static boolean IsPerfectNUmber(int num){
        int FactortSum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                FactortSum += i;
            }
        }
        if(FactortSum == num) return true;
        return false;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            System.out.println(IsPerfectNUmber(num) + " ");
        }
    }
}

/*
input : 

4
28
14
54
496

output : 

true 
false 
false 
true 

*/


