package testnghw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndeedTest extends BaseTest {
	
	@Test
	public void logoTest() {
		WebElement svgEle = driver.findElement(By.xpath("//div[@class='gnav-Logo-icon'] //*[local-name()='svg']"));
		boolean flag = svgEle.isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.indeed.com/");
	}
	@Test
	public void searchFieldTest() {
		WebElement searchBox = driver.findElement(By.id("text-input-what"));
		boolean flag = searchBox.isDisplayed();
		Assert.assertEquals(flag, true);
	}

}
