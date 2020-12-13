package mod4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class STock_TestNG {

	WebDriver driver;

	@BeforeSuite(enabled = true)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void Maximizing() {
		
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void OpenAUT() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
	}

	//@Parameters("UName")
	@Test(dependsOnMethods = "OpenAUT")
	public void Currency() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("1 CAD to INR");
		//find search element and click
		driver.findElement(By.className("gNO89b")).click();
		String rupee1 = driver.findElement(By.xpath("//*[@id='knowledge-currency__updatable-data-column']/div[1]/div[2]/span[1]")).getText();
		//String rupee1= driver.findElement(By.cssSelector("span.DFlfde.SwHCTb")).getText(); //this also works
		System.out.println("1 CAD is " +rupee1+" rupees");
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = "Currency")
	public void StockCheck() throws InterruptedException {
		driver.get("https://money.tmx.com/en/quote/ABST");
		Thread.sleep(6000);
		//String str1 = driver.findElement(By.xpath("//div[@class='sc-dHMjyi gzSWnW']")).getText();
		String str1 = driver.findElement(By.cssSelector("div.sc-gmfbfk.efPjgm")).getText();//this also works
		System.out.println("The current value of ABST in TSX is " +str1 +" and yours avg is 14.15");
		
		// Implicitly wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.get("https://money.tmx.com/en/quote/DOC");
		Thread.sleep(6000);
		String str2 = driver.findElement(By.cssSelector("div.sc-gmfbfk.efPjgm")).getText();
		String bname = driver.findElement(By.cssSelector("div.sc-fYOzFx.ftvlBV")).getText();
		
		System.out.println("The current value of "+bname+" (DOC) in TSX is " +str2 +" and yours avg is 2.41");
		Thread.sleep(2000);
		
		driver.get("https://money.tmx.com/en/quote/FOOD");
		Thread.sleep(6000);
		String str3 = driver.findElement(By.cssSelector("div.sc-gmfbfk.efPjgm")).getText();
		
		System.out.println("The current value of FOOD is " +str3+" and your avg is 8.32");
		Thread.sleep(2000); 
	}

	@AfterSuite
	public void CloseBrowser() {
		driver.close();
	}

}
