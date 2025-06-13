package ExceptionHandling;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownWithExceptionHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		WebElement element=driver.findElement(By.name(""));

		Select select=new Select(element);
		//select.se


		try {

			//Step 1: Navigate to the jQuery UI Select Menu page
			driver.get("https://jqueryui.com/selectmenu/");

			//Step 2: Switch to the iframe where the dropdown is present
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

			//Step 3: Locate and click the custom dropdown to open options
			WebElement dropdown=wait.until(ExpectedConditions.elementToBeClickable(By.id("speed-button")));

			dropdown.click();

			System.out.println("Dropdown clicked successfully!!");

			//Step 4: Get the list of available options
			List<WebElement> options=driver.findElements(By.xpath("//ul[@id='speed-menu']//li"));
			
			
			if(options.isEmpty()) {
				throw new NoSuchElementException("No options found in dropdown. ");
			}

			//Step 5: Select an option dynamically(Example: Select 'Fast')
			boolean optionSelected = false;
			for(WebElement option: options) {
				if(option.getText().equalsIgnoreCase("Fast")) {
					option.click();
					System.out.println("Option 'fast selected successfully");
					optionSelected= true;
					break;
				}
			}

			if(!optionSelected) {
				throw new NoSuchElementException("Desired option not found in the dropdown. ");
			}
		}catch(TimeoutException e) {
			System.out.println("Error : Page took too long to load. ");
		}catch(NoSuchElementException e) {			
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			//close browser
			driver.quit();
			System.out.println("Browser closed");
		}

	}

}
