package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Calender_Webtable_Datepicker {
  @Test
  public void f() throws InterruptedException {
	  
	  FirefoxDriver d = new FirefoxDriver();
	  d.manage().window().maximize();
	  d.get("http://www.cleartrip.com/");
	  
	  d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  d.findElement(By.id("OneWay"));
	  d.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	  d.findElement(By.id("ToTag")).sendKeys("Bhavnagar, IN - Bhavnagar (BHU)");
	  d.findElement(By.xpath(".//*[@id='DepartDate']")).click();
	  
	  //user defined table
	  //user defined date and assigning it to the string and afterwards convert it to integer
	  String doj="10/05/2017";
	  //split date using split method by special character
	  String[] a=doj.split("/");
	  //user defined months(we need output as 05 in string ie., May month)
	  String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
	  //converting string doj into integer and assigning variable to it ie., x. Now is having splitdate(1)=05;
	  int x=Integer.parseInt(a[1]);
	  //here months[x-1] means here x is holding 05 then x-1= 5-1 = 4(May Month)....
	  String month=months[x-1];
	  String day=a[0];
	  String year=a[2];
	  
	  
	  //identify the year in the calender
	  String calyear=d.findElement(By.className("ui-datepicker-year")).getText();
	  //to get the 2017 year we use while loop(we dont know the exact iteration so we use while)
	  while(!calyear.equals(year))
	  {
		  //click the arrow in the calender
		  d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
		  //after clicking get the calender year text
		  calyear=d.findElement(By.className("ui-datepicker-year")).getText();
		  
	  }
	  
	  //identify the month in the calender
	  String calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
	  while(!calmonth.equals(month))
	  {
		  //click on the arrow in the calender
		  d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
		  //after clicking get the month text
		  calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
		  
	  }
	  
	  //date picker table ie., calender
	  //get the table
	  WebElement table=d.findElement(By.xpath("html/body/div[1]"));
	  //get the rows
	  List<WebElement> rows=table.findElements(By.tagName("tr"));
	  //size of the rows
	  System.out.println("Size of the rows : "+rows.size());
	  //loop for rows
	  for(int i=0;i<rows.size();i++)
	  {
		  //from row get number of columns
		  List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		  //loop for columns in a rows(i)
		  for(int j=0;j<cols.size();j++)
		  {
			  if(cols.get(j).getText().equals(day))
			  {
				  //click matching date 
				  cols.get(j).click();
				  break;
			  }
		  }
	  }
	  
	  
	  d.findElement(By.id("SearchBtn")).click();
	  Sleeper.sleepTightInSeconds(3000);
	  d.close();
  }

}

