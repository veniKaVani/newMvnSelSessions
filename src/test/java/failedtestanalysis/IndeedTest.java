package failedtestanalysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndeedTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void logoTest() {
		WebElement svgEle = driver.findElement(By.xpath("//div[@class='gnav-Logo-icon'] //*[local-name()='svg']"));
		boolean flag = svgEle.isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.indeed.com/");
	}
	@Test
	public void searchFieldTest() {
		WebElement searchBox = driver.findElement(By.id("text-input-what"));
		boolean flag = searchBox.isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
