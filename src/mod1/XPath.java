package mod1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\\\Training\\\\Selenium\\\\Selenium\\\\drivers\\\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hemant@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		
		//*[contains(text(),"Male")]
		////*[contains(text(),("Male"))]
		////*[contains(@href,"legal")] //in case URL text changes on Front End

	}

}
