import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Datepicker2 {

	public static void main(String[] args) throws InterruptedException {

		String expecteddate = "10";
		String expectedmonthyear = "July 2023";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_new\\chromedriver.exe");

		//Launch Chrome Driver
		WebDriver driver = new ChromeDriver();

		//Launch URL
		driver.navigate().to("https://www.redbus.in/");

		//maximize the browser
		driver.manage().window().maximize();

		//No iframe present in the webelement

		//locate datepicker webelement & perform click action
		WebElement dateelement = driver.findElement(By.xpath("//span[@class ='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		dateelement.click();

		//locate Month & Year webelement and if not match with expected Month & Year then click on next option

		while(true)// condition if locater datepicker match with  expected month & year
		{
			String calendermonthyear = driver.findElement(By.xpath("//td[@class ='monthTitle']")).getText();//will return month & year

			{
				if(calendermonthyear.equals(expectedmonthyear))
				{
					List <WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
					System.out.println("Total size is:"+daylist.size());

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
					driver.findElement(By.xpath("//td[@class ='next']")).click();

				}
			}


		}

		System.out.println("Expected date has been selected");
		Thread.sleep(5000);
		driver.quit();

	}

}
