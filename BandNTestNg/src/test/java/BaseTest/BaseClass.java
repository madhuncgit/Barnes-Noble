package BaseTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	Properties prop = new Properties();
	FileInputStream is;
	
	

	String browser=null;
	
	
	
	@BeforeSuite
	public void startup() throws Exception {
		
		is =new FileInputStream("/Users/madhurupah/eclipse-workspace/BarnesAndNobleTestNg/src/BaseTest/config.properties");
		prop.load(is);
		browser = prop.get("browser").toString();
	browserSelection(); 
	driver.manage().timeouts();
	//maximize the page
	Thread.sleep(10000);

	driver.get("https://www.barnesandnoble.com/");
	
	}
	private void browserSelection() {
		switch(browser) {
		
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "/Users/madhurupah/eclipse-workspace/Seleniu/driver/chromedriver");
			driver = new ChromeDriver();
			break;
		case "FireFox":
			
			break;
		
		}
		
	
		
	}
	@AfterSuite
	public void tearup() {
		
	}
	
	
}


