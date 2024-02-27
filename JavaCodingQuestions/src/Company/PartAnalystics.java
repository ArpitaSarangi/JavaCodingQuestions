package Company;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartAnalystics {
	
	@Test
	public void m1() {
		
		/*https://tutorialsninja.com/demo/
		
		Script:
		    - Read input data from Excel file
			- Click on Cameras on the Top Navigation Bar
			- Click on Nikon D300 when the page loads
			- Click on the Add to Cart button
			- Compare Product Code value to be: "Product 4"
			- Compare Availability to be: "In Stock"
			- Compare Price to be $80
			- Click on Add to cart
			- Click the Items button in the header, then click Checkout
			- Choose Guest Checkout -> Continue
			
		Test Case 9.xlsx
		has context menu
		*/
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("//https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Cameras")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Nikon D300")).click();
		
		
		
		
		
	}

}
