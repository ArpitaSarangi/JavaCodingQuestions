package StringPrograms;

import java.util.Scanner;

public class ReverseStringWIthSpace {

	public static void main(String[] args) {

		//String old="Interview";
		//ReverseStringWIthSpace:w e i v r e t n I
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String old=sc.nextLine();

		String reverseString[] = new String[old.length()];

		//		for(int i=0;i<old.length();i++) {		
		//			reverseString[i]=old.charAt((old.length())-i-1)+" ";
		//			System.out.print(reverseString[i]);
		//		}

		for(int i=old.length()-1;i>=0;i--) {
			reverseString[i]=old.charAt(i)+" ";
			System.out.print(reverseString[i]);
		}

	}

}
