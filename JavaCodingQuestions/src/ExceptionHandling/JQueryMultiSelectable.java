package ExceptionHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryMultiSelectable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		try {
			//Step 1: Navigate to the JQuery UI Selectable page 
			driver.get("https:jquery.com/selectable/");
			
			
			//Step 2:Switch to iframe where the Selectable items are located
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
			
			//Step 3: Locate the Selectable items
			List<WebElement> items=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ol[@id='selectable']/li")));
			
			if(items.size()< 3) {
				throw new NoSuchElementException("Not enough selectable items found. ");
			}
		}catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}finally {
			driver.quit();
			System.out.println("Browser Closed");
		}
	}

}
