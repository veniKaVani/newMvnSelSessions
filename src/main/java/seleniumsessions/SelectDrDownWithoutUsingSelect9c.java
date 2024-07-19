package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDrDownWithoutUsingSelect9c {
      static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		//not allowed to use select class
		
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
//		doSelectValueFromDrDown(options, 5);
		
//		doSelectValueFromDrDown(options,"India");
//		doSelectValueFromDrDown(options, "Australia");
		
//		List<WebElement> alloptions = driver.findElements(options);//cut and move to generic
//		System.out.println(alloptions.size());
//		
//		for(WebElement e : alloptions) {
//			String text = e.getText();
//			
//			if(text.equals("India")) {
//				e.click();
//				break;
//				}
//		}

	}
//	public static void doSelectByIndexFromDrDown(By locator, int indexNo) {//some problem needs fix
//		List<WebElement> alloptions = driver.findElements(locator);
//		System.out.println(alloptions.size());
//		
//		for(WebElement e : alloptions) {
//			int counter = 0;
//			String text = e.getText();
//			//counter = counter+1;
//			if(text.equals("Albania")) {
//				e.click();
//				
//				counter = counter+1;
//				}		
//		}
//		
//	}
	public static void doSelectValueFromDrDown(By locator, String value) {//move to EleUtil
		List<WebElement> alloptions = driver.findElements(locator);//cut and move to generic
		System.out.println(alloptions.size());
		
		for(WebElement e : alloptions) {
			String text = e.getText();
			
			if(text.equals("India")) {
				e.click();
				break;
				}
		}
		
	}

}
