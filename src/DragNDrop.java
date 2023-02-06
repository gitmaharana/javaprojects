import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class DragNDrop {

	public static void main(String[] args) {
	
		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);
		
		//Launch Web Browser
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//In drag & drop u need to locate drag WebElement and drop web element
		//locate drag web element using xpath
		WebElement dragsrc= driver.findElement(By.xpath("//div[@id='box6']"));
		
		//Locate drop element - 
		WebElement droptrg = driver.findElement(By.xpath("//div[@id = 'box106']"));
		
		//Create object for Actions class
		Actions act = new Actions(driver);
		
		//Call drag and  drop actions method
		act.dragAndDrop(dragsrc, droptrg).build().perform();

		System.out.println("Drag and  drop  action is  now  completed");
		
		
		
		
		
	
		
		
		

	}

}
