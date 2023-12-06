package StringPrograms;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String words[]=sentence.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
			
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
				if(count>1 && words[i]!="0")	{
					System.out.println(words[i]);
					System.out.println(count);
				}
		}
	}

}
