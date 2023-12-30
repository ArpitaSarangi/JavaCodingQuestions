package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		System.out.println("Enter any string:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String words[] = sentence.split(" ");
		ArrayList<String> a1=new ArrayList<String>(Arrays.asList(words));		
		for (int i = 0; i < a1.size(); i++) {
			
			for (int j = i + 1; j < a1.size(); j++) {

				if (a1.get(i).contains(a1.get(j))) {
				
					System.out.println("Duplicate words are: "+ a1.get(i));
				}
			}
			
		}
	}

}
