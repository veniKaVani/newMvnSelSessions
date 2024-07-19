package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept9aEnhanced {
     static WebDriver driver;

		public static void main(String[] args) {

			// using generic utility fn to handle the select dropdown
			By countryDrDown = By.id("Form_getForm_Country");
			doSelectByIndexinDrDown(countryDrDown, 5);
			doSelectByVisibleText(countryDrDown, "India");
			doSelectByAttriValue(countryDrDown, "Australia");

		}

		public static WebElement doFindWebElement(By locator) {// 1.generic fn to find element
			return driver.findElement(locator);
		}

		public static void doSelectByIndexinDrDown(By locator, int index) {// 2.to select from Sdrdown
			Select select = new Select(doFindWebElement(locator));
			select.selectByIndex(index);
		}

		public static void doSelectByVisibleText(By locator, String value) {// 3.to select using visible text
			nullBlankCheck(value);
			Select select = new Select(doFindWebElement(locator));
			select.selectByVisibleText(value);
		}

		public static void doSelectByAttriValue(By locator, String value) {// 4.to select using attri value
			nullBlankCheck(value);
			Select select = new Select(doFindWebElement(locator));
			select.selectByValue(value);
		}

		// common in both visible txt fn and value fn--cannot be null or blank
		// so creating a common fn for this null/blank check again
		private static void nullBlankCheck(String value) {// keep private methods on top in Eleutil class
			if (value == null || value.length() == 0) {// common code in both fns for null/blank
				throw new ElementException("Value cannot be null");
			}
		}
}
