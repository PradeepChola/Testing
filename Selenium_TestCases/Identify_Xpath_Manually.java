package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Identify_Xpath_Manually {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com");
		d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
		Sleeper.sleepTightInSeconds(3);
		d.close();
	}

}
