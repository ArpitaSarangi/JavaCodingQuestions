package ExceptionHandling;

import java.time.Duration;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomExceptionExample {
	static WebDriver driver;
	
	public static void setupDriver() {
		try {
			//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); //Update path
			driver=new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch(SessionNotCreatedException e) {
			System.out.println("Error: SessionNotCreatedException - WebDriver version mismatch! ");
			throw e;
		}catch(WebDriverException e) {
			System.out.println("Error: WebDriverException - Unable to launch browser!");
			throw e;
		}
		
	}

	public static void main(String[] args) {
		CustomExceptionExample.setupDriver();

	}

}
