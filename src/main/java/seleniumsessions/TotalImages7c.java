package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages7c {
      static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("total images="+imgList.size());
		
		for(WebElement ele : imgList) {
			String altValue = ele.getAttribute("alt");
			String srcValue = ele.getAttribute("src");
			
			System.out.println(altValue+"-----"+srcValue);
		}
		
	}

}
