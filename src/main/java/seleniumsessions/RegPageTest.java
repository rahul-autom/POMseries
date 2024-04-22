package seleniumsessions;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPageTest {
	
//	public static String getRandomEmail() {
//		return "automation"+System.currentTimeMillis()+"@"+"opencart.com";
//		//return "automation" + UUID.randomUUID()+"@opencart.com";
//		//9999-999988-999888-
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By eMail=By.id("input-email");
		By mob=By.id("input-telephone");
		By pwd=By.id("input-password");
		By pwdConfirm=By.id("input-confirm");
		By isSubscribeYes=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubscribeNo=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By policyChkBox=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continueBtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successMessg=By.tagName("h1");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(fName, "victor2");
		eleUtil.doSendKeys(lName, "automate2");
		//eleUtil.doSendKeys(eMail, "victor@c2.com");
		
		eleUtil.doSendKeys(eMail, StringUtils.getRandomEmail());
		eleUtil.doSendKeys(mob, "9874563216");
		eleUtil.doSendKeys(pwd, "victor@321");
		eleUtil.doSendKeys(pwdConfirm, "victor@321");
		eleUtil.doClick(isSubscribeYes);
		eleUtil.doClick(policyChkBox);
		eleUtil.doClick(continueBtn);
		String acctSuccMessg=eleUtil.doGetElementText(successMessg);
		System.out.println(acctSuccMessg);
		if(acctSuccMessg.equals("Your Account Has Been Created!")) {
			System.out.println("user Reg -- PASSED");
		}
		else {
			System.out.println("user Reg -- Failed");
		}
		brUtil.getPageURL();
		brUtil.quitBrowser();
		}
}
