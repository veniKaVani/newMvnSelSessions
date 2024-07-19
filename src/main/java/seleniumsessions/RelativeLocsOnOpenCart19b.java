package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocsOnOpenCart19b {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement baseEle = driver.findElement(By.id("input-email"));
		
		String aboveTxt = 
		driver.findElement(with(By.cssSelector("label[for='input-email']")).above(baseEle)).getText();
		
		System.out.println(aboveTxt);
		
		//--------------------------
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement continueBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
		
		String txt = driver.findElement(with(By.tagName("p")).below(header)).getText();
		System.out.println(txt);
	
	   List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(continueBtn));	
       
	   for(WebElement e:paraList) {
		   System.out.println(e.getText());
	   }
	}

}
