package StringPrograms;


public class PalindromeString {
	public boolean checkPalindrome(String original) {
		String reverse = "";
		for (int i = 0; i <= original.length() - 1; i++) {
			reverse += original.charAt(original.length() - 1 - i);
		}
		System.out.println("Reverse String:" + reverse);
		if (original.equalsIgnoreCase(reverse)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String original = "madam";
		PalindromeString p = new PalindromeString();
		System.out.println(p.checkPalindrome(original));
	}
}
