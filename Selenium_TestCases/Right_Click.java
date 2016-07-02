package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Right_Click {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		act.contextClick(element).sendKeys("W").build().perform();
		Sleeper.sleepTightInSeconds(3);
		//act.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.close();
		
		
		
		
	}

}
