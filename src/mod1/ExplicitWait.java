package mod1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
	WebDriver driver = new ChromeDriver();
	
	//open aut
	driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
	
	WebDriverWait wait = new WebDriverWait(driver,15); //15 will pass, 5 will fail
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5")));
	
	driver.close();
	

	}

}
