package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Google_Search {

	public static void main(String[] args) throws Exception {
		//creating profile object
		ProfilesIni pr=new ProfilesIni();
		//creating firefox profile object
		FirefoxProfile fp=pr.getProfile("Selenium");
		
		WebDriver d=new FirefoxDriver(fp);
		d.manage().window().maximize();
		d.get("http://www.google.com");
		Thread.sleep(1000);
		d.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		Thread.sleep(1000);
		d.findElement(By.id("lst-ib")).clear();
		Thread.sleep(1000);
		d.findElement(By.id("lst-ib")).sendKeys("Quick test profession");
		d.close();
	}

}
