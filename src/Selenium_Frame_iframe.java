import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frame_iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		//Switch to main frame
		driver.switchTo().frame("moneyiframe");
		
		//Locate webelement for iframe element
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println("Value of the NSE Index today is : " +nseindex);
		
 
	}

}
