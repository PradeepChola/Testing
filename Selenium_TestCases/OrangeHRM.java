package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver driver= new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a"));
		Thread.sleep(1000);
		driver.close();
		
	}

}
