import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_radiobutton {

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

		//Locate radio button webelement

		List <WebElement> radiolist = driver.findElements(By.xpath("//input[@class='multiple_choice']"));

		System.out.println ("Size of the radio list is :" +radiolist.size());

		for(WebElement rd:radiolist)
		{ 
			System.out.println("Radio buttons are :" +rd.getText());
		}


	}

}
