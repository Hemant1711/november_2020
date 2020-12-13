package mod3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	Select optSelect = new Select(driver.findElement(By.name("continents")));
	
	//Selecting by Index
	optSelect.selectByIndex(4);
	Thread.sleep(4000);
	
	//Selecting by Value
	optSelect.selectByValue("g");
	Thread.sleep(4000);
	
	driver.close();
	
	
	}

}
