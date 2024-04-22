package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		//enter url
		//get the title
		//verify the title - act Vs exp
		
		//automation steps
		//WebDriver driver=new ChromeDriver();//Top Casting..here it's opening the browser
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");//enter url
		String title=driver.getTitle();//get title
		System.out.println("page title "+title);
		//checkpoint/verification point/actual Vs expected
		if(title.equals("Google")) {
			System.out.println("correct title--PASS");
		}
		else {
			System.out.println("incorrect title--FAIL");
		}
		//automation steps + verification point ----> Automation Testing
		//test steps+verification point -- test case
		String url=driver.getCurrentUrl();		
		System.out.println(url);
		if(url.contains("google.com")) {
			System.out.println("url -- Passed");
		}
		else {
			System.out.println("url -- Failed");
		}
	//close the browser:quit() and close()
		driver.close();
		
	
	}

}
