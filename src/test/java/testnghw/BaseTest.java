package testnghw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
	public void setUp(String url, String browserName) {
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("plz pass the right browser"+browserName);
			
			break;
		}
		
		
		driver.get(
				"https://www.staples.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
