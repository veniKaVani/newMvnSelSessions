package failedtestanalysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JCpennyTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void titleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "JCPenney: Clothing, Bed & Bath, Home Decor, Jewelry & Beauty", "PASS");
	   //JCPenney: Clothing, Bed &amp; Bath, Home Decor, Jewelry &amp; Beauty
	}
	
	@Test
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.id("jcp-logo"));
		boolean b1 = logoEle.isDisplayed();
		Assert.assertEquals(b1, true, "logo is present on the page");
		
	}
	@Test
	public void searchBoxTest() {
		WebElement searchBoxEle = driver.findElement(By.id("searchInputId"));
		boolean b2 = searchBoxEle.isDisplayed();
		Assert.assertEquals(b2, true, "ele present on page");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
