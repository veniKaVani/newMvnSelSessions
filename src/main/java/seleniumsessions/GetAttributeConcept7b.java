package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept7b {
      static WebDriver driver;
	public static void main(String[] args) {
		//text --> getText();
		//attribute --> getAttribute();
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String fn_typeAttri = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		String fn_nameAttri = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		String fn_processidAttri = driver.findElement(By.id("input-firstname")).getAttribute("fdprocessedid");
//		String fn_placeholderAttri = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		
//		System.out.println(fn_typeAttri);
//		System.out.println(fn_nameAttri);
//		
//		System.out.println(fn_placeholderAttri);
//		
		//this is too much code to get attributes of each element since attributes are many
		//it is time to write some generic fns to skip writing too much code
		//==> need to write 2 generic fns-one for findElement() and one for getAttribute()
		
		By fn = By.id("input-firstname");
		
		String fn_placeholderAttri = doGetEleAttribute(fn,"placeholder");
		String fn_typeAttri= doGetEleAttribute(fn,"type");
		String fn_nameAttri = doGetEleAttribute(fn,"name");
		
		System.out.println(fn_typeAttri);
		System.out.println(fn_nameAttri);
		System.out.println(fn_placeholderAttri);
		
		By regLink = By.linkText("Register");
		String reg_hrefAttri = doGetEleAttribute(regLink, "href");
		System.out.println(reg_hrefAttri);
		
		driver.close();
	}
   public static WebElement doFindElement(By locator) {
	  return driver.findElement(locator); 
   }
   public static String doGetEleAttribute(By locator, String attributeName) {
	   return doFindElement(locator).getAttribute(attributeName);
   }
}
