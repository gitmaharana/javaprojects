import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Datepicker {

	public static void main(String[] args) throws InterruptedException {

		String expecteddate = "10";
		String expectedmonth = "November";
		String expectedyear = "2023";

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_new\\chromedriver.exe");

		//Launch Chrome Driver
		WebDriver driver = new ChromeDriver();

		//Launch URL
		driver.navigate().to("https://jqueryui.com/datepicker/");

		//maximize the browser
		driver.manage().window().maximize();
		
		//date picker is in iframe so we have to switchTo iframe so access the webelement
		driver.switchTo().frame(0);
		
		//locate datepicker webelement & perform click action
		WebElement dateelement = driver.findElement(By.id("datepicker"));
		dateelement.click();

		//locate Month & Year webelement and if not match with expected Month & Year then click on next option

		while(true)// condition if locater datepicker match with  expected month & year
		{
			String calendermonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();//will return month
			String calenderyear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();//will return month

			{
				if(calendermonth.equals(expectedmonth) && calenderyear.equals(expectedyear))
				{
					List <WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
					
					{
						for(WebElement dates:daylist)
						{
							String calenderday = dates.getText(); //returns text date values
							if(calenderday.equals(expecteddate))
							{
								dates.click();
								break; // date matched - exit from loop
							}
						}
					}break;
				}
				else 
				{
					driver.findElement(By.xpath("//span[@class ='ui-icon ui-icon-circle-triangle-e']")).click();
			
				}
			}
			
					
		}

		System.out.println("Expected date has been selected");
		Thread.sleep(5000);
		driver.quit();
	}

}
