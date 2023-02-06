import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String demo1 = driver.getTitle();
		System.out.println("Title of the webpage is:" +demo1);

		String demo3 = driver.getCurrentUrl();
		System.out.println("CurrentUrl of the webpage is:" +demo3);
		
		//String demo4 = driver.getPageSource();
		//System.out.println("PageSource of the webpage is:" +demo4);
		
		driver.close();
	}

}
