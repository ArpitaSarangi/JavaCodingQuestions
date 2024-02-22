package StringPrograms;


public class DuplicateWords {

	public static void main(String[] args) {
		//String sentence = "You are the greatest you the person I know you in my life. You will be the best";
		String sentence="Arpita is a manual tester and automation tester";
		sentence=sentence.toLowerCase();
		String words[] = sentence.split(" ");
		int count ;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j]="0";				
				}
			}

			if(count>1 && words[i]!="0") {
				System.out.println("Duplicate words are: " + words[i] + " & their Count :" + count);
				
			}
		}
		
	}

}
