package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinks_GetCurrentUrl_Navigateback {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> links=driver.findElements(By.tagName("a")); //fetching the links from app and store values in webelement (links)
		System.out.println("Total Links: "+links.size()); //printing the total links available in application
		
		for(int i=0;i<links.size();i++)
		{
			links.get(i).getText();   					//fetching the link text
			String str= driver.getCurrentUrl(); 		//fetching the current url of each link (linktext)
			System.out.println(str);					//printing the link text of currrent url
			driver.navigate().back();					//after printing current url and navigating back
			//Identifies links again
			links=driver.findElements(By.tagName("a")); //after navigating back it will find the links by tagname locator and process will continue till loop comes out
		}
		driver.close();

	}

}
