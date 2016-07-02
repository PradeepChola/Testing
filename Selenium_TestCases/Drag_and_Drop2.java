package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Drag_and_Drop2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/html5_draganddrop.asp");
		Sleeper.sleepTightInSeconds(3);
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.id("drag1"));
		WebElement target=driver.findElement(By.xpath(".//*[@id='div2']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.close();
	}

}
