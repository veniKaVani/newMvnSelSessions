package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * this option without using select class - has performance issue
 * since we are iterating one by one in the huge list of dropdown and once
 * we encounter the value - select it
 * when select class is not available-in such scenario is useful
 */

public class SelectDropDownAllOptions9b {
     static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By countryDrDown = By.id("Form_getForm_Country");
		doSelectDropDownValueUsingOptionsCl(countryDrDown, "India");

	}
	public static List<String> getDrDownOptionsTextList(By locator) {//4.generic to get text of each eleList
		List<WebElement> optionsList = getDrDownOptionsList(locator);
		List<String> optionsTxtList = new ArrayList<String>();
		
		for(WebElement e: optionsList) {
			String optionsTxt = e.getText();
			optionsTxtList.add(optionsTxt);	
		}
		return optionsTxtList;
	}
	public static List<WebElement> getDrDownOptionsList(By locator) {
		WebElement countryEle = driver.findElement(By.id("Form_getForm_Country"));//the below
		//4 lines of code common in both-so needs one generic fn for these 4 lines
		Select select = new Select(countryEle);
		return select.getOptions();
		
	}
	public static void getDrDownValuesCount(By locator) {
		WebElement countryEle = driver.findElement(By.id("Form_getForm_Country"));//the below
		//4 lines of code common in both-so needs one generic fn for these 4 lines
		Select select = new Select(countryEle);
		List<WebElement> countryOptions = select.getOptions();
		System.out.println(countryOptions.size());
		
	}
	public static void doSelectDropDownValueUsingOptionsCl(By locator, String value) {
		WebElement countryEle = driver.findElement(By.id("Form_getForm_Country"));//create a generic 
		//fn-cut from this line and paste inside the generic fn
		
		Select select = new Select(countryEle);
		
		//all options available in select class can be taken from options class
		List<WebElement> countryOptions = select.getOptions();
		System.out.println(countryOptions.size());
		
		for(WebElement e : countryOptions) {//time complexity is O(n)
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}
