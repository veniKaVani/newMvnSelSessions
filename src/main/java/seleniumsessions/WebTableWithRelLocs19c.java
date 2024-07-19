package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class WebTableWithRelLocs19c {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		WebElement playerEle = driver.findElement(By.linkText("Joe.Root"));
		
		WebElement chkBoxEle = driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playerEle));
		chkBoxEle.click();
		

	}

}
