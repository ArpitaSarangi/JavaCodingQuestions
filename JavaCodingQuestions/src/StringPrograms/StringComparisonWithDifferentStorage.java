package StringPrograms;

public class StringComparisonWithDifferentStorage {
	public static void main(String[] args) {
		String s1 = "Amit";
		String s2 = "amit";
		String s3 = new String("Amit");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
