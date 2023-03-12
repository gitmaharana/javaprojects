import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Dropdown {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		WebDriver driver = new ChromeDriver(capability);

		//Launch chrome browser
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//Maximize the browser 
		driver.manage().window().maximize();
		
		//implicit wait or 10secs for all the statements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//locate dropdown element using id attribute
		WebElement element = driver.findElement(By.id("input-country"));
		
		//Use select class to locate the dropdown elements
		Select dropdown = new Select(element);
		
		//Select dropdown by value
	     dropdown.selectByValue("10");
	     
	   //Select dropdown by index 
	     dropdown.selectByIndex(2);
	     
	   //Select dropdown by visible text
	     dropdown.selectByVisibleText("Australia");
	     
	   //Print all the elements from dropdown
	     //  List  <WebElement>  alldrop = dropdown.getOptions();
	     
	     //for(WebElement e1 : alldrop )
	     //{
	     // System.out.println(" Size of the dropdown :" + alldrop.size());
	     //	 System.out.println(e1.getText());
	     // }
	    	  
	    	 
		
		
		
		
		
	}

}
