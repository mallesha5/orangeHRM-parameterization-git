/**
 * 
 */
package orange.HRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Mallesh
 *
 *
 * This class will store all the locators and methods of login page
 */
public class LoginPage 
{
	
	WebDriver driver;
	
	By username = By.name("username");
	
	By password = By.name("password");
	
	By loginBtn = By.className("orangehrm-login-button");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void loginToOrangeHRM(String uid, String pwd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}
	

}
