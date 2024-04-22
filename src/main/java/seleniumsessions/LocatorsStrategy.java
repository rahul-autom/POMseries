package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register"); 
		
		//1. id: unique attribute: cannot be duplicate -- 1st
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");  
		
		//2. name:can be duplicate -- 2nd
//		driver.findElement(By.name("firstname")).sendKeys("test");
//		driver.findElement(By.name("lastname")).sendKeys("automation");
		
//		By fn=By.name("firstname");
//		By ln=By.name("lastname");
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "automation");
		
		//3. class name: it's not unique attribute, can be duplicate --3rd
		// driver.findElement(By.className("form-control")).senKeys("testing");
		
		//4. xpath: it's not an attribute: address of the webelement in HTML DOM
		//XML PATH
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
		//driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
//		By fn=By.xpath("//*[@id=\"input-firstname\"]");
//		By ln=By.xpath("//*[@id=\"input-lastname\"]");
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "testing");
//		eleUtil.doSendKeys(ln, "automation");
		
		//5. css: cascaded style sheet: it's not an attribute
		//driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
		
		//6. linktext: only for links: for the text of the link
		//html dom:<a> -- link
		//driver.findElement(By.linkText("Login")).click();
//		By loginLink=By.linkText("Login");
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doClick(loginLink);
		//7. partialLinkText: only for links: for the partial text of the link
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tagName: html tag
//		String header=driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		By pageHeader=By.tagName("h1");
		ElementUtil eleUtil=new ElementUtil(driver);
		String header=eleUtil.doGetElementText(pageHeader);
		System.out.println(header);
	}

}
