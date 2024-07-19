package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass27a {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement drDownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(drDownEle);
		
		//to chk if it is multiple selection--select class has a method--ismultiple()
		System.out.println(select.isMultiple());//true
		
		if(select.isMultiple()) {
			System.out.println("multi select is possible");
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
		
		}
		List<WebElement> optionsSelected = select.getAllSelectedOptions();	
		for(WebElement e:optionsSelected) {
			System.out.println(e.getText());
		}
		//select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();
	}

}
