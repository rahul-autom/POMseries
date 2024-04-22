package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//headless vs headed
		//headless: no browser visibility
		//faster
		//run tcs on CI CD/Jenkins/Linux:headless
		//recommended:not recommended
		//local:
		//problems: it's not an actual user simulation-
		//complex apps/HTML DOM:
		//alerts/popups:could be a problem
		
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito");//browser history or session will not be maintained..same for firefox
		//WebDriver driver=new ChromeDriver(co);
		//FirefoxOptions fo= new FirefoxOptions();
		//fo.addArguments("--headless");
		//WebDriver driver=new FirefoxDriver(fo);
		
		EdgeOptions eo=new EdgeOptions();
		//eo.addArguments("--inprivate");//edge incognito
		eo.addArguments("--headless");
		
		WebDriver driver=new EdgeDriver(eo);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
	}

}
