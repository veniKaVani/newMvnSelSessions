package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks7a {

	public static void main(String[] args) {
		//1.total links
		//2.print the text of the link
		//3.avoid blank txt
		//broken link -- later
		//list is the parent interface of ArrayList 
		// list is order based and coming from java.util
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//find out all the elements ---using FEs method
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("total links="+allLinks.size());
		
		//indexbased for loop to print txt of each link and avoiding blank links:
		for(int i=0;i<allLinks.size();i++) {
		  String eachLinkTxt = allLinks.get(i).getText();
		  
		  if(eachLinkTxt.length()!=0) {
			  System.out.println(eachLinkTxt);
		  }
		}
		System.out.println("-------foreachloop-----");
		for(WebElement ele : allLinks) {
			String eleTxt = ele.getText();
			
			if(eleTxt.length()!=0) {
				System.out.println(eleTxt);
			}
		}
		//capturing all the text fields on Reg page together using common attribute-classname
		List<WebElement> allTxtFields = driver.findElements(By.className("form-control"));
		
		System.out.println(allTxtFields.size());
		
		//trying to enter the txt into the fields using common attribute
		//-is going to fill all the fields with the same text - not a good option to
		//automate the entry of data using this---so commenting it out this AntiPattern
//		for(WebElement e : allTxtFields) {
//			e.sendKeys("testing");
//		}

	}

}
