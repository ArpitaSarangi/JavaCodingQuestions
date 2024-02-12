import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindSpecialCharactersFromString {

	public int checkSpecialChar(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
				count++;
			}

		}
		return count;

	}

	public WebDriver instantiateBrowser(String browserName) {

		WebDriver driver = null;
		if (browserName == "Chrome") {
			driver = new ChromeDriver();
		} else if (browserName == "Edge"){
			driver = new EdgeDriver();
		}else if(browserName == "Firefox") {
			driver = new FirefoxDriver();	
		}

		return driver;
	}

	public static void main(String[] args) {
		// Print the count of Special characters in the given string
		String s = "dish$^$&hs9263";
		
		String [] strArray ={"b","b","b","a"};
		
		//strArray[1]=	" "
		//{"zz","zz","x"}
		
		//a-->b(*),i=0
		//b-->b,i=1
		//strArray[i]=	" ";{"a"," ","b","b"}
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(strArray));
		
		for(int i=0;i<al.size();i++) {
			if(!(al.get(i).contains(al.get(i+1)))) {
				System.out.println(al.get(i));
			}
			
		}

		FindSpecialCharactersFromString e = new FindSpecialCharactersFromString();

		System.out.println(e.checkSpecialChar(s));

		e.instantiateBrowser("Chrome");
	}

}
