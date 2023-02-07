import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenim_Alerts {

	public static void main(String[] args) {

		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);
		
		//Launch chrome browser
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait for 3 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Locate WebElement for simple alert
		driver.findElement(By.xpath("//button[@id ='alert']")).click();
		//Accept the alerts
		driver.switchTo().alert().accept();
		System.out.println("Simple alert popup accepted");
		
		//Locate webelement for confirmation alert
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		//Accept or dismiss the alerts
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("confirmtion alert popup dismissed");
		
		//Locate webelement for Prompt alert
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		// insert input values for prompt alert
		driver.switchTo().alert().sendKeys("Ronnie");
		//Accept the  prompt alert now
		driver.switchTo().alert().accept();
		System.out.println("Prompt alert popup value entered and accepted");
		
		driver.close();
		
		
	}

}
