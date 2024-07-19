package failedtestanalysis;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JCPLtest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.firstenergycorp.com/jersey_central_power_light.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void jcplLogoTest() {
		WebElement logoEle = driver.findElement(By.id("jgsfb1-interchange"));
		boolean b1 = logoEle.isDisplayed();
		Assert.assertEquals(b1, true, "logo is present on this page");
	}
	@Test
	public void titleTest() {
		String titleTxt = driver.getTitle();
		Assert.assertEquals(titleTxt, "Jersey Central Power & Light", "PASS");
	}
	@Test
	public List<String> topHeaderMenuListTest() {
		
		List<WebElement> menuList = driver.findElements(By.xpath("//div[@id='topmenuheader']/div/ul/li/a"));
		List<String> updatedList = new ArrayList<String>();
		for(WebElement e:menuList) {
			String txt = e.getText();
			updatedList.add(txt);
			System.out.println(txt);
		}
		return updatedList;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
