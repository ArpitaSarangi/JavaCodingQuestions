package Company;
import org.testng.annotations.Test;

public class PatternProgram_HCL {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		System.out.println("***");
		/*
		 * 	1
			22
			333
			4444
			55555
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
