package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseOver_Operation {

	public static void main(String[] args) {
		
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver driver = new FirefoxDriver(fp);		
		driver.manage().window().maximize();
		driver.get("http://www.emirates.com/in/english/");
		Sleeper.sleepTightInSeconds(3);
		WebElement src=driver.findElement(By.xpath(".//*[@id='destinations']/a/span[1]"));
		WebElement src2=driver.findElement(By.xpath(".//*[@id='book']/a"));
		Sleeper.sleepTightInSeconds(3);
		Actions act=new Actions(driver);
		/*act.moveToElement(src).build().perform();
		act.moveToElement(src2).build().perform();
		This is for multiple mouseover operation
		*/
		
		act.moveToElement(src).moveToElement(src2).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='book']/div/div[2]/div/a/span")).click();
		
		
		Sleeper.sleepTightInSeconds(2);
		
		
				

	}

}
