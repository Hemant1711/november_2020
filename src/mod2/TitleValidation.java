package mod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	String GetTitle = driver.getTitle();
	System.out.println(GetTitle);
	
	//Validation Check
	boolean match = GetTitle.contains("Facebook");
			//equals("Facebook");
	System.out.println(match);
driver.close();
	}

}
