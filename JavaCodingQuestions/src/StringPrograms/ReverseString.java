package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
				//your code goes here
				//reverse string: ereh seog edoc ruoy
		
				System.out.println("Enter your string:");
				Scanner sc=new Scanner (System.in);
				String org=sc.nextLine();
				String revString=" ";
				
				for(int i=org.length()-1;i>=0;i--){
				    revString+=org.charAt(i);
				}
				
				System.out.println("Reversed String :"+revString);

	}

}
