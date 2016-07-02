package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invisible_Links_Identification {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		java.util.List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+links.size());
		
		int count=0;
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty()) //it will print all visible links
			{
				count++; //count the visible links
			}
		}
		System.out.println("Visible links are :"+ count);
		System.out.println("Invisible links are :"+ (links.size()-count));
		driver.close();
	}

}
