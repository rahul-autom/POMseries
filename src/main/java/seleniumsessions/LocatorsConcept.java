//Selenium 5
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a webelement+perform an action on it(click, sendkeys, gettext, isDisplayed)
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2
		/*
		 * WebElement emailId=driver.findElement(By.id("input-email")); WebElement
		 * password=driver.findElement(By.id("input-password"));
		 * emailId.sendKeys("test@gmail.com"); password.sendKeys("test@123");
		 */
		//3 By locator
		//By username=By.id("input-email");
		//By pwd= By.id("input-password");
		//WebElement emailId=driver.findElement(username);
		//WebElement password=driver.findElement(pwd);
		//emailId.sendKeys("test@gmail.com");
		//password.sendKeys("test@123");
		
		//4. By locator approach with some utility
		/*
		 * By username=By.id("input-email"); By pwd=By.id("input-password");
		 * 
		 * WebElement emailId=getElement(username); WebElement password=getElement(pwd);
		 * emailId.sendKeys("test@gmail.com"); password.sendKeys("test@123");
		 */
		//5. By locator with element util and action util:
		/*
		 * By username=By.id("input-email"); By pwd=By.id("input-password");
		 * 
		 * doSendKeys(username, "test@gmail.com"); doSendKeys(pwd, "test@123");
		 */

//6. 	By locator and create a common util class for elements:
		//Page By Locators: OR-Object Repository
		//WebElement Repository or Locator Repository
//		By username=By.id("input-email"); 
//		By pwd=By.id("input-password");
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
		
//7. BrUtil+eleUtil
//8. By util+String locators
		String username_id="input-email";
		String pwd_id="input-password";
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys("id", username_id, "anu@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "anu@123");
		
		//string-->by-->webelement-- action--2nd
		//by -- webelement -- action-- 1st
		//webelement -- action--3rd
		
	}
	
	  public static WebElement getElement(By locator) { return
	  driver.findElement(locator); }
	  
	  public static void doSendKeys(By locator, String value) {
	  getElement(locator).sendKeys(value); }
	 
		
	}


