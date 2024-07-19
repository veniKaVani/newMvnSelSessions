package failedtestanalysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CostcoTest {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void pageTitleTest() {
		String titleTxt = driver.getTitle();
		Assert.assertEquals(titleTxt, "Welcome to Costco Wholesale", "PASS");
	}
	
	
	@Test
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.xpath("//img[@automation-id='headerCostcoLogo']"));
		boolean flag = logoEle.isDisplayed();
		Assert.assertEquals(flag, true, "Logo present on page");
		
	}
	@Test
	public void cartlogoTest() {
		WebElement cartLogoEle = driver.findElement(By.id("cart-d"));
		boolean flag2 = cartLogoEle.isDisplayed();
		Assert.assertEquals(flag2, true, "cart is present on page");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
