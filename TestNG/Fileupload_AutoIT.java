package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fileupload_AutoIT {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("photo")).click();
	  
	  Thread.sleep(5000);
	  
	  
	  Runtime.getRuntime().exec("C:\\Users\\Pradeep C\\Documents\\Java\\fileupload.exe");
	  
	  
  }
}
