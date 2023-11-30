package StringPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	System.out.println("Enter the String to check Palindrome or not:");	
	Scanner sc=new Scanner(System.in);
	String original=sc.nextLine();
	System.out.println("Original String:"+ original);
	
	//Converting String to Character Array
	char[] originalArray=original.toCharArray();
	
	//Reverse character Array
	char[] reverse=new char[original.length()];
	for(int i=0;i<=originalArray.length-1;i++) 
	{	
		reverse[i]=originalArray[originalArray.length-i-1];
	}
	
	//Converting Character array to String
	String reverseString=new String(reverse);
	System.out.println("Reverse String:" + reverseString);
	
	//Compare Original string with Reversed String
	if(original.equals(reverseString)) {
		System.out.println("String is Palidrome.");
	}else {
		System.out.println("String is not Palindrome.");
	}
	
	}

}
