package mod1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoTours {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.ie.driver","E:\\Training\\Selenium\\Selenium\\drivers\\IEDriverServer_3.4.exe");
		WebDriver driverie = new InternetExplorerDriver();
		
		//Open AUT
		driverie.get("http://demo.guru99.com/test/newtours/");
		
		//Find Elements
		driverie.findElement(By.name("userName")).sendKeys("tutorial");
		driverie.findElement(By.name("password")).sendKeys("tutorial");
		driverie.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driverie.findElement(By.linkText("Flights")).click();
		driverie.findElement(By.name("findFlights")).click();
		//String str1="Checking Confirmation";
		//if(driver.getPageSource().contains("No Seats Avaialble"))
			if(driverie.getPageSource().contains("No Seats Avaialble"))
		{
			System.out.println("Sorry there are no seats available");
			}
		else
		{
			System.out.println("If loop failed");
		}
		
		//driver.findElement(By)
		driverie.close();

	}

}
