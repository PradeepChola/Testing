package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Radio_Button_Testing01 {
  @Test
  public void f() {
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  String baseURL="http://echoecho.com/htmlforms10.htm";
	  driver.get(baseURL);
	  WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	  List<WebElement> radiobtns=block.findElements(By.name("group1"));
	  System.out.println("size of radion button is "+radiobtns.size());
	  
	  for(int i=0;i<radiobtns.size();i++)
	  {
		  System.out.println(radiobtns.get(i).getAttribute("value")+"============"+radiobtns.get(i).getAttribute("Checked"));
	  }
	  
	  driver.close();
	  
  }
}
