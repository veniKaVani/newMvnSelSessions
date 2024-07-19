package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplay8b {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean b1 = driver.findElement(By.className("img-responsive11")).isDisplayed();//NSE
//		System.out.println(b1);
//		if(b1) {
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo is not displayed");
//		}
//		By logo = By.className("img-responsive");
//		boolean b = isElementDisplayed(logo);
//		
//		if(b) {
//			System.out.println("logo is displayed");
//		}
		
		//creating a generic fn to avoid the below code--isElementExist()
//		List<WebElement> logo = driver.findElements(By.className("img-responsive11"));
//		
//		if(logo.size()==1) {
//			System.out.println("logo is displayed");
//		}
//		else {
//			System.out.println("logo is not displayed");
//		}
		
		By logo = By.className("img-responsive11");
		if(isElementExist(logo)) {
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		};
		

	}
	public static WebElement doFindElement(By locator) {//1.generic doFindElement--already written
		return driver.findElement(locator);
	}
	public static boolean isElementDisplayed(By locator) {//2.generic isElementDisplayed()--customizing it
		return doFindElement(locator).isDisplayed();
	}
	public static List<WebElement> doFindElements(By locator) {
		return driver.findElements(locator);
	}
	public static boolean isElementExist(By locator) {
		if(doFindElements(locator).size()==1) {
			return true;
		}
		return false;
	}

}
