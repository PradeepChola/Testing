package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	

	public static void main(String[] args) throws Throwable {
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("Selenium");
		WebDriver d=new FirefoxDriver(fp);
		Thread.sleep(3000);
		d.get("http://www.spicejet.com/");
		Thread.sleep(3000);
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		d.findElement(By.className("select_CTXT")).click();
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		d.findElement(By.className("ui-datepicker-trigger")).click();
		d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		//d.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		new Select(d.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option[7]"))).selectByVisibleText("7 Adults");
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		d.close();
		

	}

}
