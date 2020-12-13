package mod3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		//Select and deselect commands, cannot be on dropdown, but can be on options
		//Initialize the Select class and focus on the WebElement 
		Select opSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		//Select by Index
		opSelect.selectByIndex(2);
		Thread.sleep(4000);
		
		//Deselect by Name
		opSelect.deselectByVisibleText("Switch Commands");
		Thread.sleep(4000);
		
		//Getting the size of the option list
		List<WebElement> optCount = opSelect.getOptions();
		
		int oTotal = optCount.size();
		System.out.println(oTotal);
				
		//Loop
		int i;
		for (i=0;i<oTotal;i++)
		{
			//get text
			String oName = optCount.get(i).getText();
			System.out.println(oName);
			//select
			opSelect.selectByIndex(i);
			Thread.sleep(1000);
			//deselect
			opSelect.deselectByIndex(i);
			Thread.sleep(1000);
		}
		
		//opSelect.deselectAll();
		driver.close();
		//driver.switchTo()
		
	}

}
