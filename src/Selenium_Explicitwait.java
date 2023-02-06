import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Selenium_Explicitwait {

	public static void main(String[] args) {

		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		//Launch Chrome driver URL
		driver.get("https://sellglobal.ebay.in/seller-center/");

		//Maximize the window
		driver.manage().window().maximize();

		//explicit wait time of 10 seconds
		// Explicit wait is for Webelement specific wait and can have conditions
		//You need to use WebDriverWait Class for explicit wait - call this class
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//create Stopwatch object
		Stopwatch watch = null;
		
		//Use Until method which will return a webelement - use try/catch block//after 10 secs webelement will return
		try // you can add stopwatch to map the timing
		{
			watch = Stopwatch.createStarted();// start stop watch
			//used until method..also to handle exception time you can put a wrong text START SELLING23
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING23")));
			element.click();
			
		}
		catch(Exception e)
		{
			watch.stop();//stop the watch
			System.out.println("Exception caught and handled");
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}




	}

}
