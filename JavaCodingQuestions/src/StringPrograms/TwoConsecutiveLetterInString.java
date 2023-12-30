package StringPrograms;

public class TwoConsecutiveLetterInString {

	public static void main(String[] args) {
		
		//Consecutive # 
		//ex- Welcome ## to Opentext 
		//ex- open##text
	
		String username1="Welcome ## to Opentext##";
		for (int i = 0; i < username1.length()-1; i++) {

			if (username1.charAt(i) == '#' && username1.charAt(i) == username1.charAt(i + 1)) {
				System.out.println(i);
			}
		}

	}

}
