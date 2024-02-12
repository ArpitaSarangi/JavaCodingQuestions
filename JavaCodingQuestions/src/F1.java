import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1 {

	/*public static double average(int a, int b) {

		return (double) (a + b) / 2;
	}
*/   //madam check:madam 
	//output:true/false

	/*public boolean isPalindrom(String str){
	String m=str;
	String revString="";


	for(int i=0;i<=m.length()-1;i++){
	revString=revString+m.charAt(m.length()-1-i);
	}


	if(revString.equalsIgnoreCase(m)){
	return true;
	}else{
	return  false;
	}


	}*/
	
	
	public static void main(String[] args) {
		F1 f=new F1();
		
		//System.out.println(f.isPalindrom("Madama"));
		
		//{12, 35, 1, 10, 34, 1}
		//Write a program to find the second largest number in the array, 
		//without sorting the array
		
		/*String s="Arpita is a manual tester & Arpita is an automation tester ";
		
		String[] arr=s.split(" ");
		
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			 for(int j=i+1;j<=arr.length-1;j++) {
				 
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					count++;
					
				}
			
			 }
		}
		System.out.println(count);
		
		*/
		
		
		//System.setProperty("webdriver.chrome.driver"," D://SOFTWARES/chromedriver.exe");
		
		
		//System.out.println(average(2,1));
		/*WebDriver driver=new ChromeDriver();
		driver.get(" URL ");
		driver.getTitle();
		driver.findElement(By.xpath(" xath")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		Iterator<String> it=windowIDs.iterator();
		 
		it.next();
		if("Arpita"  ) {
			break;
		}
	
		driver.switchTo().window(default id);
		driver.quit();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(win)
		
		*/
	}

}
