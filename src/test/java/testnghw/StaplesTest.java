package testnghw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaplesTest extends BaseTest {
	
	@Test
	public void titleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Staples® Official Online Store", "PASS");
	}
	@Test
	public void searchBoxTest() {
		WebElement searchBox = driver.findElement(By.id("searchInput"));
		boolean flag1 = searchBox.isEnabled();
		Assert.assertEquals(flag1, true, "PASS");
	}
	@Test
	public void cartIconTest() {
		WebElement svgEle = driver.findElement(By.xpath("//div[@class='sc-18w9h10-0 fezWFU']//*[local-name()='svg']"));
	    boolean flag2 = svgEle.isDisplayed();
	    Assert.assertEquals(flag2, true, "Cart Icon Present on page");
	}
	
	


}
