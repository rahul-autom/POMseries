package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

		static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
		
	String emailid=	driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(emailid);
		
		
//		String email=driver.findElement(By.id("input-email")).getText();
//		System.out.println(email);
		
		//getText: method cannot be applied to textbox. It can be applied to link, header, label, span
	}

}
