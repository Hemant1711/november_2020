package mod1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicCommands {

	public static void main(String[] args) {
		
		//Browser Initialization or Instantiation
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_2.46.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_2.8.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();
		
		//FirefoxBrowser
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\geckodriver_0.24.exe");
		WebDriver driverff = new FirefoxDriver();
		driverff.close();
		
		//ie
		System.setProperty("webdriver.ie.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\IEDriverServer_3.4.exe");
		WebDriver driverie = new InternetExplorerDriver();
		driverie.close();
		
		//Basic Commands
		driver.get("URL"); //This is used to open an Application URL in the Browser
		driver.getTitle(); //This is used to get the current title of the page
		driver.getCurrentUrl(); //This is used to get the current URL of the application
		
		//Navigation Commands
		driver.navigate();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//Element Handling Commands
		driver.findElement(By.id("")).click(); 
		driver.findElement(By.id("")).sendKeys(); //to type
		driver.findElement(By.id("")).clear(); //to clear
		
		
		
		
	}

}
