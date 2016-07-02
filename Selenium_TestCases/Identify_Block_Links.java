package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Identify_Block_Links {

	public static void main(String[] args) {
		ProfilesIni pi= new ProfilesIni();// Creating the profile object
		FirefoxProfile fp=pi.getProfile("Selenium");// creating the firefoxprofile object
		WebDriver driver = new FirefoxDriver(fp); //getting the firefox profile browser
		driver.manage().window().maximize(); //maximizing the browser window
		
		driver.get("http://www.bing.com"); //get the url of the website
		
		WebElement block= driver.findElement(By.id("sc_hdu")); //finding the block with id and storing values in blk using webelement
		
		List<WebElement> blocklinks=block.findElements(By.tagName("a")); ////After finding the block then find the links using tagname locator
		System.out.println("Size "+ blocklinks.size()); //printing the how many links are available in website
		
		//fetching all the links and print the links using for loop
		for(int i=0;i<blocklinks.size();i++)
		{
			String str=blocklinks.get(i).getText();
			System.out.println(str);
			
		}
		
		driver.close();

	}

}
