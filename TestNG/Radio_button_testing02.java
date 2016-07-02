package testNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Radio_button_testing02 {
 @Test
  public void f() {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://echoecho.com/htmlforms10.htm");
	  driver.manage().window().maximize();
	  
	  WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	  //loop for two groups
	  for(int k=1;k<=2;k++)
	  {
		  List<WebElement> radio=block.findElements(By.name("group"+k));
		  //loop for clicking 3 radio buttons
		  for(int i=0;i<radio.size();i++)
		  {
			  radio.get(i).click();
			  for(int j=0;j<radio.size();j++)
			  {
				  System.out.println(radio.get(j).getAttribute("value")+""+radio.get(j).getAttribute("checked"));
				  
			  }
			  System.out.println("#############");
		  }
	  }
	  
  }
 
}
