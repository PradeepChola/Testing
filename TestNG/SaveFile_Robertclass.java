package testNG;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SaveFile_Robertclass {
  @Test
  public void f() throws AWTException, InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.seleniumhq.org/download/");
	  Sleeper.sleepTightInSeconds(3);
	  driver.findElement(By.linkText("2.53.0")).click();
	  //Robert class to handle desktop or windows operations
	  Robot rb=new Robot();
	  Sleeper.sleepTightInSeconds(2);
	  //To click on 2.53.0 link keypress and keyrelease	  
	  
	  rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
	  rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);
	  
	  rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	  rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  
  }
}
