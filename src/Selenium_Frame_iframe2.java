import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_Frame_iframe2 {

	public static void main(String[] args) {

		//Launch Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_new\\chromedriver.exe");
		
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);
	

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
		 
		//you can switch to frame by using index / name /Webelement
		
		//Switch to main frame using index -zeroth index attribute
		//driver.switchTo().frame(0);
		
		//Switch to main frame using name attribute
		//driver.switchTo().frame("packageListFrame");
		
		//Switch to main frame using Webelement attribute
		WebElement newframe = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(newframe);
		
		//Locate webelement for iframe element
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		System.out.println("WebElement located and click action performed");
		
		//you can't directly switch any other frame from frame1 - hence you need to switch back to mainframe/immediate parent frame
		
		//Switch to main frame
		driver.switchTo().defaultContent();//switching to main frame
		//driver.switchTo().parentFrame(); // switching to immediate parent frame
		
		//switch to iframe2 using index
		driver.switchTo().frame(1);
		
		//locate WebElement in iframe2 using linktext
		driver.findElement(By.linkText("Alert")).click();
		System.out.println("2nd iframe WebElement located and click action performed");
		
		// How many iframes in this webpage and print the same
		//switch back to  main frame or default content
		driver.switchTo().defaultContent();//switching to main frame
		
		int numberofiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total size of the iframes are:" +numberofiframes);
		
		// Total frame count will be 0 if you search for iframes from anyother iframe except main frame - hence switch to parent frame
		
		
		
		
	}

}
