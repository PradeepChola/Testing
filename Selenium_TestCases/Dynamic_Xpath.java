package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver d = new FirefoxDriver(fp);
		d.get("http://www.yahoo.com");
		d.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		//identify the yahoo search box
		d.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		Sleeper.sleepTightInSeconds(3);
		
		//now identify the dropdown list
		List<WebElement> droplst = d.findElements(By.xpath(".//*[starts-with(@id,'yui_3_12_0_1_14667')]/a"));
		Sleeper.sleepTightInSeconds(3);;
		//total links size
		System.out.println(droplst.size());
		//clicks the first link
		droplst.get(0).click();
		
		
	}

}
