package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* what is character sequence??
 * sendKeys(characterSequence...keys to send)
 * this character sequence is actually an interface which is already there in java
 * there are 3 classes-String, String Builder, and String Buffer
 * these 3 classes are the child of character sequence
 * 
 * is it always mandatory to pass String as param to sendkeys();
 * what if we are passing string builder/string buffer???
 * IQ] Character sequence could be String, String builder, string buffer
 * character sequence 3 dots means u can supply the array also
 */

public class DisableElementClickSendKeys8e {
      static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
        
//		driver.findElement(By.id("pass")).click();//no exception
//		
//		driver.findElement(By.id("pass")).sendKeys("testing");//eleNotInteractibleException
		
		//driver.findElement(By.name("fname")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
//		driver.findElement(By.name("fname")).sendKeys("null");//null being treated as String and got entered
		
//		StringBuilder sb = new StringBuilder("testing");
//		driver.findElement(By.id("fname")).sendKeys(sb);
		
		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
		
//		driver.findElement(By.id("fname")).sendKeys(sb+s);
		
		driver.findElement(By.id("fname")).sendKeys(sb, s, "naveen");
		
		//CharSequence -- interface
		//String, SBuilder, SBuffer
		
		}

}
