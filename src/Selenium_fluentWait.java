import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Selenium_fluentWait {

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

		//Fluent wait for 10 seconds - addition to explicit method
		FluentWait <WebDriver> wait = new FluentWait <WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))// polling means chek webelement is present or not every 5 secs till total timeout period 10min. 
				//Means it will check 2 times. if timeout period is 30sec & polling time is 5sec then element will check 6 times
				.withMessage("This is a custom message")// this step is optional
				.ignoring (NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING23")));
		element.click();

		/*//create Stopwatch object
		Stopwatch watch = null;

		//Use Until method which will return a WebElement - use try/catch block//after 10 secs WebElement will return
		try // you can add Stopwatch to map the timing
		{
			watch = Stopwatch.createStarted();// start stop watch
			//used until method..also to handle exception time you can put a wrong text START SELLING23
			
		}
		catch(Exception e)
		{
			watch.stop();//stop the watch
			System.out.println("Exception caught and handled");
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}*/


	}

}
