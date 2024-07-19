package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	
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
		Assert.assertEquals(pageTitle, "OrangeHRM", "title test--PASS");
	}
	@Test
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		boolean b = logoEle.isDisplayed();
		Assert.assertEquals(b, true, "logo test--PASS");
	}
	@Test
	public void ForGottenPsWdLinkTest() {
		WebElement forgotPsWd = driver.findElement(By.xpath("//p[contains(@class,'forgot')]"));
	    boolean b5 = forgotPsWd.isDisplayed();
	    Assert.assertEquals(b5, true, "link test--PASS");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
