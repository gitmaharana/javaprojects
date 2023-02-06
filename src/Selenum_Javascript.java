import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Selenum_Javascript {

	public static void main(String[] args) {
		// Using JavaScript interface we can execute Javascripts in Selenium


		//Launch chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");

		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		//Launch Chrome driver URL
		driver.get("http://www.uitestpractice.com/Students/Index");

		//maximize the window
		driver.manage().window().maximize();

		//typecast Javascriptexecutor to perform any action
		//WebDriver does not have access to JavaScriptExecutor so to use in MultiBrowser

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Enter text in textbox
		js.executeScript("document.getElementById('Search_Data').value='Aliya';");
		System.out.println("Text has  now been entered");

		//locate Webelement and click find button
		WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
		js.executeScript("arguments[0].click();", element);
		System.out.println("Find button clicked and data returned");

		//refresh browser
		js.executeScript("history.go(0)");
		System.out.println("WebPage is now refreshed.");

		//get domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name is:" +domain);

		//get title name
		String title1 = js.executeScript("return document.title;").toString();
		System.out.println("Title name is:" +title1);

		//get URL name
		String urlname = js.executeScript("return document.URL;").toString();
		System.out.println("Domain name is:" +urlname);

		//draw border around webelement
		js.executeScript("arguments[0].style.border = '3px solid red';", element);
		System.out.println("3pixel solid red border created");

		//Zoom 50%
		js.executeScript("document.body.style.zoom = '50%'");
		System.out.print(js.executeScript("return window.innerHeight").toString());
		System.out.println(js.executeScript("return window.innerWeight").toString());

		//scroll vertically till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("page scrolling vertically down");

		//scroll vertically page up
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("page scrolling vertically up");

		//generate pop-up alert
		js.executeScript("alert('This is an alert message');");
		System.out.println("Alert message printed");

		//Navigate different page using Java script
		js.executeScript("window.location = 'www.google.com'");









	}

}
