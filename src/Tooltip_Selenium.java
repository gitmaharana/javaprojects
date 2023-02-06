import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Tooltip_Selenium {

	public static void main(String[] args) {

		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		//Launch Chrome driver URL
		driver.get("https://testautomationpractice.blogspot.com/");

		//Maximize the window
		driver.manage().window().maximize();

		//implicit wait time of 3 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//locate the tooltip webelement and go for attribute element
		String actualmsg = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		System.out.println(actualmsg);
		
		String expectedmsg = "We ask for your age only for statistical purposes.";
		
		if (actualmsg.equalsIgnoreCase(expectedmsg))
		
		{
			System.out.println("Testing is now passed");
		}
		else
		{
			System.out.println("Testing is failed");
		}
		
		driver.close();
	}

}
