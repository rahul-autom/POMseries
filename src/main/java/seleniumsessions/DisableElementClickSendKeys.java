package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		
		
//		driver.findElement(By.id("submitButton")).click();//no exception
//		driver.findElement(By.id("pass")).sendKeys("testing");
		//driver.findElement(By.id("pass")).click();
		//driver.findElement(By.id("fname")).sendKeys(null);//IllegalArgumentException: Keys to send should be a not null CharSequence
		//driver.findElement(By.id("fname")).sendKeys("null");
		StringBuilder sb=new StringBuilder("testing");
		String s="automation";
		driver.findElement(By.id("fname")).sendKeys(sb+s);
		driver.findElement(By.id("fname")).sendKeys(sb,s,"naveen");
		
	//CharSequence -- interface
	//string, SBuilder, SBuffer
		
		
		
	}

}
