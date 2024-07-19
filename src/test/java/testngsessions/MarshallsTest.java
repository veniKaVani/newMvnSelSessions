package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarshallsTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void titleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Marshalls Official Site | Shop Shoes, Clothing, Home Decor & More", "PASS");
	}
	@Test
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.cssSelector("img#site-logo"));
		boolean b2 = logoEle.isDisplayed();
		Assert.assertEquals(b2, true, "logo test--PASS");
	}
	
	@Test
	public void searchFieldTest() {
		WebElement searchBox = driver.findElement(By.cssSelector("input#search-text-input"));
		boolean b1 = searchBox.isDisplayed();
		Assert.assertEquals(b1, true, "search test--PASS");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
