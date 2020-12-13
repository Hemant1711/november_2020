package mod2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri_Validation {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.naukri.com/nLogin/Login.php");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//input[@id='usernameField']")).click();
		
		driver.findElement(By.xpath("//input[@id='passwordField']")).click();
		
		String Text = driver.findElement(By.id("usernameField_err")).getText();
		
		boolean Result = Text.equals("Email ID Username cannot be left blank");
		
		System.out.println("Result - " + Result);	
	}

}
