package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue8c {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("Victor@gmail.com");

//      String email = driver.findElement(By.id("input-email")).getText();//No output on console
//      System.out.println(email);

		// cannot apply getText() method on text fields
		// getText: link, header, label, span --where actually the text is available
		// value is one attribute - which does not have any value
		// this value attribute holds the text inputted in the text field

		String email = driver.findElement(By.id("input-email")).getAttribute("value");// No output on console
		System.out.println(email);

	}

}
