// java program to print 1 to 5 without using loops
// using recursion.

class test 
{
	public static void print(int i){
		if(i <= 5){
			System.out.println(i); //1 2 3 4 5 
			print(++i);
			System.out.println("inside if"); //
		}
		System.out.println("outside if"); //
		
	}
	public static void main(String[] args) 
	{
		print(1);
	}
}


// recursion is approach of solving problems by calling function itself, 
// while solving recursion problems we have to take care of base conditons or
// exit conditions , otherwise it will lead to stackoverflow error.



// In recursion the method dont go back to main function , it simply goes to
// pervious caller.


/*

The output of the above program is 1 2 3 4 5 hello hello hello hello hello hello

in this hello is printed 6 times, its because , in the last recursion call of above
program , the i has value of 5 and then, the print(5 + 1) will called again and then
the else part of this program will executed.
*/



