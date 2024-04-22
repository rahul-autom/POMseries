package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		//isDisplayed -- element is present on the page
		//isEnabled -- element is obv present on the page but it's enabled or not
		
		boolean f1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(f1);
		boolean f2=driver.findElement(By.name("agreeTerms")).isDisplayed();
		System.out.println(f2);
		boolean flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//false
		
		boolean chk_flag=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);//false
	
		
		driver.findElement(By.name("agreeTerms")).click();//select the checkbox
		chk_flag=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);
		
		
		flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//true
		
	}

}
