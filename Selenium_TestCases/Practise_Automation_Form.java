package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class Practise_Automation_Form {

	public static void main(String[] args) throws Exception {
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver driver= new FirefoxDriver(fp);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Pradeep");
		driver.findElement(By.name("lastname")).sendKeys("Chola");
		
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")).click();
		driver.findElement(By.id("profession-1")).click();
		
		//Upload a file 
		WebElement upload=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/fieldset/div[5]/input"));
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\Pradeep C\\Desktop\\TestCase Templete Fileds.txt");
		//select from the list		
		new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Australia");
		
		Thread.sleep(3000);
		driver.close();
	}

}
