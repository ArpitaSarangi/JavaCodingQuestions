package StringPrograms;

public class Print1_100WithoutUsingAnyLoop {

	static void print(int a) {

		if (a > 0) {
			print(a - 1);
			System.out.println(a + " ");
		}

		return;
	}

	public static void main(String[] args) {
		// print 1-100 without using any loop

		print(100);
	}

}
