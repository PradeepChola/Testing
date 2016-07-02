package testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mulitple_ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//get the link text first
			String linkname=links.get(i).getText();
			//link on that (First...) link
			links.get(i).click();
			//Take the screenshot of the link and sooon
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("D:\\ScreenShots_Webdriver\\"+linkname+".jpg"));
			//navigate back and click on another link to take screenshot
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			
		}
		
		driver.close();

	}

}
