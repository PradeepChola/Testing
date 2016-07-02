package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_on_Visibile_Links {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		//get the visible links from the webpage using locator
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links in the webpage: "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//get clicked on visible links
			if(!links.get(i).getText().isEmpty()) //if links text is not empty then print those linktext
			{
				links.get(i).click();	//getting the links
				String str=driver.getCurrentUrl();	//getting the current url of the page
				System.out.println(str);			//printing the current url
				driver.navigate().back();			//navigating back
				links=driver.findElements(By.tagName("a"));	//finding all link text
				
			}
		}
		
		driver.close();
	}

}
