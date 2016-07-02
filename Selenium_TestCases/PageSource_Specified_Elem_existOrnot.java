package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource_Specified_Elem_existOrnot {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String webpagesource=driver.getPageSource();
		System.out.println(webpagesource);
		
		if(webpagesource.contains("Pradeep"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		driver.close();
	}

}
