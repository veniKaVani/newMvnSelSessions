package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrmProTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=1966817&CFTOKEN=c1095990a09db256-822DFEBE-A0EA-2E91-D263F9BA444C28F5&jsessionid=b6309878c7d79dac834073246f44486c6431");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void titleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "CRMPRO", "title test--PASS");
	}
	@Test
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.xpath("//td[text()='CRMPRO']"));
		boolean b3 = logoEle.isDisplayed();
		Assert.assertEquals(b3, true, "logo test--PASS");
	}
	@Test
	public void searchFieldTest() {
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@src,'search')"));
	    boolean b4 = searchBox.isEnabled();
	    Assert.assertEquals(b4, true, "search test--PASS");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
