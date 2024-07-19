package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToEleOnBool15a {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/#result");
		
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).perform();
//		
//		driver.findElement(By.xpath("//a[text()='Single Videos']")).click();
		
		By parentMenuLink = By.xpath("//a[@class='menulink']");
		By childMenuLink = By.xpath("//a[text()='Single Videos']");
		
		doMoveToEleAndClick(parentMenuLink, childMenuLink);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    //creating a generic fn for the moveToElementAndClick action:
	public static void doMoveToEleAndClick(By parentlocator, By childlocator) {
		Actions act1 = new Actions(driver);
		act1.moveToElement(getElement(parentlocator)).perform();
		
		getElement(childlocator).click();
	}
	
	
}
