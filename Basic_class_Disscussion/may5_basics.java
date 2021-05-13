// May - 05 2021 (Imtiyaz sir - Programing class)
/*
Break : use to break the loop
System.exit(0) : used to terminate the program
return : used to send the controller back to the caller.
continie: it is used to take the control back to the loop

*/
// public class Main {
//     public static void main(String args[]) {
//         int flag = 1;
//         for(int i = 0; i <= 100; i++){
//             if(i % 2 == 0){
//                 System.out.print("hello world");
//                 return;
//             }
//         }
//         System.out.println("hello jspiders");
//     }
// }

// 1. program to print the Hello WWorld and Hello Jspiders only once , by user choice
// public class Main {
//     public static void main(String args[]) {
//         boolean flag = true;
//         for(int i = 1; i <= 100; i++){
//             if(i % 2 == 0){
//                 System.out.println("hello world");
//                 flag = false;
//                 break;
//             }
//         }
//         if(flag){
//             System.out.println("hello jspiders");
//         }
        
//     }
// }
/*
we can initilize flag to any other data types , for the best programming practice
we use the flag variable.
falg is the way to controling the program.

*/

/*
--Nested For loop 
--------------
code down bellow
*/

/*

public class Main {
    public static void main(String args[]) {
        boolean flag = true;
        for(int i = 1; i <= 5; i++){
            for(int j = 10; j <= 15; j++){
                System.out.println("i is " + i + " j is  " + j); 
                // after this block of code executes then it will go to j++; seond for loop.
            }
            System.out.println();
        }
    }
}
*/
/*
op : 
i is 1 j is  10
i is 1 j is  11
i is 1 j is  12
i is 1 j is  13
i is 1 j is  14
i is 1 j is  15

i is 2 j is  10
i is 2 j is  11
i is 2 j is  12
i is 2 j is  13
i is 2 j is  14
i is 2 j is  15

i is 3 j is  10
i is 3 j is  11
i is 3 j is  12
i is 3 j is  13
i is 3 j is  14
i is 3 j is  15

i is 4 j is  10
i is 4 j is  11
i is 4 j is  12
i is 4 j is  13
i is 4 j is  14
i is 4 j is  15

i is 5 j is  10
i is 5 j is  11
i is 5 j is  12
i is 5 j is  13
i is 5 j is  14
i is 5 j is  15
*/


// public class Main {
//     public static void main(String args[]) {
//         boolean flag = true;
//         for(int i = 1; i <= 5; i++){
//             for(int j = 10; j <= 15; j++){
//                 System.out.println("i is " + i + " j is  " + j); 
//                 return; -> went back to the caller
//                 break; // break the loop
//                 System.exit(0); // terminate the program.
//                 // after this block of code executes then it will go to j++; seond for loop.
//             }
//             System.out.println();
//         }
//     }
// }

/*
i is 1 j is  10

i is 2 j is  10

i is 3 j is  10

i is 4 j is  10

i is 5 j is  10
*/
// public class Main {
//     public static void main(String args[]) {
//         int c = 0, a= 0;
//         boolean flag = true;
//         for(int i = 1; i <= 5; i++){
//             for(int j = 10; j <= 15; j++){
//                 System.out.println("hello Qspiders");
//                 c++;
//                 break;
//             }
//             if(i % 2 == 0)
//             System.out.println("hello Jspiders");
//             a++;
//             break;
//         }
//         // System.out.print(c + " " + a);
//         System.out.println("Welocme to Programming");
//     }
// }

// public class Main {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 5; i++){
//             for(int j = 10; j <= 15; j++){
//                 System.out.println("hello Qspiders");
//                 break;
//             }
//             if(i % 2 == 0){
//                 System.out.println("hello Jspiders");
//                 return;
//             }
//             }
//         System.out.println("Welocme to Programming");
//     }
// }

// Anyting bellow System.exit(0), does not show the error , its Jvm thing
// terminating the program is runtime activity.


// public class Main {
//     public static void main(String args[]) {
//         boolean flag = true;
//         for(int i = 1; i <= 5; i++){
//             for(int j = 10; j <= 15; j++){
//                 System.out.println("hello Qspiders");
//                 flag = false;
//                 break;
//             }
//             if(flag){
//                 System.out.println("hello Jspiders");
//             }
//             }
//         System.out.println("Welocme to Programming");
//     }
// }
// Every time the flag remain false , so only 5 times the hello Qspider will be printed + the last line will printed

// public class Main {
//     public static void main(String args[]) {
//         boolean flag = true;
//         for(int i = 1; i <= 5; i++){
//             for(int j = 10; j <= 15; j++){
//                 System.out.println("hello Qspiders");
//                 flag = false;
//                 break;
//             }
//             if(flag){
//                 System.out.println("hello Jspiders");
//             }
//             }
//         System.out.println("Welocme to Programming");
//     }
// }



// method concepts
// create a method called disp , accepts two integer and return boolean value.

// static void sample(int a , int b){
//     if(a == b){
//         return false;
//     }else{
//         return true;
//     }
// }
// sample(1, 3) // calling from other methods

//Method example
// class Main{
//     public boolean isoddEven(int num){
//         return num % 2 == 0 ? true : false;
//     }

// public static void main(String[] args){
//     int num = 40;
//     if(isoddEven(num)){
//         sop("num is even");
//     }else{
//         sop("num is odd");
//     }
// }
// }

// terenary operator


// return if num % 2 == 0 ? true : false;