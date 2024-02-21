import java.util.ArrayList;
import java.util.Arrays;

public class C2 {

	public static void main(String[] args) {

		String s = "java sel java test sel";
		// Output: java sel test

		String[] words = s.split(" ");
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(words));

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if ((al.get(i).contains(al.get(j)))) {
					System.out.println("Unique word : " + al.get(i));					
				}
			}
		}

	}

}
