package StringPrograms;

public class PrintUniqueCharInAString {

	public static void main(String[] args) {

		// "Arpita Sarangi"
		// Print Unique char: p,t,s,n,g

		String s = "Arpita Sarangi";	
		s=s.toLowerCase();
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			for (int j = 0; j <= s.length() - 1; j++) {
				if (s.charAt(i)==(s.charAt(j)) && (i != j)){
					count++;
				}
			}
			if ((count == 1) && (s.charAt(i)!=' ')) {
				System.out.println("Unique characters are : "+s.charAt(i) + ":" + count);
			}
			
		}
		

	}
}