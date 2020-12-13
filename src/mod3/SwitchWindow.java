package mod3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
	Thread.sleep(4000);
	
	String mw = driver.getWindowHandle();
	System.out.println("The window name is "+mw);
	driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
	Thread.sleep(4000);
	Set<String> awn = driver.getWindowHandles();
	System.out.println("The window name is "+awn);
	
	for (String awo : driver.getWindowHandles())
	{
		driver.switchTo().window(awo);
		Thread.sleep(3000);
		driver.switchTo().window(awo);
		Thread.sleep(3000);
	}	
	
	driver.close();

	}

}
