package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//SRP: Single Responsibility Principle
public class ElementUtil {
	//public WebDriver driver;
	private WebDriver driver;
	
	
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	private void nullBlankCheck(String value) {
		if(value==null || value.length()==0) {
			throw new MyElementException(value+"---Value text cannot be null or blank");
		}
	}
	public By getBy(String locatorType, String locatorValue) {
		By locator=null;
		switch(locatorType.toLowerCase().trim()) {
		case "id":
			locator=By.id(locatorValue);
			break;
		case "name":
			locator=By.name(locatorValue);
			break;
		case "classname":
			locator=By.className(locatorValue);
			break;
		case "xpath":
			locator=By.xpath(locatorValue);
			break;
		case "css":
			locator=By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator=By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator=By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator=By.tagName(locatorValue);
			break;
		default:
			break;
		}
		return locator;
	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));	
		}
	
	
	public WebElement getElement(By locator) {
		WebElement element=null;
		
		try {
		 element=driver.findElement(locator);	
		}
		catch(NoSuchElementException e) {
			System.out.println("Element is not present on the page");
			e.printStackTrace();
			return null;
		}
		return element;
	}
		
		public void doSendKeys(By locator, String value) {
			nullBlankCheck(value);
			getElement(locator).sendKeys(value);
		}
		public void doSendKeys(By locator, String locatorValue, String value) {
			getElement(locator).sendKeys(value);
		}

		public void doSendKeys(String locatorType, String locatorValue, String value) {
			getElement(locatorType, locatorValue).sendKeys(value);
		}
		public void doClick(By locator) {
			getElement(locator).click();
		}
		public String doGetElementText(By locator) {
			return getElement(locator).getText();
			
		}
		public String doElementGetAttribute(By locator,String attrName) {
			return getElement(locator).getAttribute(attrName);
		}
		
		public boolean isElementDisplayed(By locator) {
			return getElement(locator).isDisplayed();
		}
		
		public boolean isElementExist(By locator) {
			if(getElements(locator).size()==1) {
				return true;
			}
			return false;
		}
		
		public boolean multipleElementsExist(By locator) {
			if(getElements(locator).size()>0) {
				return true;
			}
			return false;
		}
		
		
		public List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		
		public ArrayList<String> getElementsTextList(By locator) {
			List<WebElement> eleList=getElements(locator);
			ArrayList<String> eleTextList=new ArrayList<String>();//pc=0
			
			
			for(WebElement e:eleList) {
				String text=e.getText();
				if(text.length()!=0) {
					eleTextList.add(text);
				}
			}
			return eleTextList;
		}

	public ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList=getElements(locator);
		ArrayList<String> eleAttrList=new ArrayList<String>();//pc=0
		
		for(WebElement e:eleList) {
			String attrValue=e.getAttribute(attrName);
			if(attrValue.length()!=0) {
				eleAttrList.add(attrValue);
			}
		}
		return eleAttrList;
		
	}

  //*********************************Select based Drop Down Utils******************************************//
public void doSelectByIndex(By locator, int index) {
		
		Select select=new Select(getElement(locator));
		select.deselectByIndex(index);
				
	}

	public void doSelectByVisibleText(By locator, String visibleText) {
		nullBlankCheck(visibleText);
		Select select =new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	

	
	public void doSelectByValue(By locator, String value) {
		nullBlankCheck(value);
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		List<String> optionsTextList=new ArrayList<String>();
		for(WebElement e: optionsList) {
			
			String optionText=e.getText();
			optionsTextList.add(optionText);
		}
		return optionsTextList;
	}
	public List<WebElement> getDropDownOptionsList(By locator) {
		
		Select select=new Select(getElement(locator));
		return select.getOptions();
	}
	public int getDropDownValuesCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	public void doSelectDropDownValue(By locator, String value) {
		
		nullBlankCheck(value);
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		
		for(WebElement e: optionsList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
			//System.out.println(text);
		}
	}

public void printSelectDropDownValue(By locator) {
		
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		
		for(WebElement e: optionsList) {
			String text=e.getText();
			System.out.println(text);
			
			
		}
	}
//without select class, select the dropdown value
public void DoSelectValueFromDropDown(By locator, String value)
{
	List<WebElement> optionsList=getElements(locator);
	System.out.println(optionsList.size());
	for(WebElement e: optionsList) {
		String text=e.getText();
		if(text.equals("India")) {
			e.click();
			break;
	
}
}
}

public void doSearch(By searchLocator, By searchSuggestions, String searchKey, String value) throws InterruptedException
{
	doSendKeys(searchLocator, searchKey);
	driver.findElement(searchLocator).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> suggList=driver.findElements(searchSuggestions);
	System.out.println(suggList.size());
	
	for(WebElement e:suggList) {
		String text=e.getText();
		System.out.println(text);
		if(text.contains(value)) {
			e.click();
			break;
		}
	}
}

	
	
	}
		

