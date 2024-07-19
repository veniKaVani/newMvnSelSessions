package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException8a {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//search field:finding and sending input-name 'search'
		//need to add try-catch block to the generic doFindElement() in  case of such a situation
		driver.findElement(By.name("search111")).sendKeys("macbook");//NoSuchElementException:
		
		//in case of driver.findElements() --a simple empty array [] is returned
		//since the return type in this case is List<webelement>
		

	}

}
