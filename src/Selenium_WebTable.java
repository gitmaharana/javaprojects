import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_WebTable {

	public static void main(String[] args) {

		//Launch Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Launch chrome browser
		driver.get("file:///C:/Users/user/Desktop/webtable.html");

		//Maximize the browser window
		driver.manage().window().maximize();

		//to access number/size of rows
		List <WebElement> rowlist = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Size of row is :" +rowlist.size());

		//to access number/size of column
		List <WebElement> columnlist = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Size of row is :" +columnlist.size());


		//Access/print "Third Cell" from the Webtable
		String cell3 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println("Value of the third cell is:" + cell3);

		//to print all the  values in the webtable you need to use loops

		for(int r=2;r<=rowlist.size();r++) // this is  to print row values
		{
			for (int c=1;c<=columnlist.size();c++) // this is  to print column values
			{
				String cellvalue = driver.findElement(By.xpath("//table/tbody/tr ["+ r +"]/td["+ c +"]")).getText();
				System.out.println("All the cell values are :" +cellvalue);
			}
		}

		
		driver.close();
	}

}
