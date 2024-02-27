package Company;
import java.util.*;

import org.testng.annotations.Test;

public class MindfireDigital {
	
	//Mindfire Digital

	@Test
	public void p1() {
		String s = "00013400";
		// Output: 13400
		String p = "";

		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == '0')) {

				continue;
			} else {
				p = s.substring(i, s.length() - 1);
				System.out.println(p);
				break;

			}
		}

	}

}
