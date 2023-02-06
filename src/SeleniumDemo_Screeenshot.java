import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;


public class SeleniumDemo_Screeenshot {



	public static void main(String[] args) {
	
	//We capture screenshots in Selenium using getScreenshotAs() method of TakesScreenshot interface.
		
		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chromedriver_win321\\chromedriver.exe");
		
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);
		
		//launch web browser
		driver.navigate().to("https://www.saucedemo.com/");
		//driver.get("https://www.saucedemo.com/");
		
		//implicit wait for all the statements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//typecast the TakeScreenshot interface to driver object
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Create source file for screenshot
	    File srcFile = ts.getScreenshotAs(OutputType.FILE);
	    
	    //Create a destination file
	    
	    File destFile = new File("C:\\Users\\user\\Desktop\\Screenshot\\swaglogin.png");
	    
	    
	    
	    //copy the file from source to destination - copyFile() method is a static method present in FileUtils class of JAVA
	    
	   //FileUtils.copyfile(srcFile,destFile);

	}

}
