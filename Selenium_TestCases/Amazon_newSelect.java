package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class Amazon_newSelect {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver driver= new FirefoxDriver(fp);
		driver.navigate().to("http://www.amazon.in/");
		
		//Below two lines are for selecting a value from dropdown list Both code will work
		
		//First Line: driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//Second Line: Below one
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wings of fire");
		Thread.sleep(3000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
