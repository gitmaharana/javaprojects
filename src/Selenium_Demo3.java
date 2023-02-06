import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		WebDriver driver = new ChromeDriver(capability);
		// Navigate method to open any web page.
		driver.navigate().to("https://www.saucedemo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Get method to open a webpage
		driver.get("https://www.saucedemo.com");
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of the Webpage is " +title);
		
		// Locate User name by using CSSwSelector locator - using ID attribute
		driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("standard_user");
		
		// Locate password by using CSS Selector locator - using Type attribute
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("secret_sauce");
		
		// Locate password by using CSS Selector locator - using Class attribute
		//driver.findElement(By.cssSelector("input[type=password]")).sendKeys("secret_sauce");
		
		//Locate login button using CSS Selector locator - using Class attribute
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//managing/handling another window
		String currentwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandle);
		
		//Locate/click add to cart option using CSS Selector locator - using class
		//driver.findElement(By.cssSelector("button[id = add-to-cart-sauce-labs-backpack]")).click();
		
		//Locate/click on the image using CSS Selector locator - using class
		//driver.findElement(By.cssSelector("div.inventory_item_img]")).click();
		

		//Locate/click on Sauce Lab Backpack text using Xpath locator - using Class
		//driver.findElement(By.xpath("//div[@class = 'inventory_item_name']")).click();
		
		//Locate/click on Sauce Lab Backpack image using Xpath locator - using Image
		driver.findElement(By.xpath("//img[@src= '/static/media/sauce-backpack-1200x1500.34e7aa42.jpg']")).click();
		
		//Locate/click add to cart option using xpath - using name
		driver.findElement(By.xpath("//button[@name = 'add-to-cart-sauce-labs-backpack']")).click();
		
		Thread.sleep(10000);
		
		System.out.println("All steps are now executed sucessfully..Good job");
		
		driver.close();
		
		
		
		
		
		
		
	}

}
