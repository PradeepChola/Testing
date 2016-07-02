package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Checking_Testng {
 
@Test
  public void f() {
	  
	  System.out.println("This will execute second");
  }
  
@BeforeTest
  public void beforeTest() {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("http://www.google.com");
	  	   
  }

@AfterTest
  public void afterTest() {
	
	System.out.println("Stop or Last");
	
	
  }
  
  
  
  
  
  
  
  

}
