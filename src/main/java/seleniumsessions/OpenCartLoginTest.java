package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=brUtil.getPageTitle();
		System.out.println(title);
		By username = By.id("input-email");
		By pwd=By.id("input-password");
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(pwd, "shweta@123");
		//br
	}

}
