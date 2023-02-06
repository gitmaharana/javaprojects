import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_Xpathdemo {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		WebDriver driver = new ChromeDriver(capability);

		//Launch chrome browser
		driver.get("https://www.saucedemo.com/");

		//Maximum the browser
		driver.manage().window().maximize();

		//Locate user name using Xpath single attribute
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("standard_user");
		
		// locate user name using contains/starts-with/ends-with
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		// locate password using contains/starts-with/ends-with
		driver.findElement(By.xpath("//input[startswith(@name,'password')]")).sendKeys("secret_sauce");

		//Locate password using Xpath single attribute
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("secret_sauce");

		//Locate login buttn using Xpath attribute
		driver.findElement(By.xpath("//input[@name='login-button']")).click();

		//managing/handling another window
		String currentwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandle);

		//Locate/click on Sauce Lab Backpack image using Xpath locator - using Image
		driver.findElement(By.xpath("//img[@src= '/static/media/sauce-backpack-1200x1500.34e7aa42.jpg']")).click();

		//Locate/click add to cart option using xpath - using name
		//driver.findElement(By.xpath("//button[@name = 'add-to-cart-sauce-labs-backpack']")).click();

		//Locate/click add to cart option using Xpath multiple attribute  - OR option
		//driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'or @name='add-to-cart-sauce-labs-backpack']")).click();

		//Locate/click add to cart option using Xpath multiple attribute  - AND option
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'and @name='add-to-cart-sauce-labs-backpack']")).click();


		//Implicit wait time
		Thread.sleep(10000);

		System.out.println("All steps are now executed sucessfully..Good job");

		driver.close();



	}

}
