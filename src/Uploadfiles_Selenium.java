import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class Uploadfiles_Selenium {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		//Launch Chrome browser
		driver.navigate().to("https://demoqa.com/upload-download");

		//Maximize the window
		driver.manage().window().maximize();

		//Implicit wait time of 5 seconds
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		//Locate upload file WebElement using xpath and share file path  to  upload the file.
		//driver.findElement(By.xpath("//input[@id = 'uploadFile']")).sendKeys("C:\\Users\\user\\Desktop\\newfile.txt");

		// If type element does not contain "File" value in Webpage then  you can't go with above option
		//Follow below method
		//Create an WebElement for "Upload file button"

		WebElement element = driver.findElement(By.xpath("//input[@class = 'form-control-file']"));
		//Use Actions method to click on upload file button
		Actions act = new Actions (driver);

		// Use Move to Element method to click perform action in upload file button
		act.moveToElement(element).click().perform();
		
		//Paste the file using keyboard action & using Robot class
		Robot rb = new Robot();
		rb.delay(3000);

		//Copy the file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\user\\Desktop\\newfile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// Keyboard press and release action perfrom - copy/paste & enter
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File has now been uploaded successfully");

	    driver.close();

	}

}