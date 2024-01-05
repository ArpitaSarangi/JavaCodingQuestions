package StringPrograms;

public class SwapFirstlastLetterOfEachWordInAString {

	public static void main(String[] args) {

		// This is a good day , Thank you

		// shiT si a doog yad , khanT uoy
		String old = "This is a good day , Thank you";

		String[] arr = new String[old.length()];

		for (int i = 0; i < old.length(); i++) {
			
			arr = old.split(" ");//This
			
			char[] c = new char[arr[i].length()];
			for (int j = 0; j < arr[i].length(); j++) {

				if (j == 0 || j == arr[i].length() - 1) {
					c[j] = arr[i].charAt(arr[i].length() - 1 - j);
				} else {
					c[j] = arr[i].charAt(j);
				}

				// System.out.print(c[j]);
			}

			String newValue = new String(c);
			System.out.println(c);

		}
		
	}

}
