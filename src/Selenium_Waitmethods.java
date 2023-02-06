import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Selenium_Waitmethods {

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

		//implicit wait time of 3 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Stopwatch watch = null;// create object for stopwatch


		//locate WebElement for hyperlink
		//driver.findElement(By.linkText("START SELLING")).click();

		//provide an incorrect element to locate the exception and check the exception timing - use try/catch block
		try // you can add stopwatch to map the timing
		{
			watch = Stopwatch.createStarted();// start stop watch
			driver.findElement(By.linkText("wrong element")).click();//will throw exception "no such element found"
		}
		catch(Exception e)
		{
			watch.stop();//stop the watch
			System.out.println("Exception caught and handled");
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}

		// Explicit wait is for Webelement specific wait and can have conditions
		//You need to use WebDriverWait Class for explicit wait - call this class
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));










	}

}
