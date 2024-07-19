package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators19a {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		WebElement fifthEle = driver.findElement(By.linkText("Levis, Canada"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(fifthEle)).getText();
		System.out.println(leftRank);
		
		String rightNo = driver.findElement(with(By.tagName("p")).toRightOf(fifthEle)).getText();
        System.out.println(rightNo);
        
        String aboveCity = driver.findElement(with(By.tagName("p")).above(fifthEle)).getText();
        System.out.println(aboveCity);
        
        String belowCity = driver.findElement(with(By.tagName("p")).below(fifthEle)).getText();
        System.out.println(belowCity);
	}

}
