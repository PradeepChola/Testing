package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identify_Block_Links_Example2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Get the url 
		driver.get("https://www.onlinesbh.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Links :"+ links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String str=links.get(i).getText();
			System.out.println(str);
			
		}

	}

}
