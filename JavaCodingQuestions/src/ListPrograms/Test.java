package ListPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	
	public static void main(String[] args) {
		
		WebDriver driver ;
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("div"));
				int count=0;
	System.out.println(list.size());
		for(WebElement s:list) {
			String m=s.getText();
			if(!m.isEmpty()) {
				System.out.println(m);
				count++;
			}					
		}
		System.out.println("Total links: "+count);
		driver.quit();
	}

}
