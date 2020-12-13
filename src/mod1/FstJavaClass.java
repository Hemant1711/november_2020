package mod1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FirefoxBrowser
				System.setProperty("webdriver.gecko.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\geckodriver_0.24.exe");
				WebDriver driver = new FirefoxDriver();
				driver.close();
	}

}
