package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.findElement(By.name("search111")).sendKeys("macbook");
		List<WebElement> eles=driver.findElements(By.tagName("naveen"));
		System.out.println(eles.size());
		System.out.println(eles);
		
	}

}
