import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_Tooltip2 {

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
		
		//locate WebElement for Tooltip hyperlink
		String actmsg = driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
		
		String expmsg = "ThemeRoller: jQuery UI's theme builder application";
		
		if(actmsg.equals(expmsg))
		{
			System.out.println("Testing is passed");
		}
		else
		{
			System.out.println("Testing is failed");
		}
		
		driver.quit();
	}

}
