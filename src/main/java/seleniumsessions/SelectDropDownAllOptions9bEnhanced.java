package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions9bEnhanced {
     static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By element = By.id("Form_getForm_Country");
		doSelectDropDownValueUsingOptionsCl(element, "India");	

	}
	public static List<WebElement> getDrDownOptionsList(By locator) {
		WebElement element = driver.findElement(By.id("Form_getForm_Country"));//the below
		//4 lines of code common in both-so needs one generic fn for these 4 lines
		Select select = new Select(element);
		return select.getOptions();
		
	}
	public static List<WebElement> getDrDownValuesCount(By locator) {
		getDrDownOptionsList(locator).size();
		return null;	
	}
	public static void doSelectDropDownValueUsingOptionsCl(By locator, String value) {
		//all options available in select class can be taken from options class
		List<WebElement> countryOptions = getDrDownOptionsList(locator);
		
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
