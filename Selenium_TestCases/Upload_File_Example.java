package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_File_Example {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver(); //get the browser
		driver.manage().window().maximize(); //it will maximize window
		driver.get("D:\\upload.html");		//it will get url of the webpage
		WebElement upload=driver.findElement(By.name("uploadsubmit"));	//
		upload.sendKeys("C:\\Users\\Pradeep C\\Desktop\\TestCase Templete Fileds.txt");
		driver.findElement(By.xpath("html/body/form/input[2]")).click();
		
	}

}
