package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SaveFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.seleniumhq.org/download/");
	  Sleeper.sleepTightInSeconds(3);
	  driver.findElement(By.linkText("2.53.0")).click();
	  Sleeper.sleepTightInSeconds(3);
	  Runtime.getRuntime().exec("C:\\Users\\Pradeep C\\Documents\\Java\\savefile.exe");
	  
	  
  }
}
