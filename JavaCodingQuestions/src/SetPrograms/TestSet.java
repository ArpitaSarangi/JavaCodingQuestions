package SetPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> fruts=new TreeSet<String>();
//		
//		
//		fruts.add("Apple");
//		fruts.add("Mango");
//		fruts.add("Banana");
//		fruts.add("Orange");
//		fruts.add("Apple2");
//		fruts.add("Banana2");
//		fruts.add("Banana2");
//		fruts.add("Orange2");
//		//fruts.clear();
//		
//		System.out.println(fruts.contains("Orange2"));
//		
//		System.out.println(fruts);

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		
		
		System.out.println("Total a tags count :"+elements.size());
		
		Set<String> tagNames=new HashSet<>();
		
		for(WebElement tag:elements) {
			String tagName=tag.getText();
			if(!tagName.isEmpty()) {
				System.out.println(tagName);
				tagNames.add(tagName);
			}
		}
	
		System.out.println("*************************************************************");
		System.out.println("Total unique a tags count :"+tagNames.size());
	
			
		for(String tagName:tagNames) {
			System.out.println(tagName);
		}
		
		driver.quit();
		
		
	}

}
