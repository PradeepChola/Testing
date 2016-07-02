package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_value_selecting_or_not {

	public static void main(String[] args) {
		/*
		 	1.open webbrowser using webdriver
		 	2.maximize window
		 	3.get url http://newtours.demoaut.com/
		 	4.click on register
		 	5.identify dropdown element
		 	6.print size of links
		 	7.get the linktext of all links 
		 	8.check whether it is selecting or not
		 */
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement dropdown=driver.findElement(By.name("country"));
		List<WebElement> linklists=dropdown.findElements(By.tagName("option"));
		
		System.out.println("Total links: "+ linklists.size());
		
		for(int i=0;i<linklists.size();i++)
		{
			String linktext=linklists.get(i).getText();
			linklists.get(i).click();
			
			if(linklists.get(i).isSelected())
			{
				System.out.println(linktext+ "---------->Element is selected");
			}
			else
			{
				System.out.println(linktext+ "---------->Element is not selected");
			}
			
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
