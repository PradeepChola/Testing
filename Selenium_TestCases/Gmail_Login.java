package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
	public static void main(String [] args) throws Exception{
		//get browser open
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		Thread.sleep(3000);
		driver.findElement(By.id("gmail-sign-in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("cpradeep525");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("Passwd")).sendKeys("xyzaaa");;
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
