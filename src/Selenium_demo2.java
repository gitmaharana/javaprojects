import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_demo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		WebDriver driver = new ChromeDriver(capability);
		//WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");
		String demo1 = driver.getTitle();
		System.out.println("Title of the webpage is:" +demo1);
	
	   //locate User name by ID
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//locate Password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//locate login by Class
        driver.findElement(By.className("submit-button")).click();
        
        //maximize the window
        driver.manage().window().maximize();
        
        //Switch to different window
       String currentwindowhandle = driver.getWindowHandle();
       driver.switchTo().window(currentwindowhandle);
       
       //now you can access current web element of new window
       //driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
       
       
       //If you need all the elements of new window
       List <WebElement> elementlist = driver.findElements(By.partialLinkText("Sauce"));
       
       System.out.println("Size of the Web Element is: " +elementlist.size());
       
      for(WebElement a:elementlist)
    	  
       {
    	   System.out.println(a.getText());// Get text method to print the elements
       }
        
        //wait time - 5 seconds// Java inbuilt wait method
        Thread.sleep(5000);
		
		
		//String demo3 = driver.getCurrentUrl();
		//System.out.println("CurrentUrl of the webpage is:" +demo3);

		//String demo4 = driver.getPageSource();
		//System.out.println("PageSource of the webpage is:" +demo4);

		driver.close();

	}

}
