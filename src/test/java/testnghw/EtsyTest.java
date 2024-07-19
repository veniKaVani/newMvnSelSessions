package testnghw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EtsyTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.etsy.com/?source=aw&utm_source=affiliate_window&utm_medium=affiliate&utm_campaign=us_location_buyer&utm_content=1097883&utm_term=0&sv1=affiliate&sv_campaign_id=1097883&awc=6220_1711584709_bce1ea6daad08a67ed681145ea452cc8");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}
	
	@Test
	public void logintitleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",
				"PASS");
	}
	@Test
	public void logoSvgEleTest() {
		WebElement etsyLogo = driver.findElement(By.xpath("//span[@id='logo']//*[local-name()='svg']"));
		boolean flag = etsyLogo.isDisplayed();
		Assert.assertEquals(flag, true, "Logo Present on Page");
	}

	@Test
	public void logoTest() {
		WebElement logoEle = driver
				.findElement(By.cssSelector("div.wt-pb-xs-1.wt-pb-lg-0.wt-pt-sm-1.wt-pt-lg-0.wt-pr-xs-0.wt-pr-sm-1"));
		boolean b1 = logoEle.isDisplayed();
		Assert.assertEquals(b1, true, "PASS");
	}

	@Test
	public void searchBoxTest() {
		WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
		boolean b2 = searchBox.isEnabled();
		Assert.assertEquals(b2, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
