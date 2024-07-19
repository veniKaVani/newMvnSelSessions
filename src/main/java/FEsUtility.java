import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtility {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		By allTags = By.tagName("a");
		By allImages = By.tagName("img");
		
		doFindElements(allTags);
		doFindElements(allImages);
		
		doGetElesCount(allTags);
		doGetElesCount(allImages);
		
//		System.out.println("totalCount="+doGetElesCount(allTags));
//		System.out.println("total img Count="+doGetElesCount(allImages));
//		
//		ArrayList<String> elesTxt = doGetTextOfEles(allTags);
//		System.out.println(elesTxt);
//		ArrayList<String> imgsTxt = doGetTextOfEles(allImages);
//		System.out.println(imgsTxt);
//		
//		if(elesTxt.contains("Help")) {
//			System.out.println("PASS");
//		}
		
		
		ArrayList<String> elesAltValues = doGetElesAttributeList(allImages, "alt");
		System.out.println(elesAltValues);
		
		driver.close();
		
}
	//all generic fns related to findElements() method
	public static List<WebElement> doFindElements(By locator) {//1.to get the list of WebEles
		return driver.findElements(locator);
	}
	public static int doGetElesCount(By locator) {//2.to get the count of all webEles
		return doFindElements(locator).size();
	}
	public static ArrayList<String> doGetTextOfEles(By locator) {//3.to get txt of all Eles
		List<WebElement> elesList = doFindElements(locator);
		ArrayList<String>eleTxtList = new ArrayList<String>();
		
		for(WebElement e : elesList) {
			String elesTxt = e.getText();
			
			if(elesTxt.length()!=0) {
				eleTxtList.add(elesTxt);
			}
		}
		return eleTxtList;
	}
	public static ArrayList<String> doGetElesAttributeList(By locator, String attriName) {//4.to get attributes list
		List<WebElement> allEleList = doFindElements(locator);
        ArrayList<String>elesAttriList = new ArrayList<String>();//pc=0
        
		for(WebElement e : allEleList) {
			String attriValue = e.getAttribute(attriName);
			if(attriValue.length()!=0) {
				elesAttriList.add(attriValue);
			}
		}
		return elesAttriList;
	}
	
}