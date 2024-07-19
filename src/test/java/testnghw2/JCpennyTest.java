package testnghw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JCpennyTest extends BaseTest {
	
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
	

}
