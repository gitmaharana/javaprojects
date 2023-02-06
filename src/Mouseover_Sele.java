import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class Mouseover_Sele {

	public static void main(String[] args) throws InterruptedException {


		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		//launch web browser
		driver.navigate().to("https://demoqa.com/buttons");
		//driver.get("https://demoqa.com/buttons");

		//implicit wait for all the statements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//maximize the browser
		driver.manage().window().maximize();

		//locate webElement for Double click button using xpath
		WebElement dclick = driver.findElement(By.xpath("//button[@id = 'doubleClickBtn']"));

		// Create an object for actions class
		Actions act = new Actions(driver);

		//Double click action
		act.doubleClick(dclick).build().perform();
		System.out.println("double click is done");

		//locate webElement for right click button using xpath
		WebElement rightclik = driver.findElement(By.xpath("//button[@id = 'rightClickBtn']"));

		//right click action using context click method
		act.contextClick(rightclik).build().perform();
		System.out.println("Right click is done");

		driver.close();

	}

}
