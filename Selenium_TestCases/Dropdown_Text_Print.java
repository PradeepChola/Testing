package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Text_Print {

	public static void main(String[] args) {
		/*
		 	1.get firefox driver using webdriver
			2.window maximize
			3.get url http://www.amazon.in/
			4.identify the dropdown
			5.find the dropdown links and print the link size
			6.print the dropdown links
		 */
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> links=dropdown.findElements(By.tagName("option"));
		
		System.out.println("Total links : "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String getlinks=links.get(i).getText();
			System.out.println("Printing the link text "+ getlinks);
			
			//System.out.println(links.get(i).getText());
			
		}
		driver.close();
	}

}
 