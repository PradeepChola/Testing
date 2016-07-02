package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Total_Links_In_URL {

	public static void main(String[] args) {
		ProfilesIni pi = new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver driver = new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/");
		
		List<WebElement> totallinks= driver.findElements(By.tagName("a"));
		System.out.println("Total Links are :"+ totallinks.size());
		
		for(int i=0;i<totallinks.size();i++)
		{
			String str=totallinks.get(i).getText();
			System.out.println(str);
		}
		
		driver.close();
		
		
		
		
	}

}
