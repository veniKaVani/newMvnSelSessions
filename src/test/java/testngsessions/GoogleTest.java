package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
		Assert.assertEquals(pageTitle, "Google", "title test--PASS");
		
	}
	@Test
	public void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
		boolean b = logo.isDisplayed();
		Assert.assertEquals(b, true, "logo test--PASS");
	}
	@Test
	public void allAppsIconTest() {
		WebElement appsIcon = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
	    boolean b2 = appsIcon.isDisplayed();
	    Assert.assertEquals(b2, true, "appIcon test--PASS");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
