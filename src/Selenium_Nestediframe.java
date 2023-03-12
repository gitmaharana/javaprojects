import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Nestediframe {

	public static void main(String[] args) {

		//Launch Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_new\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);


		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.manage().window().maximize();
 
		//iframe1 is mainframe here
		driver.switchTo().frame("frame1");//switching to main frame or parent frame/outer frame - using id method
		driver.switchTo().frame("frame3");//switching to child frame//inner frame - using id method

		//locate the WebElement for checkbox
		driver.findElement(By.id("a")).click();
		System.out.println("Webelement identified and click action performed");

		//Switch back to mainframe or default content/parent frame
		driver.switchTo().parentFrame();

		//locate text box webelement and perform sendkeys action -  Using tagname
		driver.findElement(By.tagName("input")).sendKeys("Learning is tough");
		System.out.println("Webelement identified and sendkeys action performed in textbox");
		
		//switch to frame2 to click on dropdown
		driver.switchTo().defaultContent();// it will direct the driver to main webpage
		driver.switchTo().frame("frame2");
		
		//locate dropdown of frame2 using id attribute
		WebElement dropdownelement = driver.findElement(By.id("animals"));
		
		//use select class to select dropdown and select the text
		
		Select dropdown = new Select(dropdownelement);
		dropdown.selectByVisibleText("Avatar");
		System.out.println("Webelement identified and requesed value from dropdown selected");

		

	}

}
