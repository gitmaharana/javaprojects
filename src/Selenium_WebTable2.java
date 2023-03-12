import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenium_WebTable2 {

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

		//locate web Element of webtable and identify Author name "Mukesh"
		String authname = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("Name of the  cell value is:" +authname);

		//size of the rows in  webtable
		List <WebElement> rowlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Size of the row is :" +rowlist.size());

		//size of the columns in  webtable
		List <WebElement> columnlist = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Size of the row is :" +columnlist.size());

		//Print all the values from the Webtable

		for(int r=2;r<=rowlist.size();r++)//
		{
			for(int c=1;c<=columnlist.size();c++)
			{
				String cellvalue = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"]")).getText();
				System.out.println(cellvalue);
			}
		}
		driver.close();


	}

}
