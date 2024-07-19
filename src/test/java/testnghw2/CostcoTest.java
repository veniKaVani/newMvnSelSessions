package testnghw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CostcoTest extends BaseTest {
	
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
	

}
