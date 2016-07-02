package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Drag_Drop_By {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/#default");
		Sleeper.sleepTightInSeconds(3);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		//identify the Y-Offset
		int y=drag.getLocation().y;
		Actions act= new Actions(driver);
		Sleeper.sleepTightInSeconds(3);
		act.dragAndDropBy(drag, 200,y).build().perform();
		
		
		
	}

}
