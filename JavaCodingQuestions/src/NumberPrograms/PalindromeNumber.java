package NumberPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check Palindrome or not.");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sameNumber=number;
		int reversedNumber=0;		
		while(sameNumber>0) {
			reversedNumber=sameNumber%10 + reversedNumber*10;
			sameNumber=sameNumber/10;
		}		
		if(number==reversedNumber) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}

	}

}
