package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Compare_Two_ScreenShots {
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	  File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  driver.get("http://fb.com");
	  File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  if(FileUtils.contentEquals(src1, src2))
	  {
		  System.out.println("Screenshots are matching...");
	  }
	  else
	  {
		  System.out.println("Screenshots are not same or not matching");
		  
	  }
	  Thread.sleep(3000);
	  driver.close();
  }
}
