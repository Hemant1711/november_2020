package mod1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
	WebDriver driver = new ChromeDriver();
	
	//Opening Facebook
	driver.get("https://www.facebook.com/");
	
	//Locate
	//driver.wait(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("Hemant");
	driver.findElement(By.id("pass")).sendKeys("Mishra");
	driver.findElement(By.className("_6ltj")).click();
	driver.findElement(By.id("identify_email")).sendKeys("+919911506633");
	driver.findElement(By.id("did_submit")).click();
	
	Thread.sleep(3000);	
	driver.findElement(By.linkText("Messenger")).click();
	driver.navigate().back();
	driver.navigate().refresh();
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	driver.findElement(By.id("u_0_b")).click();
	String error1 = driver.findElement(By.className("_9ay7")).getText();
	boolean Check = error1.equals("The password you’ve entered is incorrect. Forgot Password?");
	System.out.println("Result - " + Check);	
	
	//The password you’ve entered is incorrect. Forgot Password?
//driver.close();
	}

}
