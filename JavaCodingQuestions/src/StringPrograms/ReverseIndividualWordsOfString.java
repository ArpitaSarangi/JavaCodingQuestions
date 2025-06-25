package StringPrograms;

import java.util.Scanner;

public class ReverseIndividualWordsOfString {

	public static void main(String[] args) {

		//		Hello World
		//		Reverse Individual Words:olleH DlroW
		System.out.println("Enter any String:");
		Scanner sc=new Scanner(System.in);
		String org=sc.nextLine();
		
			String word[]=org.split(" ");
			
			for(int i=0;i<=word.length-1;i++) {

			char[] reverseWord=word[i].toCharArray();

			if(i!=word.length-1) {
			for(int j=reverseWord.length-1;j>=0;j--) {
				System.out.print(reverseWord[j]);	
			}
			System.out.print(" ");
			}else {
				for(int j=reverseWord.length-1;j>=0;j--) {
					System.out.print(reverseWord[j]);	
				}
			}
		}
	}

}
