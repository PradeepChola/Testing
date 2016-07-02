package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic_Table {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.timeanddate.com/worldclock/");
	  Sleeper.sleepTightInSeconds(3);
	  WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	  List<WebElement> rows=table.findElements(By.tagName("tr"));
	  System.out.println("Number of rows present in table: "+rows.size());
	  for(int i=0;i<rows.size();i++)
	  {
		  List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
		  System.out.println(columns.size());
		  
		  for(int j=0;j<columns.size();j++)
		  {
			  System.out.println(columns.get(j).getText());
		  }
		  
		  System.out.println("########");
	  }
  }
}
