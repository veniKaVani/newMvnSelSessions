package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions2WithSearchKeyNAL {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		WebElement searchFieldLoc = driver.findElement(By.xpath("//textarea[@name='q']"));
//		searchFieldLoc.sendKeys("naveen automation labs");
//		Thread.sleep(2000);
		
		By searchBox = By.xpath("//textarea[@name='q']");
		By suggList = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		
		doSearch(searchBox,"naveen automation labs",suggList,"udemy");
		
//		List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		
//		for(WebElement e:searchsuggestions) {
//			String eachSearchTxt = e.getText();
//			if(eachSearchTxt.contains("udemy")) {
//				e.click();
//				break;
//			}
//		}
		

	}
	public static void doSearch(By searchlocator,String searchkey,By searchsuggestions,String value) throws InterruptedException {
		
		WebElement searchfield = driver.findElement(searchlocator);
		searchfield.sendKeys(searchkey);
		Thread.sleep(2000);
		

List<WebElement> searchlist = driver.findElements(searchsuggestions);
		
		for(WebElement e:searchlist) {
			String eachSearchTxt = e.getText();
			if(eachSearchTxt.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
