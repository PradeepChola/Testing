package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiple_Rows_n_Specified_Columns {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.timeanddate.com/worldclock/");
	  WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	  List<WebElement> rows=table.findElements(By.tagName("tr"));
	  System.out.println("Row size: "+rows.size());
	  //table xpath divided into two paths i.e., path1 and path2 shown below
	  String path1 = "html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
	  String path2 = "]/td[3]/a";
	  Thread.sleep(3000);
	  //to get the specified column text
	  for(int i=1;i<=36;i++)
	  {
		  String columntext=driver.findElement(By.xpath(path1+i+path2)).getText();
		  System.out.println(columntext);
	  }
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
