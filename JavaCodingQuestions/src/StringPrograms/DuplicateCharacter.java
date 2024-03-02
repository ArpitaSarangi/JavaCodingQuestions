package StringPrograms;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// Count of each occurences
		String s = "Arpita Sarangi";
		String m = s.toLowerCase();

		char[] p = m.toCharArray();
		int count;

		for (int i = 0; i < m.length(); i++) {
			count = 1;
			for (int j = i + 1; j < m.length(); j++) {
				if (p[i] == p[j]) {
					count++;
					p[j] = ' ';
				}
			}
			if (count >= 1 && p[i] != ' ') {
				System.out.println("Duplicate words are: " + m.charAt(i) + " & their Count :" + count);

			}
		}

	}

}
