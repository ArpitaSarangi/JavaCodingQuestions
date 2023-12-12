package StringPrograms;

import java.util.Scanner;

public class ReverseStringWIthSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String old="Interview";
		/*char[] oldString=old.toCharArray();
		int stringsize=oldString.length;

		System.out.println(oldString);
		char[] reverseString=new char[stringsize];

		for(int i=0;i<stringsize;i++) {
			reverseString[i]= oldString[stringsize-i-1];
		}
		System.out.println(reverseString);
		String newString=new String(reverseString);
		System.out.println(newString);
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String old=sc.nextLine();

		String reverseString[] = new String[old.length()];
		for(int i=0;i<old.length();i++) {		
			
			reverseString[i]=old.charAt((old.length())-i-1)+" ";
			System.out.print(reverseString[i]);
		}


	}

}
