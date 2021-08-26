package configuration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 
 */

/**
 * @author Mallesh
 *
 */
public class Webdriver
{
	public static WebDriver driver;
	
	
	public static WebDriver InitializeWebDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\W10-Dell\\Documents\\softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		return driver;
	}
	
	
	public static void QuitWebDriver()
	{
		
		driver.quit();
	}
}
