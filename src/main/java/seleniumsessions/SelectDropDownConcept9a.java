package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * No such Element exception - in case we pass invalid text
 * No such Element exception - in case of out of range index
 * visible text: null--Null pointer exception
 * we need to put null check for visible text and for the attri value
 */

public class SelectDropDownConcept9a {
      static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		//driver.get("https://www.orangehrm.com/3-day-free-trial/");
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
//		WebElement countryEle = driver.findElement(By.id("Form_getForm_Country"));
		//no default select constructor available--so need to use the one which
		//takes webelement as input param
//		Select select1 = new Select(countryEle);
//		select1.selectByIndex(5);
//		select1.selectByVisibleText("India");//this option is better since in future
		//the webelement increases in size there will not be any change even if the position
		//of the value changes
//		select1.selectByValue("Australia");
		
		//if there are 10 dropdowns - 10 select classes and create 10 select objects
		//creating utility to handle this select dropdown is better option
		
		//using generic utility fn to handle the select dropdown 
		By countryDrDown = By.id("Form_getForm_Country");
		doSelectByIndexinDrDown(countryDrDown, 5);
		doSelectByVisibleText(countryDrDown,"India");
		doSelectByAttriValue(countryDrDown,"Australia");
		

	}
    //since we need to create a webelement before any thing we need doFindElement();
	public static WebElement doFindWebElement(By locator) {//1.generic fn to find element
		return driver.findElement(locator);
	}
	public static void doSelectByIndexinDrDown(By locator, int index) {//2.to select from Sdrdown
		Select select = new Select(doFindWebElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByVisibleText(By locator, String visibleTxt) {//3.to select using visible text
		if(visibleTxt==null || visibleTxt.length()==0) {
			throw new ElementException("visible text cannot be null");
		}
		Select select = new Select(doFindWebElement(locator));
		select.selectByVisibleText(visibleTxt);
	}
	public static void doSelectByAttriValue(By locator, String attriValue) {//4.to select using attri value
		if(attriValue==null || attriValue.length()==0) {//common code in both fns for null/blank
			throw new ElementException("Value cannot be null");
		}
		Select select = new Select(doFindWebElement(locator));
		select.selectByValue(attriValue);
	}
	//common in both visible txt fn and value fn--cannot be null or blank
	//so creating a common fn for this null/blank check again
	public void nullBlankCheck(String value) {//since do not want to expose it to user-make it private
		if(value==null || value.length()==0) {//common code in both fns for null/blank
			throw new ElementException("Value cannot be null");
	}
}
}