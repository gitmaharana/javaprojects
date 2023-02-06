import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_NewWindow {

	public static void main(String[] args) {
		
		//Launch chrome driver.c
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		
		//Launch WebDriver
		WebDriver driver = new ChromeDriver ();
		
		//Launch URL
		driver.navigate().to("https://www.google.com/");
		
		//capture the title of the  URL
		System.out.println("Name of first tab is :"+driver.getTitle());
		 
		//Open a new tab
		//driver.switchTo().newWindow(WindowType.TAB);// use this method to open a new TAB
		driver.switchTo().newWindow(WindowType.WINDOW);// use this method to open a new Window
		
		//Launch 2nd URL
		driver.navigate().to("https://www.facebook.com/");
		
		//capture the title of the  URL
		System.out.println("Name of second tab is :"+driver.getTitle());
		
	
		//driver.quit();// close all the windows
		
		//Get window handles of open window
		Set <String> windowhandles = driver.getWindowHandles();
		List <String> handles = new ArrayList <String>();// List the strings in list
		handles.addAll(windowhandles);
		
		driver.close();// close current facebook window
		
		//To get the driver back to first window - Google
		driver.switchTo().window(handles.get(0));// zero means first window - switch to Google
		System.out.println ("Current active window of driver is" +" " +driver.getTitle());
		
		driver.quit();

	}

} 
