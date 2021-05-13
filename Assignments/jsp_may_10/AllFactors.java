import java.util.*;

class AllFactors {
    
    static void AllFactors(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 1; i <= tc; i++){
            int num = sc.nextInt();
            AllFactors(num);
        }
    }
}

input : 

3
12 13 14
 

output :
1 2 3 4 6 12 
1 13 
1 2 7 14 
