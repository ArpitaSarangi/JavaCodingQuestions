package StringPrograms;

public class UniqueWordsInString {

	public static void main(String[] args) {
		String s="java sel java test sel";
		// Output: java sel test
		
		String[] words=s.split(" ");
		int count;
		
		for(int i=0;i<words.length;i++) {
			count=1;
			
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
				
			}
			
			if((count==1 || count>1) &&  words[i]!="0") {
				System.out.println("Unique word :"+words[i]);
			}
			
		}
		
		
	}

}
