package ListPrograms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
//		 driver.get("https://www.wikipedia.org/");
//		 
//		 List<WebElement> links=driver.findElements(By.tagName("a"));
//		 
//		 for(WebElement s:links) {
//			System.out.println(s.getText()); 
//		 }
//
//		 
//		if(!links.isEmpty()) {
//			links.get(0).click();
//		}
//		 
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> divElements=driver.findElements(By.tagName("div"));
		
		System.out.println(divElements.size());
		
		
		Set<String> classNames=new  HashSet<String>();
		
		for(WebElement div:divElements) {
			String classname=div.getAttribute("class");
			if(classname!= null && !classname.isEmpty()) {
				classNames.add(classname);
				System.out.println(classname);
			}
		}
		System.out.println(classNames.size());
		
		
		 
		 driver.quit();
	}

}
