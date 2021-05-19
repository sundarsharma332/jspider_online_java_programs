import java.util.*;

class CharUserInput
{
	public static char[] ReadCharecterFromUser(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char CharArray[] = new char[n];
		for(int i = 0; i < n; i++){
			CharArray[i] = sc.next().charAt(0);
		}
		return CharArray;
	}
	public static void PrintCharatcter(char [] charArray){
		for(char ch : charArray){
			System.out.print(ch + " ");
		}
	}
	public static void main(String[] args) 
	{
		char [] charArray = ReadCharecterFromUser();
		PrintCharatcter(charArray);
	}
}
